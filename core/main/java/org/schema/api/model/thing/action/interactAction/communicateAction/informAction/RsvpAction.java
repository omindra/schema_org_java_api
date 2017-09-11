package org.schema.api.model.thing.action.interactAction.communicateAction.informAction;

import org.schema.api.model.thing.action.interactAction.communicateAction.informAction.InformAction;
import org.schema.api.model.thing.creativeWork.comment.Comment;
import org.schema.api.model.thing.intangible.enumeration.RsvpResponseType;

public class RsvpAction extends InformAction
{
	private Number additionalNumberOfGuests;
	private Comment comment;
	private RsvpResponseType rsvpResponse;

	public Number getAdditionalNumberOfGuests()
	{
		return additionalNumberOfGuests;
	}

	public void setAdditionalNumberOfGuests(Number additionalNumberOfGuests)
	{
		this.additionalNumberOfGuests = additionalNumberOfGuests;
	}

	public Comment getComment()
	{
		return comment;
	}

	public void setComment(Comment comment)
	{
		this.comment = comment;
	}

	public RsvpResponseType getRsvpResponse()
	{
		return rsvpResponse;
	}

	public void setRsvpResponse(RsvpResponseType rsvpResponse)
	{
		this.rsvpResponse = rsvpResponse;
	}
}