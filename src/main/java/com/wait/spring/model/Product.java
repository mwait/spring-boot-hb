package com.wait.spring.model;

public class Product {
private String description;

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Product(String description) {
	super();
	this.description = description;
}


}
