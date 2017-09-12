package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.enumeration.OrderStatus;
import org.schema.api.model.thing.intangible.enumeration.paymentMethod.PaymentMethod;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.PostalAddress;
import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class Order extends Intangible
{
	private Offer acceptedOffer;
	private PostalAddress billingAddress;
	private Organization broker;//Notes - Allowed types- [Organization, Person, bookingAgent]
	private String confirmationNumber;
	private Organization customer;//Notes - Allowed types- [Organization, Person]
	private Number discount;//Notes - Allowed types- [Number, Text]
	private String discountCode;
	private String discountCurrency;
	private Boolean isGift;
	private Date orderDate;
	private ParcelDelivery orderDelivery;
	private String orderNumber;
	private OrderStatus orderStatus;
	private OrderItem orderedItem;//Notes - Allowed types- [OrderItem, Product]
	private Invoice partOfInvoice;
	private Date paymentDueDate;//Notes - Allowed types- [DateTime, paymentDue]
	private PaymentMethod paymentMethod;
	private String paymentMethodId;
	private String paymentUrl;
	private Organization seller;//Notes - Allowed types- [Organization, Person]

	public Offer getAcceptedOffer()
	{
		return acceptedOffer;
	}

	public void setAcceptedOffer(Offer acceptedOffer)
	{
		this.acceptedOffer = acceptedOffer;
	}

	public PostalAddress getBillingAddress()
	{
		return billingAddress;
	}

	public void setBillingAddress(PostalAddress billingAddress)
	{
		this.billingAddress = billingAddress;
	}

	public Organization getBroker()
	{
		return broker;
	}

	public void setBroker(Organization broker)
	{
		this.broker = broker;
	}

	public String getConfirmationNumber()
	{
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber)
	{
		this.confirmationNumber = confirmationNumber;
	}

	public Organization getCustomer()
	{
		return customer;
	}

	public void setCustomer(Organization customer)
	{
		this.customer = customer;
	}

	public Number getDiscount()
	{
		return discount;
	}

	public void setDiscount(Number discount)
	{
		this.discount = discount;
	}

	public String getDiscountCode()
	{
		return discountCode;
	}

	public void setDiscountCode(String discountCode)
	{
		this.discountCode = discountCode;
	}

	public String getDiscountCurrency()
	{
		return discountCurrency;
	}

	public void setDiscountCurrency(String discountCurrency)
	{
		this.discountCurrency = discountCurrency;
	}

	public Boolean getIsGift()
	{
		return isGift;
	}

	public void setIsGift(Boolean isGift)
	{
		this.isGift = isGift;
	}

	public Date getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}

	public ParcelDelivery getOrderDelivery()
	{
		return orderDelivery;
	}

	public void setOrderDelivery(ParcelDelivery orderDelivery)
	{
		this.orderDelivery = orderDelivery;
	}

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public OrderStatus getOrderStatus()
	{
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus)
	{
		this.orderStatus = orderStatus;
	}

	public OrderItem getOrderedItem()
	{
		return orderedItem;
	}

	public void setOrderedItem(OrderItem orderedItem)
	{
		this.orderedItem = orderedItem;
	}

	public Invoice getPartOfInvoice()
	{
		return partOfInvoice;
	}

	public void setPartOfInvoice(Invoice partOfInvoice)
	{
		this.partOfInvoice = partOfInvoice;
	}

	public Date getPaymentDueDate()
	{
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate)
	{
		this.paymentDueDate = paymentDueDate;
	}

	public PaymentMethod getPaymentMethod()
	{
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethodId()
	{
		return paymentMethodId;
	}

	public void setPaymentMethodId(String paymentMethodId)
	{
		this.paymentMethodId = paymentMethodId;
	}

	public String getPaymentUrl()
	{
		return paymentUrl;
	}

	public void setPaymentUrl(String paymentUrl)
	{
		this.paymentUrl = paymentUrl;
	}

	public Organization getSeller()
	{
		return seller;
	}

	public void setSeller(Organization seller)
	{
		this.seller = seller;
	}
}