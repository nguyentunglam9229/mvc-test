package com.example.mvc.resource;

import com.example.mvc.model.User;
import com.example.mvc.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    private final UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "")
    public List<User> getAll() {
        return userRepository.getAll();
    }

}
