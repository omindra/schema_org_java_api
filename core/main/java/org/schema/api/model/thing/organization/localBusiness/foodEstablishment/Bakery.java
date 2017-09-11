package org.schema.api.model.thing.organization.localBusiness.foodEstablishment;

import org.schema.api.model.thing.organization.localBusiness.foodEstablishment.FoodEstablishment;
import org.schema.api.model.thing.intangible.rating.Rating;

public class Bakery extends FoodEstablishment
{
	private Boolean acceptsReservations;//Notes - Allowed types- [Boolean, Text, URL]
	private String hasMenu;//Notes - Allowed types- [Menu, Text, URL]
	private String servesCuisine;
	private Rating starRating;

	public Boolean getAcceptsReservations()
	{
		return acceptsReservations;
	}

	public void setAcceptsReservations(Boolean acceptsReservations)
	{
		this.acceptsReservations = acceptsReservations;
	}

	public String getHasMenu()
	{
		return hasMenu;
	}

	public void setHasMenu(String hasMenu)
	{
		this.hasMenu = hasMenu;
	}

	public String getServesCuisine()
	{
		return servesCuisine;
	}

	public void setServesCuisine(String servesCuisine)
	{
		this.servesCuisine = servesCuisine;
	}

	public Rating getStarRating()
	{
		return starRating;
	}

	public void setStarRating(Rating starRating)
	{
		this.starRating = starRating;
	}
}