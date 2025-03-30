package ru.netology.SpringBootDemo.repository;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 0, max = 20)
    private String user;
    @Min(2)
    private String password;


    public User(String user, String password) {
  this.password = password;
  this.user = user;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
