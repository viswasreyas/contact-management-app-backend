package finalucmfinal.ucmfinal.register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepository
        extends JpaRepository<Register, Long> {

    @Query(value = "SELECT * FROM register WHERE username = ?1", nativeQuery = true)
    Optional<Register> findRegisterByName(String username);
}
