package com.Pizza.Pizza_Bill_Generator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pizza.Pizza_Bill_Generator.Service.OrderService;
import com.Pizza.Pizza_Bill_Generator.domain.Order;
import com.Pizza.Pizza_Bill_Generator.domain.User;

@Controller
public class PizzaOrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order")
	public String showOrderForm(Model model) {
		User user = new User();
		model.addAttribute("order", new Order());
        model.addAttribute("user",  user);
        return "Order_Form";
	}
	
	@PostMapping("/order")
    public String placeOrder(@ModelAttribute Order order, @ModelAttribute User user, Model model) {
		order.setUser(user); // Set the user object to the order
        orderService.placeOrder(order, user); // Assuming placeOrder method in service only needs order
        model.addAttribute("order", order);
        return "Order_Conformation";
    }
}
