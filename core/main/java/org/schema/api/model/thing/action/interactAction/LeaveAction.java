package org.schema.api.model.thing.action.interactAction;

import org.schema.api.model.thing.action.interactAction.InteractAction;
import org.schema.api.model.thing.event.Event;

public class LeaveAction extends InteractAction
{
	private Event event;

	public Event getEvent()
	{
		return event;
	}

	public void setEvent(Event event)
	{
		this.event = event;
	}
}