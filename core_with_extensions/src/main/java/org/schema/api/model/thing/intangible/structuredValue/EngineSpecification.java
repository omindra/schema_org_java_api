package org.schema.api.model.thing.intangible.structuredValue;

public class EngineSpecification extends StructuredValue
{
	private QuantitativeValue engineDisplacement;
	private QuantitativeValue enginePower;
	private String engineType;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private String fuelType;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private QuantitativeValue torque;

	public QuantitativeValue getEngineDisplacement()
	{
		return engineDisplacement;
	}

	public void setEngineDisplacement(QuantitativeValue engineDisplacement)
	{
		this.engineDisplacement = engineDisplacement;
	}

	public QuantitativeValue getEnginePower()
	{
		return enginePower;
	}

	public void setEnginePower(QuantitativeValue enginePower)
	{
		this.enginePower = enginePower;
	}

	public String getEngineType()
	{
		return engineType;
	}

	public void setEngineType(String engineType)
	{
		this.engineType = engineType;
	}

	public String getFuelType()
	{
		return fuelType;
	}

	public void setFuelType(String fuelType)
	{
		this.fuelType = fuelType;
	}

	public QuantitativeValue getTorque()
	{
		return torque;
	}

	public void setTorque(QuantitativeValue torque)
	{
		this.torque = torque;
	}
}