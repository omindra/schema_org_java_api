package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.enumeration.WarrantyScope;

public class WarrantyPromise extends StructuredValue
{
	private QuantitativeValue durationOfWarranty;
	private WarrantyScope warrantyScope;

	public QuantitativeValue getDurationOfWarranty()
	{
		return durationOfWarranty;
	}

	public void setDurationOfWarranty(QuantitativeValue durationOfWarranty)
	{
		this.durationOfWarranty = durationOfWarranty;
	}

	public WarrantyScope getWarrantyScope()
	{
		return warrantyScope;
	}

	public void setWarrantyScope(WarrantyScope warrantyScope)
	{
		this.warrantyScope = warrantyScope;
	}
}