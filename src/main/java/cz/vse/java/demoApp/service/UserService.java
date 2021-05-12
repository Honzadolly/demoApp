package cz.vse.java.demoApp.service;

import cz.vse.java.demoApp.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void storeUser(User user);


}
