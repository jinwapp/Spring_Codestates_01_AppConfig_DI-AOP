//App Config
// 애플리케이션의 전체 동작을 구성하기 위해 사용됩니다.

// 다음 아래에서 어떤 구현 객체를 생성하고 연결할지 책임을 갖는 설정 클래스를 만들게 된다.
package com.example.demo;

import com.example.demo.discount.DiscountInfo;
import com.example.demo.discount.RateDiscountInfo;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderServiceImpl;
import com.example.demo.discount.CurrentDiscountInfo;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserRepositoryImpl;
import com.example.demo.user.UserService;
import com.example.demo.user.UserServiceImpl;



public class AppConfig {
    public UserService userService(){
        return new UserServiceImpl (userRepository());
    }

    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(userRepository(), discountInfo());
    }

    public DiscountInfo discountInfo(){
        return new RateDiscountInfo();
    }

}
