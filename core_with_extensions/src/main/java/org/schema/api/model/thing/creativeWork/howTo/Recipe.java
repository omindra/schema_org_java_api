package org.schema.api.model.thing.creativeWork.howTo;

import org.schema.api.model.thing.intangible.enumeration.RestrictedDiet;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.structuredValue.NutritionInformation;

public class Recipe extends HowTo
{
	private Duration cookTime;
	private String cookingMethod;
	private NutritionInformation nutrition;
	private String recipeCategory;
	private String recipeCuisine;
	private String recipeIngredient;
	private String recipeInstructions;//Notes - Allowed types- [CreativeWork, ItemList, Text]
	private String recipeYield;//Notes - Allowed types- [QuantitativeValue, Text]
	private RestrictedDiet suitableForDiet;

	public Duration getCookTime()
	{
		return cookTime;
	}

	public void setCookTime(Duration cookTime)
	{
		this.cookTime = cookTime;
	}

	public String getCookingMethod()
	{
		return cookingMethod;
	}

	public void setCookingMethod(String cookingMethod)
	{
		this.cookingMethod = cookingMethod;
	}

	public NutritionInformation getNutrition()
	{
		return nutrition;
	}

	public void setNutrition(NutritionInformation nutrition)
	{
		this.nutrition = nutrition;
	}

	public String getRecipeCategory()
	{
		return recipeCategory;
	}

	public void setRecipeCategory(String recipeCategory)
	{
		this.recipeCategory = recipeCategory;
	}

	public String getRecipeCuisine()
	{
		return recipeCuisine;
	}

	public void setRecipeCuisine(String recipeCuisine)
	{
		this.recipeCuisine = recipeCuisine;
	}

	public String getRecipeIngredient()
	{
		return recipeIngredient;
	}

	public void setRecipeIngredient(String recipeIngredient)
	{
		this.recipeIngredient = recipeIngredient;
	}

	public String getRecipeInstructions()
	{
		return recipeInstructions;
	}

	public void setRecipeInstructions(String recipeInstructions)
	{
		this.recipeInstructions = recipeInstructions;
	}

	public String getRecipeYield()
	{
		return recipeYield;
	}

	public void setRecipeYield(String recipeYield)
	{
		this.recipeYield = recipeYield;
	}

	public RestrictedDiet getSuitableForDiet()
	{
		return suitableForDiet;
	}

	public void setSuitableForDiet(RestrictedDiet suitableForDiet)
	{
		this.suitableForDiet = suitableForDiet;
	}
}