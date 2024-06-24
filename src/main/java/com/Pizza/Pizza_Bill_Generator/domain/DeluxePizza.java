package com.Pizza.Pizza_Bill_Generator.domain;

public class DeluxePizza {

    private Long id;
    private String variant;
    private int basePrice;

    public DeluxePizza() {
		// TODO Auto-generated constructor stub
	}

	public DeluxePizza(Long id, String variant, int basePrice) {
		super();
		this.id = id;
		this.variant = variant;
		this.basePrice = basePrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}   
}

