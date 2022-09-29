package com.example.keycloakwithspringboot.controller;

import com.example.keycloakwithspringboot.dto.LoginRequestDto;
import com.example.keycloakwithspringboot.dto.LoginResponseDto;
import com.example.keycloakwithspringboot.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @PostMapping("login")
    public ResponseEntity<LoginResponseDto> login (HttpServletRequest request,
                                                   @RequestBody LoginRequestDto loginRequest) throws Exception {
        log.info("Executing login");

        ResponseEntity<LoginResponseDto> response = null;
        response = loginService.login(loginRequest);

        return response;
    }
}
