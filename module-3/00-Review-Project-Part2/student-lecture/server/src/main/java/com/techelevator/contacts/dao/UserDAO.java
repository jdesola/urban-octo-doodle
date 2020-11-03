package com.techelevator.contacts.dao;

import java.util.List;

import com.techelevator.contacts.model.User;

public interface UserDAO {

    List<User> findAll();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);
}
