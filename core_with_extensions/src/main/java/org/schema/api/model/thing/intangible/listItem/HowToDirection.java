package org.schema.api.model.thing.intangible.listItem;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.intangible.quantity.Duration;

public class HowToDirection extends ListItem
{
	private MediaObject afterMedia;
	private MediaObject beforeMedia;
	private MediaObject duringMedia;
	private Duration performTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]
	private Duration prepTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]
	private String supply;//Notes - Allowed types- [HowToSupply, Text]
	private String tool;//Notes - Allowed types- [HowToTool, Text]
	private Duration totalTime;//Notes - Allowed types- [Duration, ISO 8601 duration format]

	public MediaObject getAfterMedia()
	{
		return afterMedia;
	}

	public void setAfterMedia(MediaObject afterMedia)
	{
		this.afterMedia = afterMedia;
	}

	public MediaObject getBeforeMedia()
	{
		return beforeMedia;
	}

	public void setBeforeMedia(MediaObject beforeMedia)
	{
		this.beforeMedia = beforeMedia;
	}

	public MediaObject getDuringMedia()
	{
		return duringMedia;
	}

	public void setDuringMedia(MediaObject duringMedia)
	{
		this.duringMedia = duringMedia;
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
}