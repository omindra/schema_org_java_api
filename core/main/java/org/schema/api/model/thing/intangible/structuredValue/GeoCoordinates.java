package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;

public class GeoCoordinates extends StructuredValue
{
	private String address;//Notes - Allowed types- [PostalAddress, Text]
	private String addressCountry;//Notes - Allowed types- [Country, Text]
	private Number elevation;//Notes - Allowed types- [Number, Text, WGS 84]
	private Number latitude;//Notes - Allowed types- [Number, Text]
	private Number longitude;//Notes - Allowed types- [Number, Text]
	private String postalCode;

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getAddressCountry()
	{
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry)
	{
		this.addressCountry = addressCountry;
	}

	public Number getElevation()
	{
		return elevation;
	}

	public void setElevation(Number elevation)
	{
		this.elevation = elevation;
	}

	public Number getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Number latitude)
	{
		this.latitude = latitude;
	}

	public Number getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Number longitude)
	{
		this.longitude = longitude;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
}