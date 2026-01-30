package com.example.CheckEnv;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepo repo;

    public UserController(UserRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }
     @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
