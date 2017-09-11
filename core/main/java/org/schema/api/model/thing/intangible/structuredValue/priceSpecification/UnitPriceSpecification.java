package org.schema.api.model.thing.intangible.structuredValue.priceSpecification;

import org.schema.api.model.thing.intangible.structuredValue.priceSpecification.PriceSpecification;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class UnitPriceSpecification extends PriceSpecification
{
	private Number billingIncrement;
	private String priceType;
	private QuantitativeValue referenceQuantity;
	private String unitCode;//Notes - Allowed types- [Text, URL]
	private String unitText;

	public Number getBillingIncrement()
	{
		return billingIncrement;
	}

	public void setBillingIncrement(Number billingIncrement)
	{
		this.billingIncrement = billingIncrement;
	}

	public String getPriceType()
	{
		return priceType;
	}

	public void setPriceType(String priceType)
	{
		this.priceType = priceType;
	}

	public QuantitativeValue getReferenceQuantity()
	{
		return referenceQuantity;
	}

	public void setReferenceQuantity(QuantitativeValue referenceQuantity)
	{
		this.referenceQuantity = referenceQuantity;
	}

	public String getUnitCode()
	{
		return unitCode;
	}

	public void setUnitCode(String unitCode)
	{
		this.unitCode = unitCode;
	}

	public String getUnitText()
	{
		return unitText;
	}

	public void setUnitText(String unitText)
	{
		this.unitText = unitText;
	}
}