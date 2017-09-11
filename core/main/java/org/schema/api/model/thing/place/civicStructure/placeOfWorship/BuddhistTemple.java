package org.schema.api.model.thing.place.civicStructure.placeOfWorship;

import org.schema.api.model.thing.place.civicStructure.placeOfWorship.PlaceOfWorship;

public class BuddhistTemple extends PlaceOfWorship
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