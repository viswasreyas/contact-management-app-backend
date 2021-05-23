package finalucmfinal.ucmfinal.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "registered")
public class RegisterController {

    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping
    public List<Register> getRegistered(){
        return registerService.getRegistered();
    }

    @PostMapping
    public void registerNewUser(@RequestBody Register register){
        registerService.addNewUser(register);
    }
}
