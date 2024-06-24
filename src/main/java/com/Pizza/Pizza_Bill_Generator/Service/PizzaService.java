package com.Pizza.Pizza_Bill_Generator.Service;

import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    public int calculateBasePrice(String pizzaType, String pizzaVariant) {
        int basePrice = 0;
        if ("base".equalsIgnoreCase(pizzaType)) {
            if ("veg".equalsIgnoreCase(pizzaVariant)) {
                basePrice = 300;
            } else if ("nonveg".equalsIgnoreCase(pizzaVariant)) {
                basePrice = 400;
            }
        } else if ("deluxe".equalsIgnoreCase(pizzaType)) {
            if ("veg".equalsIgnoreCase(pizzaVariant)) {
                basePrice = 450;
            } else if ("nonveg".equalsIgnoreCase(pizzaVariant)) {
                basePrice = 550;
            }
        }
        return basePrice;
    }

    public int calculateAddonsPrice(boolean extraCheese, boolean extraToppings, boolean takeaway) {
        int addonsPrice = 0;
        if (extraCheese) {
            addonsPrice += 100;
        }
        if (extraToppings) {
            addonsPrice += 150;
        }
        if (takeaway) {
            addonsPrice += 20;
        }
        return addonsPrice;
    }

    public int calculateTotalPrice(String pizzaType, String pizzaVariant, boolean extraCheese, boolean extraToppings, boolean takeaway) {
        int basePrice = calculateBasePrice(pizzaType, pizzaVariant);
        int addonsPrice = calculateAddonsPrice(extraCheese, extraToppings, takeaway);

        // Deluxe pizzas already include extra cheese and extra toppings
        if ("deluxe".equalsIgnoreCase(pizzaType)) {
            addonsPrice = takeaway ? 20 : 0;
        }

        return basePrice + addonsPrice;
    }
}
