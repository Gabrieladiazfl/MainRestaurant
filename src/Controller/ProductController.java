package Controller;

import java.util.ArrayList;

import data.ProductRepository;
import models.Product;

public class ProductController {
	
	ProductRepository productRepository = new ProductRepository();
	
	public String createProduct(String name, String brand, double price, int quantity) {
		
		if (name.trim().length() <=3) {
			return "El nombre debe ser mayor a 3 caracteres";
		}
		if (brand.trim().length() <=3) {
			return "La marca debe ser mayor a 3";
		}
		if (price < 500) {
			return "El precio debe ser mayor a 500";
		}
		if (quantity < 1) {
			return "la cantidad debe ser mayor a 0";
		}
		// Crear
		Product product = new Product(name, brand, price, quantity);
		
		boolean result = productRepository.createProduct(product);
		if (result) {
			System.out.println("");
			return "El producto se creo con exito";
		} else {
			System.out.println("");
			return "Existe un error";
			
		}
		
	}
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = productRepository.getAll();
		return products;
		
	}
	
	public Product searchProduct(String id) {
		Product product = productRepository.findProductById(id);
		return product;	
	}

}
