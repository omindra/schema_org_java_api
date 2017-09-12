package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.service.Service;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.PostalAddress;
import org.schema.api.model.thing.place.Place;

public class ServiceChannel extends Intangible
{
	private String availableLanguage;//Notes - Allowed types- [Language, Text, IETF BCP 47 standard, inLanguage]
	private Duration processingTime;
	private Service providesService;
	private Place serviceLocation;
	private ContactPoint servicePhone;
	private PostalAddress servicePostalAddress;
	private ContactPoint serviceSmsNumber;
	private String serviceUrl;

	public String getAvailableLanguage()
	{
		return availableLanguage;
	}

	public void setAvailableLanguage(String availableLanguage)
	{
		this.availableLanguage = availableLanguage;
	}

	public Duration getProcessingTime()
	{
		return processingTime;
	}

	public void setProcessingTime(Duration processingTime)
	{
		this.processingTime = processingTime;
	}

	public Service getProvidesService()
	{
		return providesService;
	}

	public void setProvidesService(Service providesService)
	{
		this.providesService = providesService;
	}

	public Place getServiceLocation()
	{
		return serviceLocation;
	}

	public void setServiceLocation(Place serviceLocation)
	{
		this.serviceLocation = serviceLocation;
	}

	public ContactPoint getServicePhone()
	{
		return servicePhone;
	}

	public void setServicePhone(ContactPoint servicePhone)
	{
		this.servicePhone = servicePhone;
	}

	public PostalAddress getServicePostalAddress()
	{
		return servicePostalAddress;
	}

	public void setServicePostalAddress(PostalAddress servicePostalAddress)
	{
		this.servicePostalAddress = servicePostalAddress;
	}

	public ContactPoint getServiceSmsNumber()
	{
		return serviceSmsNumber;
	}

	public void setServiceSmsNumber(ContactPoint serviceSmsNumber)
	{
		this.serviceSmsNumber = serviceSmsNumber;
	}

	public String getServiceUrl()
	{
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl)
	{
		this.serviceUrl = serviceUrl;
	}
}