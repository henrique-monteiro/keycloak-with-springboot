package com.example.keycloakwithspringboot.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String username;
    private String password;
}
