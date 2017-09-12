package org.schema.api.model.thing.place.accommodation.room;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.LocationFeatureSpecification;

public class MeetingRoom extends Room
{
	private LocationFeatureSpecification amenityFeature;
	private QuantitativeValue floorSize;
	private Number numberOfRooms;//Notes - Allowed types- [Number, QuantitativeValue]
	private String permittedUsage;
	private Boolean petsAllowed;//Notes - Allowed types- [Boolean, Text]

	public LocationFeatureSpecification getAmenityFeature()
	{
		return amenityFeature;
	}

	public void setAmenityFeature(LocationFeatureSpecification amenityFeature)
	{
		this.amenityFeature = amenityFeature;
	}

	public QuantitativeValue getFloorSize()
	{
		return floorSize;
	}

	public void setFloorSize(QuantitativeValue floorSize)
	{
		this.floorSize = floorSize;
	}

	public Number getNumberOfRooms()
	{
		return numberOfRooms;
	}

	public void setNumberOfRooms(Number numberOfRooms)
	{
		this.numberOfRooms = numberOfRooms;
	}

	public String getPermittedUsage()
	{
		return permittedUsage;
	}

	public void setPermittedUsage(String permittedUsage)
	{
		this.permittedUsage = permittedUsage;
	}

	public Boolean getPetsAllowed()
	{
		return petsAllowed;
	}

	public void setPetsAllowed(Boolean petsAllowed)
	{
		this.petsAllowed = petsAllowed;
	}
}