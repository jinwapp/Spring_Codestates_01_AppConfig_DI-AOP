// UserService.java

package com.example.demo.user;

public interface UserService {

    void signup(User user);
    User findUser (Long userId);
}
