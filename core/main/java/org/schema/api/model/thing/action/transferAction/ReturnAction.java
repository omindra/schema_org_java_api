package org.schema.api.model.thing.action.transferAction;

import org.schema.api.model.thing.action.transferAction.TransferAction;
import org.schema.api.model.thing.intangible.audience.Audience;

public class ReturnAction extends TransferAction
{
	private Audience recipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]

	public Audience getRecipient()
	{
		return recipient;
	}

	public void setRecipient(Audience recipient)
	{
		this.recipient = recipient;
	}
}