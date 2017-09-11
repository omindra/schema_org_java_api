package org.schema.api.model.thing.place.residence;

import org.schema.api.model.thing.place.residence.Residence;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class SingleFamilyResidence extends Residence
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