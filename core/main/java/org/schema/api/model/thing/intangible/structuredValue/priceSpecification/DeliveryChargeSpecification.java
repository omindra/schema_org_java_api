package org.schema.api.model.thing.intangible.structuredValue.priceSpecification;

import org.schema.api.model.thing.intangible.structuredValue.priceSpecification.PriceSpecification;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;

public class DeliveryChargeSpecification extends PriceSpecification
{
	private DeliveryMethod appliesToDeliveryMethod;
	private String areaServed;//Notes - Allowed types- [AdministrativeArea, GeoShape, Place, Text, serviceArea]
	private String eligibleRegion;//Notes - Allowed types- [GeoShape, Place, Text]
	private String ineligibleRegion;//Notes - Allowed types- [GeoShape, Place, Text]

	public DeliveryMethod getAppliesToDeliveryMethod()
	{
		return appliesToDeliveryMethod;
	}

	public void setAppliesToDeliveryMethod(DeliveryMethod appliesToDeliveryMethod)
	{
		this.appliesToDeliveryMethod = appliesToDeliveryMethod;
	}

	public String getAreaServed()
	{
		return areaServed;
	}

	public void setAreaServed(String areaServed)
	{
		this.areaServed = areaServed;
	}

	public String getEligibleRegion()
	{
		return eligibleRegion;
	}

	public void setEligibleRegion(String eligibleRegion)
	{
		this.eligibleRegion = eligibleRegion;
	}

	public String getIneligibleRegion()
	{
		return ineligibleRegion;
	}

	public void setIneligibleRegion(String ineligibleRegion)
	{
		this.ineligibleRegion = ineligibleRegion;
	}
}