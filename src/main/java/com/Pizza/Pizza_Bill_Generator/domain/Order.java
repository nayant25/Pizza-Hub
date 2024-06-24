package com.Pizza.Pizza_Bill_Generator.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "extra_cheese")
    private boolean extraCheese;

    @Column(name = "extra_toppings")
    private boolean extraToppings;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "pizza_type")
    private String pizzaType;

    @Column(name = "pizza_variant")
    private String pizzaVariant;

    @Column(name = "takeaway")
    private boolean takeaway;

    @Column(name = "total_price")
    private int totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, String pizzaType, String pizzaVariant, boolean extraCheese, boolean extraToppings,
			boolean takeaway, int totalPrice, Date orderDate, User user) {
		super();
		this.id = id;
		this.pizzaType = pizzaType;
		this.pizzaVariant = pizzaVariant;
		this.extraCheese = extraCheese;
		this.extraToppings = extraToppings;
		this.takeaway = takeaway;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getPizzaVariant() {
		return pizzaVariant;
	}

	public void setPizzaVariant(String pizzaVariant) {
		this.pizzaVariant = pizzaVariant;
	}

	public boolean isExtraCheese() {
		return extraCheese;
	}

	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}

	public boolean isExtraToppings() {
		return extraToppings;
	}

	public void setExtraToppings(boolean extraToppings) {
		this.extraToppings = extraToppings;
	}

	public boolean isTakeaway() {
		return takeaway;
	}

	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
}