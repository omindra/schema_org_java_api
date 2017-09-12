package org.schema.api.model.thing.intangible.service.financialProduct.bankAccount;

import org.schema.api.model.thing.intangible.service.financialProduct.FinancialProduct;
import org.schema.api.model.thing.intangible.structuredValue.MonetaryAmount;

public class BankAccount extends FinancialProduct
{
	private MonetaryAmount accountMinimumInflow;
	private MonetaryAmount accountOverdraftLimit;
	private String bankAccountType;//Notes - Allowed types- [Text, URL]

	public MonetaryAmount getAccountMinimumInflow()
	{
		return accountMinimumInflow;
	}

	public void setAccountMinimumInflow(MonetaryAmount accountMinimumInflow)
	{
		this.accountMinimumInflow = accountMinimumInflow;
	}

	public MonetaryAmount getAccountOverdraftLimit()
	{
		return accountOverdraftLimit;
	}

	public void setAccountOverdraftLimit(MonetaryAmount accountOverdraftLimit)
	{
		this.accountOverdraftLimit = accountOverdraftLimit;
	}

	public String getBankAccountType()
	{
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType)
	{
		this.bankAccountType = bankAccountType;
	}
}