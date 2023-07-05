package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class RequestUser {
    @Size(min = 2, message = "email less than two characters")
    @NotNull(message = "email can not null")
    private String email;
    @Size(min = 2, message = "name less than two characters")
    @NotNull(message = "name can not null")
    private String name;
    @Size(min = 8, message = "pwd less than two characters")
    @NotNull(message = "pwd can not null")
    private String pwd;
}
