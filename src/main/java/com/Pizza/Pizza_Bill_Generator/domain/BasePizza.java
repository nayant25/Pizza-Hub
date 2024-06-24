package com.Pizza.Pizza_Bill_Generator.domain;

public class BasePizza {
	
    private Long id;
    private String type;
    private String variant;
    private int basePrice;
	
    public BasePizza() {
		// TODO Auto-generated constructor stub
	}
    
    public BasePizza(Long id, String type, String variant, int basePrice) {
		super();
		this.id = id;
		this.type = type;
		this.variant = variant;
		this.basePrice = basePrice;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
