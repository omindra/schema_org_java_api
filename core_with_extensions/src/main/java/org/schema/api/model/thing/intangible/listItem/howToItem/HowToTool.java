package org.schema.api.model.thing.intangible.listItem.howToItem;

public class HowToTool extends HowToItem
{
	private Number requiredQuantity;//Notes - Allowed types- [Number, QuantitativeValue, Text]

	public Number getRequiredQuantity()
	{
		return requiredQuantity;
	}

	public void setRequiredQuantity(Number requiredQuantity)
	{
		this.requiredQuantity = requiredQuantity;
	}
}