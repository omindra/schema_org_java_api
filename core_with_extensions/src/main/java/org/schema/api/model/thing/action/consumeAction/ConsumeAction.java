package org.schema.api.model.thing.action.consumeAction;

import org.schema.api.model.thing.action.Action;
import org.schema.api.model.thing.intangible.offer.Offer;

public class ConsumeAction extends Action
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