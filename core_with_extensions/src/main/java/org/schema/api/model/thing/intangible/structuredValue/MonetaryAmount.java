package org.schema.api.model.thing.intangible.structuredValue;

import java.util.Date;

public class MonetaryAmount extends StructuredValue
{
	private String currency;//Notes - Allowed types- [Text, ISO 4217]
	private Number maxValue;
	private Number minValue;
	private Date validFrom;
	private Date validThrough;
	private Boolean value;//Notes - Allowed types- [Boolean, Number, StructuredValue, Text]

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public Number getMaxValue()
	{
		return maxValue;
	}

	public void setMaxValue(Number maxValue)
	{
		this.maxValue = maxValue;
	}

	public Number getMinValue()
	{
		return minValue;
	}

	public void setMinValue(Number minValue)
	{
		this.minValue = minValue;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidThrough()
	{
		return validThrough;
	}

	public void setValidThrough(Date validThrough)
	{
		this.validThrough = validThrough;
	}

	public Boolean getValue()
	{
		return value;
	}

	public void setValue(Boolean value)
	{
		this.value = value;
	}
}