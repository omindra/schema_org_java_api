package org.schema.api.model.thing.action.createAction;

import org.schema.api.model.thing.creativeWork.howTo.Recipe;
import org.schema.api.model.thing.event.FoodEvent;
import org.schema.api.model.thing.organization.localBusiness.foodEstablishment.FoodEstablishment;

public class CookAction extends CreateAction
{
	private FoodEstablishment foodEstablishment;//Notes - Allowed types- [FoodEstablishment, Place]
	private FoodEvent foodEvent;
	private Recipe recipe;

	public FoodEstablishment getFoodEstablishment()
	{
		return foodEstablishment;
	}

	public void setFoodEstablishment(FoodEstablishment foodEstablishment)
	{
		this.foodEstablishment = foodEstablishment;
	}

	public FoodEvent getFoodEvent()
	{
		return foodEvent;
	}

	public void setFoodEvent(FoodEvent foodEvent)
	{
		this.foodEvent = foodEvent;
	}

	public Recipe getRecipe()
	{
		return recipe;
	}

	public void setRecipe(Recipe recipe)
	{
		this.recipe = recipe;
	}
}