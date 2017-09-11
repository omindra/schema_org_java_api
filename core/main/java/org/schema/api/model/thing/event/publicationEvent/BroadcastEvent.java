package org.schema.api.model.thing.event.publicationEvent;

import org.schema.api.model.thing.event.publicationEvent.PublicationEvent;
import org.schema.api.model.thing.event.Event;

public class BroadcastEvent extends PublicationEvent
{
	private Event broadcastOfEvent;
	private Boolean isLiveBroadcast;
	private String videoFormat;

	public Event getBroadcastOfEvent()
	{
		return broadcastOfEvent;
	}

	public void setBroadcastOfEvent(Event broadcastOfEvent)
	{
		this.broadcastOfEvent = broadcastOfEvent;
	}

	public Boolean getIsLiveBroadcast()
	{
		return isLiveBroadcast;
	}

	public void setIsLiveBroadcast(Boolean isLiveBroadcast)
	{
		this.isLiveBroadcast = isLiveBroadcast;
	}

	public String getVideoFormat()
	{
		return videoFormat;
	}

	public void setVideoFormat(String videoFormat)
	{
		this.videoFormat = videoFormat;
	}
}