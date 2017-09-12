package org.schema.api.model.thing.product;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class SomeProducts extends Product
{
	private QuantitativeValue inventoryLevel;

	public QuantitativeValue getInventoryLevel()
	{
		return inventoryLevel;
	}

	public void setInventoryLevel(QuantitativeValue inventoryLevel)
	{
		this.inventoryLevel = inventoryLevel;
	}
}