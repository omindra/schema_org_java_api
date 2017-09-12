package org.schema.api.model.thing.creativeWork.howTo;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.quantity.Duration;

public class HowTo extends CreativeWork
{
	private String estimatedCost;//Notes - Allowed types- [MonetaryAmount, Text]
	private Duration performTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]
	private Duration prepTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]
	private String steps;//Notes - Allowed types- [CreativeWork, ItemList, Text]
	private String supply;//Notes - Allowed types- [HowToSupply, Text]
	private String tool;//Notes - Allowed types- [HowToTool, Text]
	private Duration totalTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]
	private String yield;//Notes - Allowed types- [QuantitativeValue, Text]

	public String getEstimatedCost()
	{
		return estimatedCost;
	}

	public void setEstimatedCost(String estimatedCost)
	{
		this.estimatedCost = estimatedCost;
	}

	public Duration getPerformTime()
	{
		return performTime;
	}

	public void setPerformTime(Duration performTime)
	{
		this.performTime = performTime;
	}

	public Duration getPrepTime()
	{
		return prepTime;
	}

	public void setPrepTime(Duration prepTime)
	{
		this.prepTime = prepTime;
	}

	public String getSteps()
	{
		return steps;
	}

	public void setSteps(String steps)
	{
		this.steps = steps;
	}

	public String getSupply()
	{
		return supply;
	}

	public void setSupply(String supply)
	{
		this.supply = supply;
	}

	public String getTool()
	{
		return tool;
	}

	public void setTool(String tool)
	{
		this.tool = tool;
	}

	public Duration getTotalTime()
	{
		return totalTime;
	}

	public void setTotalTime(Duration totalTime)
	{
		this.totalTime = totalTime;
	}

	public String getYield()
	{
		return yield;
	}

	public void setYield(String yield)
	{
		this.yield = yield;
	}
}