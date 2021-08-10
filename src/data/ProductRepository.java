package data;

import java.util.ArrayList;

import models.Client;
import models.Product;

public class ProductRepository {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	//Crear producto
	public boolean createProduct (Product product) {
		
		products.add(product);
		return true;
	
	}
	//En listar productos
	public ArrayList<Product> getAll() {
		return products;
	}
	// Encontrar producto por codigo
public Product findProductByCode (String code) {
		
		for ( int i = 0 ; i < products.size() ; i++) {
			
			Product product = products.get(i);
				
			if (product.getCode().equals(code)) {
				return product;
				}
			
		}
		return null;
	}
//Actualizar prodcuto por Codigo
public boolean updateProduct(Product product, Product productUpdate) {
	int position = products.indexOf(product);
	products.set(position, productUpdate);
	return true;
}
//Eliminar producto por Codigo
      public Boolean deleteProdctByCode (String code) {
			for (int i = 0 ; i < products.size(); i++) {
				Product product = products.get(i);
				if (product.getCode().equals(code)) {
					products.remove(i);
					return true;
				}
			}
			return false;
		}










}








