package Controller;

import java.util.ArrayList;

import data.RecipeRepository;
import models.Recipe;

public class RecipeController {
	
    RecipeRepository recipeRepository = new RecipeRepository();
	
	//Crear receta
	public String createRecipe(String name, int price, String code) {
		
		if(name.trim().length() <= 4) {
			return "El nombre de la receta debe ser mayor a 4 caracteres";
		}
		if(price < 7000) {
			return "El precio debe ser mayor a $7,000";
		}
		if (code.trim().length() <1) {
			return "Debe escribir el codigo";
		}
		if (code.trim().length() <= 3) {
			return "El codigo debe llevar 3 o mas caracteres";
		}
		
		Recipe recipe = new Recipe(name, price, code);
		boolean result = recipeRepository.createRecipe(recipe);
		
		if (result) {
			System.out.println("");
			return "La receta se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error al crear la receta";
		}
		
		
	}
	//En listar recetas
	public ArrayList<Recipe> getAll() {
		ArrayList<Recipe> recipes = recipeRepository.getRecipes();
		return recipes;
	}
	//Buscar receta por code
	public Recipe searchRecipe(String code) {
		Recipe recipe = recipeRepository.findRecipeByCode(code);
		return recipe;
	}
	//Actualizar receta por code
	public String updateRecipe (Recipe recipe, String name, int price, String code) {
		Recipe recipeUpdate = new Recipe (name, price, code);
		recipeRepository.updateRecipe(recipe, recipeUpdate);
		return null;
	}
	//Eliminar receta por code
		public Boolean deleteRecipe(String code) {
			return recipeRepository.deleteRecipeByCode(code);
		}


}
