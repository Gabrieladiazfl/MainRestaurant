package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {
	
//Main el metodo por donde comienza cualquier programa en java y por ahi va a entrar
	public static void main(String[] args) {
		
		ClientsScreen clientsScreen = new ClientsScreen();
		ProductScreen productScreen = new ProductScreen();
		RecipeScreen recipeScreen = new RecipeScreen();
		TableScreen tableScreen = new TableScreen();
		MenuScreen menuScreen = new MenuScreen();
		
		System.out.println("INICIO DEL PROGRAMA");
		System.out.println("");
		
		//
		while(true) {
			int selected = menuScreen.showMenuOptions();
			//Como un if
			switch(selected) {
			
			//Cliente
			case 1:
				clientsScreen.createClient();
				break; //Poner break para que se detenga y no muestre la siguiente opcion
			case 2:
				clientsScreen.listClients();
				break;
			case 3:
				clientsScreen.searchClient();
				break;
			case 4:
				clientsScreen.updateClient();
				break;
			case 5:
				clientsScreen.deleteClient();
				
			//Producto
			case 6:
				productScreen.createProduct();
				break;
			case 7:
				productScreen.listProducts();
				break;
			case 8:
				productScreen.searchProduct();
				break;
			case 9:
				productScreen.updateProduct();
				break;
			case 10:
				productScreen.deleteProduct();
				break;
				
			//Recetas
			case 11:
				recipeScreen.createRecipe();
				break;
			case 12:
				recipeScreen.listRecipes();
				break;
			case 13:
				recipeScreen.searchRecipe();
				break;
			case 14:
				recipeScreen.updateRecipe();
				break;
			case 15:
				recipeScreen.deleteRecipe();
				break;
				
			//Mesas
			case 16:
				tableScreen.crateTable();
				break;
			case 17:
				tableScreen.listTables();
				break;
			case 18:
				tableScreen.searchTable();
				break;
			case 19:
				tableScreen.updateTable();
			case 20:
				tableScreen.deleteTable();
				break;
				
			
			default:
				System.out.println("******************************************");
				System.out.println("La opcion seleccionada no esta disponible");
				System.out.println("******************************************");
				
			}
			
			
		}

	}

	}
	
	
	


