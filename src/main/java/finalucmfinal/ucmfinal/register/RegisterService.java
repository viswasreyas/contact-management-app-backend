package finalucmfinal.ucmfinal.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {

    private final RegisterRepository registerRepository;

    @Autowired
    public RegisterService(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public List<Register> getRegistered(){
        return registerRepository.findAll();
    }

    public void addNewUser(Register register) {

        Optional<Register> registerOptional = registerRepository
                .findRegisterByName(register.getUsername());
        if(registerOptional.isPresent()){
            throw new IllegalStateException("username taken");
        }
        registerRepository.save(register);
    }
}
