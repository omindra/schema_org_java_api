package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.intangible.ParcelDelivery;
import org.schema.api.model.thing.intangible.enumeration.OrderStatus;
import org.schema.api.model.thing.intangible.OrderItem;

public class OrderItem extends Intangible
{
	private ParcelDelivery orderDelivery;
	private String orderItemNumber;
	private OrderStatus orderItemStatus;
	private Number orderQuantity;
	private OrderItem orderedItem;//Notes - Allowed types- [OrderItem, Product]

	public ParcelDelivery getOrderDelivery()
	{
		return orderDelivery;
	}

	public void setOrderDelivery(ParcelDelivery orderDelivery)
	{
		this.orderDelivery = orderDelivery;
	}

	public String getOrderItemNumber()
	{
		return orderItemNumber;
	}

	public void setOrderItemNumber(String orderItemNumber)
	{
		this.orderItemNumber = orderItemNumber;
	}

	public OrderStatus getOrderItemStatus()
	{
		return orderItemStatus;
	}

	public void setOrderItemStatus(OrderStatus orderItemStatus)
	{
		this.orderItemStatus = orderItemStatus;
	}

	public Number getOrderQuantity()
	{
		return orderQuantity;
	}

	public void setOrderQuantity(Number orderQuantity)
	{
		this.orderQuantity = orderQuantity;
	}

	public OrderItem getOrderedItem()
	{
		return orderedItem;
	}

	public void setOrderedItem(OrderItem orderedItem)
	{
		this.orderedItem = orderedItem;
	}
}