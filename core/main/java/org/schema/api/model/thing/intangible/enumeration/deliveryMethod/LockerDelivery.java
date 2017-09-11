package org.schema.api.model.thing.intangible.enumeration.deliveryMethod;

import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.Class;

public class LockerDelivery extends DeliveryMethod
{
	private Class supersededBy;//Notes - Allowed types- [Class, Enumeration, Property]

	public Class getSupersededBy()
	{
		return supersededBy;
	}

	public void setSupersededBy(Class supersededBy)
	{
		this.supersededBy = supersededBy;
	}
}