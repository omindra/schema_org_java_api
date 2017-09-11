package org.schema.api.model.thing.action.findAction;

import org.schema.api.model.thing.action.findAction.FindAction;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;

public class TrackAction extends FindAction
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