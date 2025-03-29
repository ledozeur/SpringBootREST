package ru.netology.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.SpringBootDemo.repository.User;
import ru.netology.SpringBootDemo.repository.UserRepository;
import ru.netology.SpringBootDemo.service.AuthorizationService;


@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);


    }




}

