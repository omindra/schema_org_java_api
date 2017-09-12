package org.schema.api.model.thing.organization.localBusiness.lodgingBusiness;

public class Campground extends LodgingBusiness
{
	private String openingHours;

	public String getOpeningHours()
	{
		return openingHours;
	}

	public void setOpeningHours(String openingHours)
	{
		this.openingHours = openingHours;
	}
}