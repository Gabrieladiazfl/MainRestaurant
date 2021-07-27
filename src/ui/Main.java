package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {
	

	public static void main(String[] args) {
		
		System.out.println("Inicio el programa");
		
		Client newClient = new Client("Diego","Molina","11111",true);
      
		System.out.println("El cliente es: " + newClient.getname()+ " " + newClient.getlastName());
		
		newClient.setname("Andres");
		
		System.out.println("El nuevo cliente es: " + newClient.getname()+ " " + newClient.getlastName());
		
		newClient.sethasChildren(true);
		
		System.out.println("El cliente tiene hijos (true/flase):" + newClient.gethasChildren());
		
		//Productos 
		
		///3 variables de cada clase: Cliente/Producto/Receta/Mesa
		
		//Product
		
		Product newProduct = new Product ("Arroz", "Diana", 2000, 1);
		
		System.out.println ("El producto es: " + newProduct.getName()+ " " + newProduct.getBrand());
		
		newProduct.setName("Frijol");
		newProduct.setBrand("Mercacentro");
		
		System.out.println("El nuevo producto es: " + newProduct.getName() + " " + newProduct.getBrand());
		
		newProduct.setPrice (2000);
		
		System.out.println ("El precio del producto es: " + newProduct.getPrice());
		
		//Recipe
		
		Recipe newRecipe = new Recipe ("Picada", 35000);
		
		System.out.println("La Receta es: " + newRecipe.getname());
		System.out.println("El precio es: " + newRecipe.getprice());
		
		newRecipe.setname("Sancocho");
		newRecipe.setprice(20000);
		
		System.out.println("La nueva Receta es: " + newRecipe.getname());
		System.out.println("El precio es: " + newRecipe.getprice());
		
		//Table
		
		Table newTable = new Table (14, 4, "Centro del salon");
		
		System.out.println("La mesa asignada es: " + newTable.getnumber());
		System.out.println("La capacidad es: " + newTable.getcapacity());
		System.out.println("La ubicacion es: " + newTable.getlocation());
		
		newTable.setnumber(28);
		newTable.setcapacity(4);
		newTable.setlocation("Esquina izquierda del salon");
		
		System.out.println("La nueva mesa asignada es: " + newTable.getnumber());
		
		System.out.println("La capacidad de la nueva mesa es: " + newTable.getcapacity());
		
		System.out.println("La ubicacion de la nueva mesa es: " + newTable.getlocation());
			
		
	}
	

		
	}
	
	
	


