package org.schema.api.model.thing.intangible.service.financialProduct.investmentOrDeposit;

import org.schema.api.model.thing.intangible.service.financialProduct.FinancialProduct;

public class InvestmentOrDeposit extends FinancialProduct
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