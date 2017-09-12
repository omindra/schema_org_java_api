package org.schema.api.model.thing.place.accommodation;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class Suite extends Accommodation
{
	private String bed;//Notes - Allowed types- [BedDetails, BedType, Text]
	private Number numberOfRooms;//Notes - Allowed types- [Number, QuantitativeValue]
	private QuantitativeValue occupancy;

	public String getBed()
	{
		return bed;
	}

	public void setBed(String bed)
	{
		this.bed = bed;
	}

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