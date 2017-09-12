package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.enumeration.paymentMethod.PaymentMethod;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.structuredValue.MonetaryAmount;
import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class Invoice extends Intangible
{
	private String accountId;
	private Duration billingPeriod;
	private Organization broker;//Notes - Allowed types- [Organization, Person, bookingAgent]
	private String category;//Notes - Allowed types- [PhysicalActivityCategory, Text, Thing]
	private String confirmationNumber;
	private Organization customer;//Notes - Allowed types- [Organization, Person]
	private MonetaryAmount minimumPaymentDue;//Notes - Allowed types- [MonetaryAmount, PriceSpecification]
	private Date paymentDueDate;//Notes - Allowed types- [DateTime, paymentDue]
	private PaymentMethod paymentMethod;
	private String paymentMethodId;
	private String paymentStatus;//Notes - Allowed types- [PaymentStatusType, Text]
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private Order referencesOrder;
	private Date scheduledPaymentDate;
	private MonetaryAmount totalPaymentDue;//Notes - Allowed types- [MonetaryAmount, PriceSpecification]

	public String getAccountId()
	{
		return accountId;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public Duration getBillingPeriod()
	{
		return billingPeriod;
	}

	public void setBillingPeriod(Duration billingPeriod)
	{
		this.billingPeriod = billingPeriod;
	}

	public Organization getBroker()
	{
		return broker;
	}

	public void setBroker(Organization broker)
	{
		this.broker = broker;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
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

	public MonetaryAmount getMinimumPaymentDue()
	{
		return minimumPaymentDue;
	}

	public void setMinimumPaymentDue(MonetaryAmount minimumPaymentDue)
	{
		this.minimumPaymentDue = minimumPaymentDue;
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

	public String getPaymentStatus()
	{
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public Order getReferencesOrder()
	{
		return referencesOrder;
	}

	public void setReferencesOrder(Order referencesOrder)
	{
		this.referencesOrder = referencesOrder;
	}

	public Date getScheduledPaymentDate()
	{
		return scheduledPaymentDate;
	}

	public void setScheduledPaymentDate(Date scheduledPaymentDate)
	{
		this.scheduledPaymentDate = scheduledPaymentDate;
	}

	public MonetaryAmount getTotalPaymentDue()
	{
		return totalPaymentDue;
	}

	public void setTotalPaymentDue(MonetaryAmount totalPaymentDue)
	{
		this.totalPaymentDue = totalPaymentDue;
	}
}