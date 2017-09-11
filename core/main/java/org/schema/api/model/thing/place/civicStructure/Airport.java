package org.schema.api.model.thing.place.civicStructure;

import org.schema.api.model.thing.place.civicStructure.CivicStructure;

public class Airport extends CivicStructure
{
	private String iataCode;
	private String icaoCode;

	public String getIataCode()
	{
		return iataCode;
	}

	public void setIataCode(String iataCode)
	{
		this.iataCode = iataCode;
	}

	public String getIcaoCode()
	{
		return icaoCode;
	}

	public void setIcaoCode(String icaoCode)
	{
		this.icaoCode = icaoCode;
	}
}