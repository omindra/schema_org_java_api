package org.schema.api.model.thing.place.accommodation.room;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class HotelRoom extends Room
{
	private String bed;//Notes - Allowed types- [BedDetails, BedType, Text]
	private QuantitativeValue occupancy;

	public String getBed()
	{
		return bed;
	}

	public void setBed(String bed)
	{
		this.bed = bed;
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