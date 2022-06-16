// OrderApp.java

package com.example.demo;

import com.example.demo.discount.RateDiscountInfo;
import com.example.demo.order.Order;
import com.example.demo.order.OrderService;
import com.example.demo.user.User;
import com.example.demo.user.UserGrade;
import com.example.demo.user.UserService;

public class OrderApp {

    public static void main(String[] args) {

       AppConfig appconfig = new AppConfig();
       UserService userService = appconfig.userService();
       OrderService orderService = appconfig.orderService();

       Long userId = 0L;
       User user = new User(userId, "kimlucky", UserGrade.GRADE_1);
       userService.signup(user);

       Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order =" + order);
    }
}
