package finalucmfinal.ucmfinal.afterlogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFormRepository extends JpaRepository<UserForm, Long> {
}
