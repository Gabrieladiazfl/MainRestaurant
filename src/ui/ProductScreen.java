package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.ProductController;
import models.Product;

public class ProductScreen {
	
	ProductController productController = new ProductController();
	//Crear producto
	public void createProduct() {
		
		String name;
		String brand;
		double price;
		int quantity;
		String code;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		 System.out.println("----------------CREAR PRODUCTO----------------");
		 System.out.println("");
			
			System.out.println("Ingrese el nombre: ");
			name = sc.nextLine();
			System.out.println("Ingrese la marca: ");
			brand = sc.nextLine();
			System.out.println("Ingrese el valor: ");
			price = sc.nextDouble();
			System.out.println("Ingrese la cantidad: ");
			quantity = sc.nextInt();
			System.out.println("Ingrese el codigo del producto");
			code = sc.nextLine();
		
		String result = productController.createProduct(name, brand, price, quantity, code);
		
		System.out.println(result);
	}
	//En listar producto
	public void listProducts() {
		ArrayList<Product> products = productController.getProducts();
		
		if(products.size() == 0) {
			System.out.println("No existen productos");
			return;
		}
		
		for(int i = 0 ; i < products.size(); i ++) {
			Product product = products.get(i);
			System.out.println(product.toString());
		}
	} 
	//Buscar producto por codigo
	public void searchProduct () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el codigo del producto");
		
		String code = sc.nextLine();
		
		Product product = productController.searchProduct(code);
		
		if(product != null) {
			System.out.println(product.toString());
		} else  {
			System.out.println("No existe producto");
		}
	}
	//Actualizar producto por codigo
	public void updateProduct () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Escriba el codigo del producto que desea actualizar");
		String codeP = scanner.nextLine();
		Product product = productController.searchProduct(codeP);//???por que no puedo poner el atributo aca?? Code
		if (product != null) {
			
			String name;
			String brand;
			double price;
			int quantity;
			String code;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("----ACTUALIZACION DE PRODUCTO----");
			System.out.println("Escriba el nombre del producto");
			name = sc.nextLine();
			System.out.println("Escriba la marca del producto");
			brand = sc.nextLine();
			System.out.println("Escriba el precio del producto");
			price = Integer.parseInt(sc.nextLine());
			System.out.println("Escriba la cantidad del producto");
			quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Escriba el codigo del producto");
			code = sc.nextLine();
			
			String result = productController.createProduct(name, brand, price, quantity, code);
			System.out.println(result);
		}
				
	}
	//Eliminar producto por codigo
	public void deleteProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite el codigo del producto que desea eliminar:");
		String code = scanner.nextLine();
		Boolean productDeleted = productController.deleteProduct(code);
		if (productDeleted) {
			System.out.println("Se eliminó el producto");
		} else {
			System.out.println("No se encontró el producto");
		}

}
}
