package finalucmfinal.ucmfinal.afterlogin;

import javax.persistence.*;

@Entity
@Table(name = "userForm")
public class UserForm {

    @Id
    @SequenceGenerator(
            name = "userForm_sequence",
            sequenceName = "userForm_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userForm_sequence"
    )
    private Long id;
    private String fullName;
    private String address;
    private String email;
    private String phone;

    public UserForm() {
    }

    public UserForm(Long id, String fullName, String address, String email, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public UserForm(String fullName, String address, String email, String  phone) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
