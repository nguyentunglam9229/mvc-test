package com.example.mvc.repository.impl;

import com.example.mvc.model.User;
import com.example.mvc.repository.UserRepository;
import com.example.mvc.repository.mongo.UserMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserMongoRepository userMongoRepository;

    public UserRepositoryImpl(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @Override
    public List<User> getAll() {
        return userMongoRepository.findAll();
    }
}
