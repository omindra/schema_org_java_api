package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.quantity.Energy;
import org.schema.api.model.thing.intangible.quantity.Mass;

public class NutritionInformation extends StructuredValue
{
	private Energy calories;
	private Mass carbohydrateContent;
	private Mass cholesterolContent;
	private Mass fatContent;
	private Mass fiberContent;
	private Mass proteinContent;
	private Mass saturatedFatContent;
	private String servingSize;
	private Mass sodiumContent;
	private Mass sugarContent;
	private Mass transFatContent;
	private Mass unsaturatedFatContent;

	public Energy getCalories()
	{
		return calories;
	}

	public void setCalories(Energy calories)
	{
		this.calories = calories;
	}

	public Mass getCarbohydrateContent()
	{
		return carbohydrateContent;
	}

	public void setCarbohydrateContent(Mass carbohydrateContent)
	{
		this.carbohydrateContent = carbohydrateContent;
	}

	public Mass getCholesterolContent()
	{
		return cholesterolContent;
	}

	public void setCholesterolContent(Mass cholesterolContent)
	{
		this.cholesterolContent = cholesterolContent;
	}

	public Mass getFatContent()
	{
		return fatContent;
	}

	public void setFatContent(Mass fatContent)
	{
		this.fatContent = fatContent;
	}

	public Mass getFiberContent()
	{
		return fiberContent;
	}

	public void setFiberContent(Mass fiberContent)
	{
		this.fiberContent = fiberContent;
	}

	public Mass getProteinContent()
	{
		return proteinContent;
	}

	public void setProteinContent(Mass proteinContent)
	{
		this.proteinContent = proteinContent;
	}

	public Mass getSaturatedFatContent()
	{
		return saturatedFatContent;
	}

	public void setSaturatedFatContent(Mass saturatedFatContent)
	{
		this.saturatedFatContent = saturatedFatContent;
	}

	public String getServingSize()
	{
		return servingSize;
	}

	public void setServingSize(String servingSize)
	{
		this.servingSize = servingSize;
	}

	public Mass getSodiumContent()
	{
		return sodiumContent;
	}

	public void setSodiumContent(Mass sodiumContent)
	{
		this.sodiumContent = sodiumContent;
	}

	public Mass getSugarContent()
	{
		return sugarContent;
	}

	public void setSugarContent(Mass sugarContent)
	{
		this.sugarContent = sugarContent;
	}

	public Mass getTransFatContent()
	{
		return transFatContent;
	}

	public void setTransFatContent(Mass transFatContent)
	{
		this.transFatContent = transFatContent;
	}

	public Mass getUnsaturatedFatContent()
	{
		return unsaturatedFatContent;
	}

	public void setUnsaturatedFatContent(Mass unsaturatedFatContent)
	{
		this.unsaturatedFatContent = unsaturatedFatContent;
	}
}