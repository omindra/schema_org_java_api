package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import org.schema.api.model.thing.creativeWork.softwareApplication.SoftwareApplication;
import org.schema.api.model.thing.action.Action;

public class InteractionCounter extends StructuredValue
{
	private SoftwareApplication interactionService;//Notes - Allowed types- [SoftwareApplication, WebSite]
	private Action interactionType;
	private Integer userInteractionCount;

	public SoftwareApplication getInteractionService()
	{
		return interactionService;
	}

	public void setInteractionService(SoftwareApplication interactionService)
	{
		this.interactionService = interactionService;
	}

	public Action getInteractionType()
	{
		return interactionType;
	}

	public void setInteractionType(Action interactionType)
	{
		this.interactionType = interactionType;
	}

	public Integer getUserInteractionCount()
	{
		return userInteractionCount;
	}

	public void setUserInteractionCount(Integer userInteractionCount)
	{
		this.userInteractionCount = userInteractionCount;
	}
}