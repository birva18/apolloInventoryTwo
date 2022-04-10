package com.apollo.inventory.one.apolloInventoryOne.controller;

import com.apollo.inventory.one.apolloInventoryOne.entity.RegistrationForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class RegistrationController {

//private UserRepository userRepository;

private PasswordEncoder passwordEncoder;


//    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }

    @GetMapping("/register")
    public String registerForm()
    {
        return "registration";
    }

//    @PostMapping("/register")
//    public String processRegistration(RegistrationForm registrationForm)
//    {
//        Users u=registrationForm.toUser(passwordEncoder);
//        userRepository.save(u);
//        return "redirect:/login";
//    }

    @GetMapping
    public String login()
    {
        return "login";
    }

    @GetMapping("/requests")
    public String requests()
    {
        return "requests";
    }
}
