package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;

public class OrderAction extends TradeAction
{
	private DeliveryMethod deliveryMethod;

	public DeliveryMethod getDeliveryMethod()
	{
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod)
	{
		this.deliveryMethod = deliveryMethod;
	}
}