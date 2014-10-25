package org.punnoose.jaswsdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.punnoose.jaswsdemo.model.Product;

public class ProductService {

	private List<Product> booksList;
	private List<Product> musicList;
	private List<Product> moviesList;
	private List<Product> defaultList;

	public ProductService() {
		super();
		booksList = new ArrayList<Product>();
		musicList = new ArrayList<Product>();
		moviesList = new ArrayList<Product>();
		defaultList = new ArrayList<Product>();

		booksList.addAll(Arrays.asList(new Product[] {
				new Product("book1", "book1", 10.0),
				new Product("book2", "book2", 10.0),
				new Product("book2", "book2", 10.0) }));

		musicList.addAll(Arrays.asList(new Product[] {
				new Product("music1", "music1", 10.0),
				new Product("music2", "music2", 10.0),
				new Product("music2", "music2", 10.0) }));
		moviesList.addAll(Arrays.asList(new Product[] {
				new Product("movies1", "movies1", 10.0),
				new Product("movies2", "movies2", 10.0),
				new Product("movies2", "movies2", 10.0) }));
	}

	public List<String> getProductCategories() {
		List<String> productCategories = new ArrayList<String>() {
			{
				add("book");
				add("music");
				add("movies");
			}
		};
		return productCategories;
	}



	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "book":
			booksList.add(new Product(product, product, 0.0));
			return true;
		case "music":
			musicList.add(new Product(product, product, 0.0));
			return true;
		case "movies":
			moviesList.add(new Product(product, product, 0.0));
			return true;
		default:
			return false;
		}
	}

	public List<Product> getProductsv2(String category) {
		switch (category.toLowerCase()) {
		case "book":
			return booksList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		default:
			return defaultList;
		}
	}

	public boolean addProductv2(String category, Product product) {
		List<Product> productList = getProductsv2(category);
		productList.add(product);
		return true;
	}
}