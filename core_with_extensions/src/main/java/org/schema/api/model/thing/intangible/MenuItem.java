package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.enumeration.RestrictedDiet;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.intangible.structuredValue.NutritionInformation;

public class MenuItem extends Intangible
{
	private MenuItem menuAddOn;//Notes - Allowed types- [MenuItem, MenuSection]
	private NutritionInformation nutrition;
	private Offer offers;
	private RestrictedDiet suitableForDiet;

	public MenuItem getMenuAddOn()
	{
		return menuAddOn;
	}

	public void setMenuAddOn(MenuItem menuAddOn)
	{
		this.menuAddOn = menuAddOn;
	}

	public NutritionInformation getNutrition()
	{
		return nutrition;
	}

	public void setNutrition(NutritionInformation nutrition)
	{
		this.nutrition = nutrition;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
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