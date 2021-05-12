package cz.vse.java.demoApp.service;

import cz.vse.java.demoApp.model.User;
import cz.vse.java.demoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public void storeUser(@RequestBody User user){
        userRepository.saveAndFlush(user);
    }
}
