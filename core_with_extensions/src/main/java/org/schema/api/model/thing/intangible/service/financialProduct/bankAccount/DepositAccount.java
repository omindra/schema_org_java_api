package org.schema.api.model.thing.intangible.service.financialProduct.bankAccount;

public class DepositAccount extends BankAccount
{
	private Number amount;//Notes - Allowed types- [MonetaryAmount, Number]

	public Number getAmount()
	{
		return amount;
	}

	public void setAmount(Number amount)
	{
		this.amount = amount;
	}
}