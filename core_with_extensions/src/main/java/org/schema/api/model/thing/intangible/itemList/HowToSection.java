package org.schema.api.model.thing.intangible.itemList;

public class HowToSection extends ItemList
{
	private String steps;//Notes - Allowed types- [CreativeWork, ItemList, Text]

	public String getSteps()
	{
		return steps;
	}

	public void setSteps(String steps)
	{
		this.steps = steps;
	}
}