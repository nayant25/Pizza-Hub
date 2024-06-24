package com.Pizza.Pizza_Bill_Generator.domain;


public class Addon {

    private Long id;
    private String name;
    private int price;
    
    public Addon() {
		// TODO Auto-generated constructor stub
	}
    
    public Addon(long v1, String v2, int v3) {
    	id = v1;
    	name = v2;
    	price = v3;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

    
}