package com.example.keycloakwithspringboot.dto;

import lombok.Data;

@Data
public class LoginResponseDto {
    private String access_token;
    private String refresh_token;
    private String expires_in;
    private String refresh_expires_in;
    private String token_type;
}
