package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.RecipeController;
import models.Recipe;

public class RecipeScreen {
	
    RecipeController recipeController = new RecipeController();
    
	//Creacion de receta
	public void createRecipe() {
	
	String name;
	int price;
	String code;
	
	//Scanner:para que el usuario ingrese a nosotros 
	Scanner sc = new Scanner(System.in);
	
	//System para nosotros mostarle al usuario
	//ln inicia en una linea nueva
	 System.out.println("");
	 System.out.println("----------------CREAR RECETA----------------");
	 System.out.println("");
	
	 System.out.println("Ingrese el nombre de la Receta: ");
	 name = sc.nextLine();
	 System.out.println("Ingrese el precio: ");
	 price = Integer.parseInt(sc.nextLine());
	 System.out.println("Ingrese el codigo de la Receta:");
	 code = sc.nextLine();
	
	
	 String result = recipeController.createRecipe(name, price, code);
	 System.out.print(result);
	
	
	}
	
	public void listRecipes() {
		ArrayList<Recipe> recipes = recipeController.getAll();
		
		if(recipes.size() == 0) {
			System.out.println("No existen recetas");
		}
		
		for(int i = 0 ; i < recipes.size(); i ++) {
			Recipe recipe = recipes.get(i);
			System.out.println(recipe.toString());
		}
		
		
	}
	public void searchRecipe() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Ingrese el codigo de la receta que deseas buscar:");
		String code = sc.nextLine();
		Recipe recipes = recipeController.searchRecipe(code);
		
		if(recipes != null) {
			System.out.println(recipes.toString());
		} else  {
			System.out.println("No existe receta");
		}
	}
		//Actualizar receta por code
		
		public void updateRecipe () {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Escriba el codigo de la receta que desea actualizar:");
			String codeR = scanner.nextLine();
			Recipe recipe = recipeController.searchRecipe(codeR);
			if (recipe != null) {
				
				String name;
				int price;
				String code;
				
				Scanner sc = new Scanner (System.in);
				
				System.out.println("----ACTUALIZACION DE LA RECETA----");
				System.out.println("Escriba el nombre de la receta:");
				name = sc.nextLine();
				System.out.println("Escriba el precio de la receta:");
				price = Integer.parseInt(sc.nextLine());
				System.out.println("Escriba el codigo de la receta:");
				code = sc.nextLine();
				
				String result = recipeController.createRecipe(name, price, code);
				System.out.println(result);
				
			}
	}
		
		//Eliminar producto por codigo
		public void deleteRecipe() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite el codigo de la receta que desea eliminar:");
			String code = scanner.nextLine();
			Boolean recipeDeleted = recipeController.deleteRecipe(code);
			if (recipeDeleted) {
				System.out.println("Se eliminó la receta");
			} else {
				System.out.println("No se encontró la receta");
			}


		}
}
