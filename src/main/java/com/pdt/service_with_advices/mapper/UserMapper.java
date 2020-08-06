package com.pdt.service_with_advices.mapper;

import com.pdt.service_with_advices.entity.User;
import com.pdt.service_with_advices.model.UserDto;

public class UserMapper {
    public static UserDto mapEntityToDto(User user) {

        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());


        return dto;
    }
}
