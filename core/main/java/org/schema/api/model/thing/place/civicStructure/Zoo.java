package org.schema.api.model.thing.place.civicStructure;

import org.schema.api.model.thing.place.civicStructure.CivicStructure;

public class Zoo extends CivicStructure
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