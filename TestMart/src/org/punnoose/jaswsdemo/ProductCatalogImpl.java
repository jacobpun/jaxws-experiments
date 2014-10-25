package org.punnoose.jaswsdemo;

import java.util.List;

import javax.jws.WebService;

import org.punnoose.jaswsdemo.model.Product;
import org.punnoose.jaswsdemo.service.ProductService;

@WebService(endpointInterface="org.punnoose.jaswsdemo.ProductCatalog",
portName = "TestMartCatalogPort", 
serviceName = "TestMartCatalogService")
public class ProductCatalogImpl implements ProductCatalog {

	private static final ProductService PRODUCT_SERVICE = new ProductService();

	@Override
	public List<String> getProductCategories() {
		return PRODUCT_SERVICE.getProductCategories();
	}

	@Override
	public boolean addProduct(String category,String product) {
		return PRODUCT_SERVICE.addProduct(category, product);
	}

	@Override
	public List<Product> getProducsv2(String category) {
		return PRODUCT_SERVICE.getProductsv2(category);
	}

	@Override
	public boolean addProductv2(String category,Product product) {
		return PRODUCT_SERVICE.addProductv2(category, product);
	}
}