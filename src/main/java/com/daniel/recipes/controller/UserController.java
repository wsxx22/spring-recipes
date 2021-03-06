package com.daniel.recipes.controller;

import com.daniel.recipes.dto.UserDTO;
import com.daniel.recipes.mapper.UserMapper;
import com.daniel.recipes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService;
    private UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }


    @GetMapping("/all")
    public List<UserDTO> getAll() {
        return userMapper.toDTOList(userService.findAll());
    }

}
