package org.schema.api.model.thing.intangible.structuredValue.contactPoint;

import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;

public class PostalAddress extends ContactPoint
{
	private String addressCountry;//Notes - Allowed types- [Country, Text]
	private String addressLocality;
	private String addressRegion;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;

	public String getAddressCountry()
	{
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry)
	{
		this.addressCountry = addressCountry;
	}

	public String getAddressLocality()
	{
		return addressLocality;
	}

	public void setAddressLocality(String addressLocality)
	{
		this.addressLocality = addressLocality;
	}

	public String getAddressRegion()
	{
		return addressRegion;
	}

	public void setAddressRegion(String addressRegion)
	{
		this.addressRegion = addressRegion;
	}

	public String getPostOfficeBoxNumber()
	{
		return postOfficeBoxNumber;
	}

	public void setPostOfficeBoxNumber(String postOfficeBoxNumber)
	{
		this.postOfficeBoxNumber = postOfficeBoxNumber;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getStreetAddress()
	{
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
}