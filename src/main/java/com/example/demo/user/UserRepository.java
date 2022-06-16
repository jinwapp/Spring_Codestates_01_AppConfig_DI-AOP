// UserRepository.java

package com.example.demo.user;

public interface UserRepository {

    void saveUser(User user);       //??
    User findByUserId(Long userId); //??
}
