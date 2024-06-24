package com.Pizza.Pizza_Bill_Generator.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pizza.Pizza_Bill_Generator.domain.Order;
import com.Pizza.Pizza_Bill_Generator.domain.User;
import com.Pizza.Pizza_Bill_Generator.repository.OrderRepository;
import com.Pizza.Pizza_Bill_Generator.repository.UserRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PizzaService pizzaService;

    public void placeOrder(Order order, User user) {
        order.setOrderDate(new Date());
        int totalPrice = pizzaService.calculateTotalPrice(
                order.getPizzaType(), 
                order.getPizzaVariant(), 
                order.isExtraCheese(), 
                order.isExtraToppings(), 
                order.isTakeaway()
        );
        order.setTotalPrice(totalPrice);
        userRepository.save(user);
        order.setUser(user);
        orderRepository.save(order);
    }
}
