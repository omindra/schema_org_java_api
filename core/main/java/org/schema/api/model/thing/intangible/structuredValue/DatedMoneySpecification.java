package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import java.util.Date;
import java.util.Date;

public class DatedMoneySpecification extends StructuredValue
{
	private Number amount;//Notes - Allowed types- [MonetaryAmount, Number]
	private String currency;//Notes - Allowed types- [Text, ISO 4217]
	private Date endDate;//Notes - Allowed types- [Date, DateTime]
	private Date startDate;//Notes - Allowed types- [Date, DateTime]

	public Number getAmount()
	{
		return amount;
	}

	public void setAmount(Number amount)
	{
		this.amount = amount;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
}