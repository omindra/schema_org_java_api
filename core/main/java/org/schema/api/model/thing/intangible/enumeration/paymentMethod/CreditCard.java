package org.schema.api.model.thing.intangible.enumeration.paymentMethod;

import org.schema.api.model.thing.intangible.enumeration.paymentMethod.PaymentMethod;

public class CreditCard extends PaymentMethod
{
	private Number monthlyMinimumRepaymentAmount;//Notes - Allowed types- [MonetaryAmount, Number]

	public Number getMonthlyMinimumRepaymentAmount()
	{
		return monthlyMinimumRepaymentAmount;
	}

	public void setMonthlyMinimumRepaymentAmount(Number monthlyMinimumRepaymentAmount)
	{
		this.monthlyMinimumRepaymentAmount = monthlyMinimumRepaymentAmount;
	}
}