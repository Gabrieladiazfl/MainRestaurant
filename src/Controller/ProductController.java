package Controller;

import java.util.ArrayList;

import data.ProductRepository;
import models.Product;

public class ProductController {
	
	ProductRepository productRepository = new ProductRepository();
	//Crear product
	public String createProduct(String name, String brand, double price, int quantity, String code) {
		
		if (name.trim().length() <=3) {
			return "El nombre debe ser mayor a 3 caracteres";
		}
		if (brand.trim().length() <=3) {
			return "La marca debe ser mayor a 3 letras";
		}
		if (price < 500) {
			return "El precio debe ser mayor a 500";
		}
		if (quantity < 1) {
			return "Debe escribir la cantidad";
		}
		if (code.trim().length () < 1) {
			return "Debe escribir el Codigo";
		}
		// Crear
		Product product = new Product(name, brand, price, quantity, code);
		
		boolean result = productRepository.createProduct(product);
		if (result) {
			System.out.println("");
			return "El producto se creo con exito";
		} else {
			System.out.println("");
			return "Existe un error";
			
		}
		
	}
	//En listar product
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = productRepository.getAll();
		return products;
		
	}
	//Buscar product por Codigo
	public Product searchProduct(String code) {
		Product product = productRepository.findProductByCode(code);
		return product;	
	}
	//Actualizar product por code
	public String updateProduct(Product product, String name, String brand, double price, int quantity, String code) {
		Product productUpdate = new Product (name, brand, price, quantity, code);
		productRepository.updateProduct(product, productUpdate);
		return null;
	}
	//Eliminar producto por code
	public Boolean deleteProduct(String code) {
		return productRepository.deleteProdctByCode(code);
	}

}
