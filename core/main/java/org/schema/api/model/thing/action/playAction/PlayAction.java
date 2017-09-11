package org.schema.api.model.thing.action.playAction;

import org.schema.api.model.thing.action.Action;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.event.Event;

public class PlayAction extends Action
{
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private Event event;

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
	}

	public Event getEvent()
	{
		return event;
	}

	public void setEvent(Event event)
	{
		this.event = event;
	}
}