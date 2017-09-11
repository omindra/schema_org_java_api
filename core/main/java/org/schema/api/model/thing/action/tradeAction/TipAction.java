package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.action.tradeAction.TradeAction;
import org.schema.api.model.thing.intangible.audience.Audience;

public class TipAction extends TradeAction
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