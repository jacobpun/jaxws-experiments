package org.punnoose.jaswsdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.punnoose.jaswsdemo.model.Product;

public class ProductService {

	private List<Product> booksList;
	private List<Product> musicList;
	private List<Product> moviesList;

	public ProductService() {
		super();

		booksList = new ArrayList<Product>();
		musicList = new ArrayList<Product>();
		moviesList = new ArrayList<Product>();

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
		@SuppressWarnings("serial")
		List<String> productCategories = new ArrayList<String>() {
			{
				add("book");
				add("music");
				add("movies");
			}
		};
		return productCategories;
	}

	public List<Product> getProducts(String category)
			throws InvalidInputException {
		switch (category.toLowerCase()) {
		case "book":
			return booksList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		default:
			throw new InvalidInputException("Invalid_Input_CM003", category
					+ " is not valid");
		}
	}

	public boolean addProduct(String category, String product)
			throws InvalidInputException {
		double DEFAUT_PRICE = 0.0;
		return addProductv2(category, new Product(product, product,
				DEFAUT_PRICE));
	}

	public boolean addProductv2(String category, Product product)
			throws InvalidInputException {
		List<Product> productList = getProducts(category);
		productList.add(product);
		return true;
	}
}