package com.example.springprojeto.projetointegrador4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/register")
    public User Register(@RequestBody User user) {
        User existsUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (existsUser != null) {
            throw new Error("Este usuário já existe!");
        } else {
            return userRepository.save(user);
        }
    }

    @RequestMapping("/login")
    public User Login(@RequestBody User user) {
        User oldUser = userRepository.findByEmailAndPassword(user.email, user.password);
        if (oldUser == null) {
            throw new Error("Este usuário não existe");
        } else {
            return oldUser;
        }
    }

}
