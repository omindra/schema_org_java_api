package org.schema.api.model.thing.place.civicStructure.governmentBuilding;

import org.schema.api.model.thing.place.civicStructure.CivicStructure;

public class GovernmentBuilding extends CivicStructure
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