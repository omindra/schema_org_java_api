package org.schema.api.model.thing.event;

import org.schema.api.model.thing.event.Event;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;

public class DeliveryEvent extends Event
{
	private String accessCode;
	private Date availableFrom;
	private Date availableThrough;
	private DeliveryMethod hasDeliveryMethod;

	public String getAccessCode()
	{
		return accessCode;
	}

	public void setAccessCode(String accessCode)
	{
		this.accessCode = accessCode;
	}

	public Date getAvailableFrom()
	{
		return availableFrom;
	}

	public void setAvailableFrom(Date availableFrom)
	{
		this.availableFrom = availableFrom;
	}

	public Date getAvailableThrough()
	{
		return availableThrough;
	}

	public void setAvailableThrough(Date availableThrough)
	{
		this.availableThrough = availableThrough;
	}

	public DeliveryMethod getHasDeliveryMethod()
	{
		return hasDeliveryMethod;
	}

	public void setHasDeliveryMethod(DeliveryMethod hasDeliveryMethod)
	{
		this.hasDeliveryMethod = hasDeliveryMethod;
	}
}