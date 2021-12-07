package com.example.demo.repository;

import com.example.demo.Authorities;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Component
public class UserRepository {

    List<User> userRepository;

    public List<Authorities> getUserAuthorities(String login, String password) {

        for (User user : userRepository) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }

    public UserRepository() {
        userRepository = Arrays.asList(new User("Dima", "00202"),new User("Kesha", "2234"));
    }
}