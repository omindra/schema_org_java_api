package org.schema.api.model.thing.organization.localBusiness.automotiveBusiness;

import org.schema.api.model.thing.organization.localBusiness.automotiveBusiness.AutomotiveBusiness;

public class GasStation extends AutomotiveBusiness
{
	private String currenciesAccepted;
	private String openingHours;
	private String paymentAccepted;
	private String priceRange;

	public String getCurrenciesAccepted()
	{
		return currenciesAccepted;
	}

	public void setCurrenciesAccepted(String currenciesAccepted)
	{
		this.currenciesAccepted = currenciesAccepted;
	}

	public String getOpeningHours()
	{
		return openingHours;
	}

	public void setOpeningHours(String openingHours)
	{
		this.openingHours = openingHours;
	}

	public String getPaymentAccepted()
	{
		return paymentAccepted;
	}

	public void setPaymentAccepted(String paymentAccepted)
	{
		this.paymentAccepted = paymentAccepted;
	}

	public String getPriceRange()
	{
		return priceRange;
	}

	public void setPriceRange(String priceRange)
	{
		this.priceRange = priceRange;
	}
}