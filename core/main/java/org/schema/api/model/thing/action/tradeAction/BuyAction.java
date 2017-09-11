package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.action.tradeAction.TradeAction;
import org.schema.api.model.thing.organization.Organization;

public class BuyAction extends TradeAction
{
	private Organization seller;//Notes - Allowed types- [Organization, Person]

	public Organization getSeller()
	{
		return seller;
	}

	public void setSeller(Organization seller)
	{
		this.seller = seller;
	}
}