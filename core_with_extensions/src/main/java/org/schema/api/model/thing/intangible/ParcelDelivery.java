package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.event.DeliveryEvent;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.PostalAddress;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.product.Product;

import java.util.Date;

public class ParcelDelivery extends Intangible
{
	private PostalAddress deliveryAddress;
	private DeliveryEvent deliveryStatus;
	private Date expectedArrivalFrom;
	private Date expectedArrivalUntil;
	private DeliveryMethod hasDeliveryMethod;
	private Product itemShipped;
	private PostalAddress originAddress;
	private Order partOfOrder;
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private String trackingNumber;
	private String trackingUrl;

	public PostalAddress getDeliveryAddress()
	{
		return deliveryAddress;
	}

	public void setDeliveryAddress(PostalAddress deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}

	public DeliveryEvent getDeliveryStatus()
	{
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryEvent deliveryStatus)
	{
		this.deliveryStatus = deliveryStatus;
	}

	public Date getExpectedArrivalFrom()
	{
		return expectedArrivalFrom;
	}

	public void setExpectedArrivalFrom(Date expectedArrivalFrom)
	{
		this.expectedArrivalFrom = expectedArrivalFrom;
	}

	public Date getExpectedArrivalUntil()
	{
		return expectedArrivalUntil;
	}

	public void setExpectedArrivalUntil(Date expectedArrivalUntil)
	{
		this.expectedArrivalUntil = expectedArrivalUntil;
	}

	public DeliveryMethod getHasDeliveryMethod()
	{
		return hasDeliveryMethod;
	}

	public void setHasDeliveryMethod(DeliveryMethod hasDeliveryMethod)
	{
		this.hasDeliveryMethod = hasDeliveryMethod;
	}

	public Product getItemShipped()
	{
		return itemShipped;
	}

	public void setItemShipped(Product itemShipped)
	{
		this.itemShipped = itemShipped;
	}

	public PostalAddress getOriginAddress()
	{
		return originAddress;
	}

	public void setOriginAddress(PostalAddress originAddress)
	{
		this.originAddress = originAddress;
	}

	public Order getPartOfOrder()
	{
		return partOfOrder;
	}

	public void setPartOfOrder(Order partOfOrder)
	{
		this.partOfOrder = partOfOrder;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public String getTrackingNumber()
	{
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber)
	{
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingUrl()
	{
		return trackingUrl;
	}

	public void setTrackingUrl(String trackingUrl)
	{
		this.trackingUrl = trackingUrl;
	}
}