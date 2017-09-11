package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import org.schema.api.model.thing.intangible.enumeration.BusinessFunction;
import org.schema.api.model.thing.product.Product;

public class TypeAndQuantityNode extends StructuredValue
{
	private Number amountOfThisGood;
	private BusinessFunction businessFunction;
	private Product typeOfGood;//Notes - Allowed types- [Product, Service]
	private String unitCode;//Notes - Allowed types- [Text, URL]
	private String unitText;

	public Number getAmountOfThisGood()
	{
		return amountOfThisGood;
	}

	public void setAmountOfThisGood(Number amountOfThisGood)
	{
		this.amountOfThisGood = amountOfThisGood;
	}

	public BusinessFunction getBusinessFunction()
	{
		return businessFunction;
	}

	public void setBusinessFunction(BusinessFunction businessFunction)
	{
		this.businessFunction = businessFunction;
	}

	public Product getTypeOfGood()
	{
		return typeOfGood;
	}

	public void setTypeOfGood(Product typeOfGood)
	{
		this.typeOfGood = typeOfGood;
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