package com.pdt.service_with_advices.validator;

import com.pdt.service_with_advices.model.UserDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserPasswordValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return UserDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirm", "valid.passwordConfirm");

        UserDto dto = (UserDto) o;
        if (!dto.getPassword().equals(dto.getPasswordConfirm())) {
            errors.rejectValue("passwordConfirm", "valid.passwordConfirmDiff");
        }

        String username = dto.getUsername();
        if (username.length() < 3 || username.length() > 25) {
            errors.rejectValue("username", "valid.usernameLength");
        }
    }
}
