package com.daniel.recipes.mapper;

import com.daniel.recipes.dto.UserDTO;
import com.daniel.recipes.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    List<UserDTO> toDTOList(List<User> users);
}
