package org.schema.api.model.thing.intangible.service.financialProduct;

public class CurrencyConversionService extends FinancialProduct
{
	private Number annualPercentageRate;//Notes - Allowed types- [Number, QuantitativeValue]
	private String feesAndCommissionsSpecification;//Notes - Allowed types- [Text, URL]
	private Number interestRate;//Notes - Allowed types- [Number, QuantitativeValue]

	public Number getAnnualPercentageRate()
	{
		return annualPercentageRate;
	}

	public void setAnnualPercentageRate(Number annualPercentageRate)
	{
		this.annualPercentageRate = annualPercentageRate;
	}

	public String getFeesAndCommissionsSpecification()
	{
		return feesAndCommissionsSpecification;
	}

	public void setFeesAndCommissionsSpecification(String feesAndCommissionsSpecification)
	{
		this.feesAndCommissionsSpecification = feesAndCommissionsSpecification;
	}

	public Number getInterestRate()
	{
		return interestRate;
	}

	public void setInterestRate(Number interestRate)
	{
		this.interestRate = interestRate;
	}
}