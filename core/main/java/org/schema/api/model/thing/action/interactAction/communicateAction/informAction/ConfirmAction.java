package org.schema.api.model.thing.action.interactAction.communicateAction.informAction;

import org.schema.api.model.thing.action.interactAction.communicateAction.informAction.InformAction;
import org.schema.api.model.thing.event.Event;

public class ConfirmAction extends InformAction
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