package org.schema.api.model.thing.action.transferAction;

import org.schema.api.model.thing.action.transferAction.TransferAction;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.audience.Audience;

public class ReceiveAction extends TransferAction
{
	private DeliveryMethod deliveryMethod;
	private Audience sender;//Notes - Allowed types- [Audience, Organization, Person]

	public DeliveryMethod getDeliveryMethod()
	{
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod)
	{
		this.deliveryMethod = deliveryMethod;
	}

	public Audience getSender()
	{
		return sender;
	}

	public void setSender(Audience sender)
	{
		this.sender = sender;
	}
}