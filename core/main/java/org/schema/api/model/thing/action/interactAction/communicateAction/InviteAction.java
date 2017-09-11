package org.schema.api.model.thing.action.interactAction.communicateAction;

import org.schema.api.model.thing.action.interactAction.communicateAction.CommunicateAction;
import org.schema.api.model.thing.event.Event;

public class InviteAction extends CommunicateAction
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