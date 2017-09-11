package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.action.tradeAction.TradeAction;
import org.schema.api.model.thing.intangible.enumeration.MedicalDevicePurpose;
import org.schema.api.model.thing.intangible.audience.Audience;

public class PayAction extends TradeAction
{
	private MedicalDevicePurpose purpose;//Notes - Allowed types- [MedicalDevicePurpose, Thing]
	private Audience recipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]

	public MedicalDevicePurpose getPurpose()
	{
		return purpose;
	}

	public void setPurpose(MedicalDevicePurpose purpose)
	{
		this.purpose = purpose;
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