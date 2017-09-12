package org.schema.api.model.thing.intangible.enumeration.paymentMethod.paymentCard;

public class CreditCard extends PaymentCard
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