package org.schema.api.model.thing.action.consumeAction.useAction;

import org.schema.api.model.thing.action.consumeAction.ConsumeAction;
import org.schema.api.model.thing.intangible.offer.Offer;

public class UseAction extends ConsumeAction
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