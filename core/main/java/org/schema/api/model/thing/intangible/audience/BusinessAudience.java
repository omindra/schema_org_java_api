package org.schema.api.model.thing.intangible.audience;

import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class BusinessAudience extends Audience
{
	private QuantitativeValue numberOfEmployees;
	private QuantitativeValue yearlyRevenue;
	private QuantitativeValue yearsInOperation;

	public QuantitativeValue getNumberOfEmployees()
	{
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(QuantitativeValue numberOfEmployees)
	{
		this.numberOfEmployees = numberOfEmployees;
	}

	public QuantitativeValue getYearlyRevenue()
	{
		return yearlyRevenue;
	}

	public void setYearlyRevenue(QuantitativeValue yearlyRevenue)
	{
		this.yearlyRevenue = yearlyRevenue;
	}

	public QuantitativeValue getYearsInOperation()
	{
		return yearsInOperation;
	}

	public void setYearsInOperation(QuantitativeValue yearsInOperation)
	{
		this.yearsInOperation = yearsInOperation;
	}
}