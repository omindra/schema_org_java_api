package org.schema.api.model.thing.intangible.structuredValue.priceSpecification;

import org.schema.api.model.thing.intangible.structuredValue.priceSpecification.PriceSpecification;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.enumeration.paymentMethod.PaymentMethod;

public class PaymentChargeSpecification extends PriceSpecification
{
	private DeliveryMethod appliesToDeliveryMethod;
	private PaymentMethod appliesToPaymentMethod;

	public DeliveryMethod getAppliesToDeliveryMethod()
	{
		return appliesToDeliveryMethod;
	}

	public void setAppliesToDeliveryMethod(DeliveryMethod appliesToDeliveryMethod)
	{
		this.appliesToDeliveryMethod = appliesToDeliveryMethod;
	}

	public PaymentMethod getAppliesToPaymentMethod()
	{
		return appliesToPaymentMethod;
	}

	public void setAppliesToPaymentMethod(PaymentMethod appliesToPaymentMethod)
	{
		this.appliesToPaymentMethod = appliesToPaymentMethod;
	}
}