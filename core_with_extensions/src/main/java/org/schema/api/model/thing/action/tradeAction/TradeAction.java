package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.action.Action;
import org.schema.api.model.thing.intangible.structuredValue.priceSpecification.PriceSpecification;

public class TradeAction extends Action
{
	private Number price;//Notes - Allowed types- [Number, Text]
	private PriceSpecification priceSpecification;

	public Number getPrice()
	{
		return price;
	}

	public void setPrice(Number price)
	{
		this.price = price;
	}

	public PriceSpecification getPriceSpecification()
	{
		return priceSpecification;
	}

	public void setPriceSpecification(PriceSpecification priceSpecification)
	{
		this.priceSpecification = priceSpecification;
	}
}