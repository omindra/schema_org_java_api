package org.schema.api.model.thing.intangible;

public class BedDetails extends Intangible
{
	private Number numberOfBeds;
	private String typeOfBed;//Notes - Allowed types- [BedType, Text]

	public Number getNumberOfBeds()
	{
		return numberOfBeds;
	}

	public void setNumberOfBeds(Number numberOfBeds)
	{
		this.numberOfBeds = numberOfBeds;
	}

	public String getTypeOfBed()
	{
		return typeOfBed;
	}

	public void setTypeOfBed(String typeOfBed)
	{
		this.typeOfBed = typeOfBed;
	}
}