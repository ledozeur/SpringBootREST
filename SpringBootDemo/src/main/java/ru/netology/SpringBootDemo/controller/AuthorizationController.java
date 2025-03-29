package ru.netology.SpringBootDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringBootDemo.Authorities;
import ru.netology.SpringBootDemo.exception.InvalidCredentials;
import ru.netology.SpringBootDemo.exception.UnauthorizedUser;
import ru.netology.SpringBootDemo.service.AuthorizationService;
import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }


}
