package com.daniel.recipes.service;

import com.daniel.recipes.dto.UserDTO;
import com.daniel.recipes.entity.User;
import com.daniel.recipes.mapper.UserMapper;
import com.daniel.recipes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

//    private UserDTO convertToDTO(User user) {
//        return new UserDTO(user.getId(), user.getUsername());
//    }
//
//    private List<UserDTO> convertToDTO(List<User> users) {
//        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
//    }
}
