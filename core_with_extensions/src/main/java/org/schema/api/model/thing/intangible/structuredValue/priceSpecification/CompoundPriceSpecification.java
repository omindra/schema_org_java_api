package org.schema.api.model.thing.intangible.structuredValue.priceSpecification;

public class CompoundPriceSpecification extends PriceSpecification
{
	private UnitPriceSpecification priceComponent;

	public UnitPriceSpecification getPriceComponent()
	{
		return priceComponent;
	}

	public void setPriceComponent(UnitPriceSpecification priceComponent)
	{
		this.priceComponent = priceComponent;
	}
}