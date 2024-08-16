package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Collection;
import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    void saveUserWithRole(User user, Collection<Long> roleIds);

    User getUserById(Long id);

    void deleteUserById(Long id);

    User getUserByUsername(String username);
}
