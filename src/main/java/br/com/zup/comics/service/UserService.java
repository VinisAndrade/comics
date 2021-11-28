package br.com.zup.comics.service;

import br.com.zup.comics.model.User;
import br.com.zup.comics.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email, String cpf, LocalDate birthDate){
        User user = new User(name, email, cpf, birthDate);
        return userRepository.saveAndFlush(user);
    }

    public List<User> findUsers(){
        return userRepository.findAll();
    }

}
