package com.pdt.service_with_advices.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class UserDto {
    private String username;
    private String email;
    private String password;
    private String passwordConfirm;
}
