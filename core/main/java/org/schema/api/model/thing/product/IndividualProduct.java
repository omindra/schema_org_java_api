package org.schema.api.model.thing.product;

import org.schema.api.model.thing.product.Product;

public class IndividualProduct extends Product
{
	private String serialNumber;

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}
}