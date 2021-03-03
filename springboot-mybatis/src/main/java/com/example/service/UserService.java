package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author simple
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insertUser(user);
    }
}
