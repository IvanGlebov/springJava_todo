package com.example.todo;

import com.example.todo.model.UserInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/users")
    List<UserInstance> all() {
        return repository.findAll();
    }
}
