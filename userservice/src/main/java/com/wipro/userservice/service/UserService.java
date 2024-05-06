package com.wipro.userservice.service;

import com.wipro.userservice.entity.User;
import java.util.List;

public interface UserService {

    User addUser(User user);

    User updateUser(User user);

    void removeUser(int userId);

    List<User> getAllUsers();

    User getUserById(int userId);
}
