package org.schema.api.model.thing.intangible.listItem.howToItem;

public class HowToSupply extends HowToItem
{
	private String estimatedCost;//Notes - Allowed types- [MonetaryAmount, Text]

	public String getEstimatedCost()
	{
		return estimatedCost;
	}

	public void setEstimatedCost(String estimatedCost)
	{
		this.estimatedCost = estimatedCost;
	}
}