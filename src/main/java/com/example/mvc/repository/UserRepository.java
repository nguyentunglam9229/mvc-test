package com.example.mvc.repository;

import com.example.mvc.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
}
