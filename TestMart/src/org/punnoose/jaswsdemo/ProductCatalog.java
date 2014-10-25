package org.punnoose.jaswsdemo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.punnoose.jaswsdemo.model.Product;

@WebService(name = "TestMartCatalog", 
targetNamespace = "http://testmart.punnoose.org")
@SOAPBinding(style = Style.DOCUMENT)
public interface ProductCatalog {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public abstract List<String> getProductCategories();

	public abstract boolean addProduct(String category, String product);

	public abstract List<Product> getProducsv2(String category);

	public abstract boolean addProductv2(String category, Product product);

}