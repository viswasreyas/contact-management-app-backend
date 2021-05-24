package finalucmfinal.ucmfinal.afterlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserFormService {

    private final UserFormRepository userFormRepository;

    @Autowired
    public UserFormService(UserFormRepository userFormRepository) {
        this.userFormRepository = userFormRepository;
    }

    public List<UserForm> getUserForm(){
        return userFormRepository.findAll();
    }

    public void addNewUser(UserForm userForm) {
        userFormRepository.save(userForm);
    }

    public void deleteUser(Long UserFormId) {

        boolean exists = userFormRepository.existsById(UserFormId);
        if(!exists){
            throw new IllegalStateException("User with id"+" "+ UserFormId +" "+ "does not exist");
        }
        userFormRepository.deleteById(UserFormId);
    }

    @Transactional
    public void updateUserDetails(Long userFormId,
                                  String fullName,
                                  String address,
                                  String email,
                                  String phone) {
        UserForm userForm = userFormRepository.findById(userFormId)
                .orElseThrow(() -> new IllegalStateException(
                        "user with id"+ " "+ userFormId +" "+"does not exist"
                ));
        if (fullName != null && fullName.length() > 0){
            userForm.setFullName(fullName);
        }
        if (address != null && address.length() > 0){
            userForm.setAddress(address);
        }
        if (email != null && email.length() > 0){
            userForm.setEmail(email);
        }
        if (phone != null && phone.length() > 0){
            userForm.setPhone(phone);
        }

    }
}
