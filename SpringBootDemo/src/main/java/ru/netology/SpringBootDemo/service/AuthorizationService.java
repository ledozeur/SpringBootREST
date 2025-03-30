package ru.netology.SpringBootDemo.service;

import org.springframework.stereotype.Service;
import ru.netology.SpringBootDemo.Authorities;
import ru.netology.SpringBootDemo.exception.InvalidCredentials;
import ru.netology.SpringBootDemo.exception.UnauthorizedUser;
import ru.netology.SpringBootDemo.repository.User;
import ru.netology.SpringBootDemo.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
    private final UserRepository userRepository;

public AuthorizationService(UserRepository userRepository){
    this.userRepository = userRepository;
}

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getUser()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
