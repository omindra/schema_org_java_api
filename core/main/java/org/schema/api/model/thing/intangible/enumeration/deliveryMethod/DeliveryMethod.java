package org.schema.api.model.thing.intangible.enumeration.deliveryMethod;

import org.schema.api.model.thing.intangible.enumeration.Enumeration;
import org.schema.api.model.thing.intangible.Class;

public class DeliveryMethod extends Enumeration
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