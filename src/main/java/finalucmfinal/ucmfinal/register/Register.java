package finalucmfinal.ucmfinal.register;

import javax.persistence.*;

@Entity
@Table(name = "register")
public class Register {

    @Id
    @SequenceGenerator(
            name = "register_sequence",
            sequenceName = "register_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "register_sequence"
    )
    private Long id;
    private String username;
    private String password;

    public Register() {
    }

    public Register(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Register(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
