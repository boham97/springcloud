package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "Email can not be null")
    @Size(min = 2, message = "less than 2")
    @Email
    private String email;
    @NotNull(message = "pwd can not be null")
    @Size(min = 8, message = "less than 8")
    private String password;
}
