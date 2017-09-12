package org.schema.api.model.thing.event.publicationEvent;

import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.intangible.service.BroadcastService;
import org.schema.api.model.thing.organization.Organization;

public class PublicationEvent extends Event
{
	private Boolean isAccessibleForFree;//Notes - Allowed types- [Boolean, free]
	private Organization publishedBy;//Notes - Allowed types- [Organization, Person]
	private BroadcastService publishedOn;

	public Boolean getIsAccessibleForFree()
	{
		return isAccessibleForFree;
	}

	public void setIsAccessibleForFree(Boolean isAccessibleForFree)
	{
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public Organization getPublishedBy()
	{
		return publishedBy;
	}

	public void setPublishedBy(Organization publishedBy)
	{
		this.publishedBy = publishedBy;
	}

	public BroadcastService getPublishedOn()
	{
		return publishedOn;
	}

	public void setPublishedOn(BroadcastService publishedOn)
	{
		this.publishedOn = publishedOn;
	}
}