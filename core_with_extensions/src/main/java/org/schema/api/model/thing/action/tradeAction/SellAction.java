package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.Person;

public class SellAction extends TradeAction
{
	private Person buyer;

	public Person getBuyer()
	{
		return buyer;
	}

	public void setBuyer(Person buyer)
	{
		this.buyer = buyer;
	}
}