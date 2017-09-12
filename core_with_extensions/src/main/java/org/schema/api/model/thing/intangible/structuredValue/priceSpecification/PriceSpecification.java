package org.schema.api.model.thing.intangible.structuredValue.priceSpecification;

import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;

import java.util.Date;

public class PriceSpecification extends StructuredValue
{
	private QuantitativeValue eligibleQuantity;
	private PriceSpecification eligibleTransactionVolume;
	private Number maxPrice;
	private Number minPrice;
	private Number price;//Notes - Allowed types- [Number, Text]
	private String priceCurrency;//Notes - Allowed types- [Text, PriceSpecification]
	private Date validFrom;
	private Date validThrough;
	private Boolean valueAddedTaxIncluded;

	public QuantitativeValue getEligibleQuantity()
	{
		return eligibleQuantity;
	}

	public void setEligibleQuantity(QuantitativeValue eligibleQuantity)
	{
		this.eligibleQuantity = eligibleQuantity;
	}

	public PriceSpecification getEligibleTransactionVolume()
	{
		return eligibleTransactionVolume;
	}

	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume)
	{
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}

	public Number getMaxPrice()
	{
		return maxPrice;
	}

	public void setMaxPrice(Number maxPrice)
	{
		this.maxPrice = maxPrice;
	}

	public Number getMinPrice()
	{
		return minPrice;
	}

	public void setMinPrice(Number minPrice)
	{
		this.minPrice = minPrice;
	}

	public Number getPrice()
	{
		return price;
	}

	public void setPrice(Number price)
	{
		this.price = price;
	}

	public String getPriceCurrency()
	{
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency)
	{
		this.priceCurrency = priceCurrency;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidThrough()
	{
		return validThrough;
	}

	public void setValidThrough(Date validThrough)
	{
		this.validThrough = validThrough;
	}

	public Boolean getValueAddedTaxIncluded()
	{
		return valueAddedTaxIncluded;
	}

	public void setValueAddedTaxIncluded(Boolean valueAddedTaxIncluded)
	{
		this.valueAddedTaxIncluded = valueAddedTaxIncluded;
	}
}