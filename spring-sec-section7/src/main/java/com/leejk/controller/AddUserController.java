package com.leejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.*;

/**
 * UserDetailsManager를 이용해서 직접 메모리에 유저 등록이 가능한지 확인한 클래스
 */
//@RestController
//public class AddUserController {
//
//    @Autowired
//    private final InMemoryUserDetailsManager userDetailsManager;
//
//    public AddUserController(InMemoryUserDetailsManager userDetailsManager) {
//        this.userDetailsManager = userDetailsManager;
//    }
//
//    @PostMapping("/user")
//    public String addUser(@RequestParam String username, @RequestParam String password) {
//        UserDetails userDetails = User.withUsername(username).password(password).authorities("read").build();
//        userDetailsManager.createUser(userDetails);
//
//        return "ok";
//    }
//
//}
