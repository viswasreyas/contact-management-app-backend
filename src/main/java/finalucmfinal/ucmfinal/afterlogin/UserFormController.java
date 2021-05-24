package finalucmfinal.ucmfinal.afterlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "userForm")
public class UserFormController {

    private final UserFormService userFormService;

    @Autowired
    public UserFormController(UserFormService userFormService) {
        this.userFormService = userFormService;
    }

    @GetMapping
    public List<UserForm> getUserForm(){
        return  userFormService.getUserForm();

     }

     @PostMapping
     public void addUserDetails(@RequestBody UserForm userForm){
        userFormService.addNewUser(userForm);
     }

     @DeleteMapping(path ="{UserFormId}" )
     public void deleteUser(@PathVariable("UserFormId")Long UserFormId){
        userFormService.deleteUser(UserFormId);
     }

     @PutMapping(path = "{UserFormId}")
     public void updateUserDetails(
             @PathVariable("UserFormId") Long UserFormId,
             @RequestParam(required = false) String fullName,
             @RequestParam(required = false) String address,
             @RequestParam(required = false) String email,
             @RequestParam(required = false) String phone){
        userFormService.updateUserDetails(UserFormId, fullName, address, email,phone);
     }



}
