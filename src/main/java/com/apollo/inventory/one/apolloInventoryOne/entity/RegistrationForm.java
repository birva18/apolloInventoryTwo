package com.apollo.inventory.one.apolloInventoryOne.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RegistrationForm {

    private  String username;
    private  String password;

//
//    public Users toUser(PasswordEncoder passwordEncoder)
//    {
//        return new Users(username,passwordEncoder.encode(password));
//    }

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


}
