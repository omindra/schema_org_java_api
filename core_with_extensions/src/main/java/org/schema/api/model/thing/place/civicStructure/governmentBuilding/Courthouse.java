package org.schema.api.model.thing.place.civicStructure.governmentBuilding;

public class Courthouse extends GovernmentBuilding
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