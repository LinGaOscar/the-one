package com.oscalin.generics.theone.entity.service;

import com.oscalin.generics.theone.entity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    User findUser(String id);
    List<User> findAll();
    void deleteUser(String id);

}
