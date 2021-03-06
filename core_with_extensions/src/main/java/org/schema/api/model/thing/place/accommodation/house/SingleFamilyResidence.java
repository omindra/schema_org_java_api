package org.schema.api.model.thing.place.accommodation.house;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class SingleFamilyResidence extends House
{
	private Number numberOfRooms;//Notes - Allowed types- [Number, QuantitativeValue]
	private QuantitativeValue occupancy;

	public Number getNumberOfRooms()
	{
		return numberOfRooms;
	}

	public void setNumberOfRooms(Number numberOfRooms)
	{
		this.numberOfRooms = numberOfRooms;
	}

	public QuantitativeValue getOccupancy()
	{
		return occupancy;
	}

	public void setOccupancy(QuantitativeValue occupancy)
	{
		this.occupancy = occupancy;
	}
}