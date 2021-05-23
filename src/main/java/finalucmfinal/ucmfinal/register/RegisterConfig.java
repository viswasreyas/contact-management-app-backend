package finalucmfinal.ucmfinal.register;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RegisterConfig {

    @Bean
    CommandLineRunner commandLineRunner(RegisterRepository repository){
        return args -> {
            Register admin = new Register(
                    1L,
                    "admin",
                    "abcd123"

            );
            repository.saveAll(
                    List.of(admin)
            );
        };
    }
}
