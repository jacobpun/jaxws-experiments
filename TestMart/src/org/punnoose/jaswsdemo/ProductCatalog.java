package org.punnoose.jaswsdemo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.punnoose.jaswsdemo.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://testmart.punnoose.org")
@SOAPBinding(style = Style.DOCUMENT)
public interface ProductCatalog {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	@WebResult(name = "Category")
	public abstract List<String> getProductCategories();

	@WebResult(name = "Success")
	public abstract boolean addProduct(
			@WebParam(name = "Category") String category,
			@WebParam(name = "Product") String product);

	@WebResult(name = "Product")
	public abstract List<Product> getProducsv2(
			@WebParam(name = "Category") String category);

	@WebResult(name = "Success")
	public abstract boolean addProductv2(
			@WebParam(name = "Category") String category,
			@WebParam(name = "Product") Product product);
}