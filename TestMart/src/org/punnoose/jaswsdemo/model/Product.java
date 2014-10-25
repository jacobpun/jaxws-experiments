package org.punnoose.jaswsdemo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = { "sku", "name", "price" })
public class Product {
	private String name;
	private String sku;
	private double price;

	public Product() {
		super();
	}

	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name = "Name", defaultValue="unknown")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "SKU", defaultValue="unknown")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name = "CostInUSD", defaultValue="0.0")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
}