package ru.netology.SpringBootDemo.repository;
import org.springframework.stereotype.Repository;
import ru.netology.SpringBootDemo.Authorities;

import java.util.ArrayList;
import java.util.List;
import static ru.netology.SpringBootDemo.Authorities.*;


@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(User user) {
        List<Authorities> authoritiesList = new ArrayList<>();
        if (user.getUser().equals("Ivan") && user.getPassword().equals("1234")) {
            authoritiesList.add(READ);

        }
        return authoritiesList;
    }
}
