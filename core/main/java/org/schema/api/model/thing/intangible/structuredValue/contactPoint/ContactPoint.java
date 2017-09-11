package org.schema.api.model.thing.intangible.structuredValue.contactPoint;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import org.schema.api.model.thing.intangible.enumeration.ContactPointOption;
import org.schema.api.model.thing.intangible.structuredValue.OpeningHoursSpecification;

public class ContactPoint extends StructuredValue
{
	private String areaServed;//Notes - Allowed types- [AdministrativeArea, GeoShape, Place, Text, serviceArea]
	private String availableLanguage;//Notes - Allowed types- [Language, Text, IETF BCP 47 standard, inLanguage]
	private ContactPointOption contactOption;
	private String contactType;
	private String email;
	private String faxNumber;
	private OpeningHoursSpecification hoursAvailable;
	private String productSupported;//Notes - Allowed types- [Product, Text]
	private String telephone;

	public String getAreaServed()
	{
		return areaServed;
	}

	public void setAreaServed(String areaServed)
	{
		this.areaServed = areaServed;
	}

	public String getAvailableLanguage()
	{
		return availableLanguage;
	}

	public void setAvailableLanguage(String availableLanguage)
	{
		this.availableLanguage = availableLanguage;
	}

	public ContactPointOption getContactOption()
	{
		return contactOption;
	}

	public void setContactOption(ContactPointOption contactOption)
	{
		this.contactOption = contactOption;
	}

	public String getContactType()
	{
		return contactType;
	}

	public void setContactType(String contactType)
	{
		this.contactType = contactType;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getFaxNumber()
	{
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public OpeningHoursSpecification getHoursAvailable()
	{
		return hoursAvailable;
	}

	public void setHoursAvailable(OpeningHoursSpecification hoursAvailable)
	{
		this.hoursAvailable = hoursAvailable;
	}

	public String getProductSupported()
	{
		return productSupported;
	}

	public void setProductSupported(String productSupported)
	{
		this.productSupported = productSupported;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
}