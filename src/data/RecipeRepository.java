package data;

import java.util.ArrayList;

import models.Product;
import models.Recipe;

public class RecipeRepository {
private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	//Crear Receta
	public boolean createRecipe(Recipe recipe) {
		
		recipes.add(recipe);
		return true;
		
	}
	//En listar recetas
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}
	//Encontrar receta por codigo
	public Recipe findRecipeByCode(String code) {
		for(int i = 0 ; i < recipes.size() ; i++ ) {
			Recipe recipe = recipes.get(i);
			
			if (recipe.getcode().equals(code)) {
				return recipe;
			}
		}
		return null;
	}
	//Actualizar receta por codigo
	public boolean updateRecipe (Recipe recipe, Recipe recipeUpdate) {
		int position = recipes.indexOf(recipeUpdate);
		recipes.set(position, recipeUpdate);
		return true;
	}
	//Eliminar receta por Codigo
    public Boolean deleteRecipeByCode (String code) {
			for (int i = 0 ; i < recipes.size(); i++) {
			Recipe recipe = recipes.get(i);
				if (recipe.getcode().equals(code)) {
					recipes.remove(i);
					return true;
				}
			}
			return false;
		}

}













