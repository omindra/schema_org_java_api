package org.schema.api.model.thing.intangible.enumeration.paymentMethod;

import org.schema.api.model.thing.intangible.Class;
import org.schema.api.model.thing.intangible.enumeration.Enumeration;

public class PaymentMethod extends Enumeration
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