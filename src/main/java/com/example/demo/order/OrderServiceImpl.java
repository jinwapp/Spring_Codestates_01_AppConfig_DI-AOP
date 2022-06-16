//OrderServiceImpl.java

package com.example.demo.order;

import com.example.demo.discount.DiscountInfo;
import com.example.demo.discount.RateDiscountInfo;
import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserRepositoryImpl;

public class OrderServiceImpl implements OrderService {


//    private final UserRepository userRepository = new UserRepositoryImpl();
//    private final DiscountInfo discountInfo = new RateDiscountInfo();

    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo){
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String itemName, int itemPrice){
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }

}
