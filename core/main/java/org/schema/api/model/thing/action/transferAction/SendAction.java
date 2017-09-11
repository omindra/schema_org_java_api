package org.schema.api.model.thing.action.transferAction;

import org.schema.api.model.thing.action.transferAction.TransferAction;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.audience.Audience;

public class SendAction extends TransferAction
{
	private DeliveryMethod deliveryMethod;
	private Audience recipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]

	public DeliveryMethod getDeliveryMethod()
	{
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod)
	{
		this.deliveryMethod = deliveryMethod;
	}

	public Audience getRecipient()
	{
		return recipient;
	}

	public void setRecipient(Audience recipient)
	{
		this.recipient = recipient;
	}
}