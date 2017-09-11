package org.schema.api.model.thing.action.consumeAction;

import org.schema.api.model.thing.action.consumeAction.ConsumeAction;
import org.schema.api.model.thing.intangible.offer.Offer;

public class ListenAction extends ConsumeAction
{
	private Offer expectsAcceptanceOf;

	public Offer getExpectsAcceptanceOf()
	{
		return expectsAcceptanceOf;
	}

	public void setExpectsAcceptanceOf(Offer expectsAcceptanceOf)
	{
		this.expectsAcceptanceOf = expectsAcceptanceOf;
	}
}