package org.schema.api.model.thing.product.vehicle;

import org.schema.api.model.thing.product.vehicle.Vehicle;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class BusOrCoach extends Vehicle
{
	private String acrissCode;
	private QuantitativeValue roofLoad;

	public String getAcrissCode()
	{
		return acrissCode;
	}

	public void setAcrissCode(String acrissCode)
	{
		this.acrissCode = acrissCode;
	}

	public QuantitativeValue getRoofLoad()
	{
		return roofLoad;
	}

	public void setRoofLoad(QuantitativeValue roofLoad)
	{
		this.roofLoad = roofLoad;
	}
}