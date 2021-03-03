package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author simple
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("create-user")
    public String createUser(){
        User user = new User();
        user.setId(1);
        user.setAge(10);
        user.setName("xxx");
        userService.insertUser(user);
        return "ok";
    }
}
