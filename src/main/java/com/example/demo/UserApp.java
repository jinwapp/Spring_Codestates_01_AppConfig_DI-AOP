//UserApp.java

package com.example.demo;

import com.example.demo.user.User;
import com.example.demo.user.UserGrade;
import com.example.demo.user.UserService;
import com.example.demo.user.UserServiceImpl;


public class UserApp {

    public static void main(String[] args) {

        // 기존코드 UserService userService = new UserServiceImpl();
        // 변경코드 아래 두줄
        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        User user = new User(0L, "kimcoding", UserGrade.GRADE_2);
        userService.signup(user);

        User currentUser = userService.findUser(0L);
        System.out.println("signup user : " + user.getName());
        System.out.println("current user : " + currentUser.getName());

        if(user.getName().equals(currentUser.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
