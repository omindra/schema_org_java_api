package org.schema.api.model.thing.intangible.service.financialProduct.loanOrCredit;

import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.service.financialProduct.FinancialProduct;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.RepaymentSpecification;

public class LoanOrCredit extends FinancialProduct
{
	private Number amount;//Notes - Allowed types- [MonetaryAmount, Number]
	private String currency;//Notes - Allowed types- [Text, ISO 4217]
	private Duration gracePeriod;
	private RepaymentSpecification loanRepaymentForm;
	private QuantitativeValue loanTerm;
	private String loanType;//Notes - Allowed types- [Text, URL]
	private Boolean recourseLoan;
	private Boolean renegotiableLoan;
	private String requiredCollateral;//Notes - Allowed types- [Text, Thing]

	public Number getAmount()
	{
		return amount;
	}

	public void setAmount(Number amount)
	{
		this.amount = amount;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public Duration getGracePeriod()
	{
		return gracePeriod;
	}

	public void setGracePeriod(Duration gracePeriod)
	{
		this.gracePeriod = gracePeriod;
	}

	public RepaymentSpecification getLoanRepaymentForm()
	{
		return loanRepaymentForm;
	}

	public void setLoanRepaymentForm(RepaymentSpecification loanRepaymentForm)
	{
		this.loanRepaymentForm = loanRepaymentForm;
	}

	public QuantitativeValue getLoanTerm()
	{
		return loanTerm;
	}

	public void setLoanTerm(QuantitativeValue loanTerm)
	{
		this.loanTerm = loanTerm;
	}

	public String getLoanType()
	{
		return loanType;
	}

	public void setLoanType(String loanType)
	{
		this.loanType = loanType;
	}

	public Boolean getRecourseLoan()
	{
		return recourseLoan;
	}

	public void setRecourseLoan(Boolean recourseLoan)
	{
		this.recourseLoan = recourseLoan;
	}

	public Boolean getRenegotiableLoan()
	{
		return renegotiableLoan;
	}

	public void setRenegotiableLoan(Boolean renegotiableLoan)
	{
		this.renegotiableLoan = renegotiableLoan;
	}

	public String getRequiredCollateral()
	{
		return requiredCollateral;
	}

	public void setRequiredCollateral(String requiredCollateral)
	{
		this.requiredCollateral = requiredCollateral;
	}
}