package org.schema.api.model.thing.place.accommodation.house;

import org.schema.api.model.thing.place.accommodation.Accommodation;

public class House extends Accommodation
{
	private Number numberOfRooms;//Notes - Allowed types- [Number, QuantitativeValue]

	public Number getNumberOfRooms()
	{
		return numberOfRooms;
	}

	public void setNumberOfRooms(Number numberOfRooms)
	{
		this.numberOfRooms = numberOfRooms;
	}
}