package ru.netology.SpringBootDemo.repository;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 0, max = 20)
    private String name;
    @Min(2)
    private String password;


    public User() {
    }


}
