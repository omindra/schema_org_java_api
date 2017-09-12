package org.schema.api.model.thing.intangible.enumeration.paymentMethod.paymentCard;

import org.schema.api.model.thing.intangible.enumeration.paymentMethod.PaymentMethod;
import org.schema.api.model.thing.intangible.structuredValue.MonetaryAmount;

public class PaymentCard extends PaymentMethod
{
	private Boolean cashBack;//Notes - Allowed types- [Boolean, Number]
	private Boolean contactlessPayment;
	private MonetaryAmount floorLimit;

	public Boolean getCashBack()
	{
		return cashBack;
	}

	public void setCashBack(Boolean cashBack)
	{
		this.cashBack = cashBack;
	}

	public Boolean getContactlessPayment()
	{
		return contactlessPayment;
	}

	public void setContactlessPayment(Boolean contactlessPayment)
	{
		this.contactlessPayment = contactlessPayment;
	}

	public MonetaryAmount getFloorLimit()
	{
		return floorLimit;
	}

	public void setFloorLimit(MonetaryAmount floorLimit)
	{
		this.floorLimit = floorLimit;
	}
}