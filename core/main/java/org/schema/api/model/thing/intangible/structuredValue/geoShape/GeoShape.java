package org.schema.api.model.thing.intangible.structuredValue.geoShape;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;

public class GeoShape extends StructuredValue
{
	private String address;//Notes - Allowed types- [PostalAddress, Text]
	private String addressCountry;//Notes - Allowed types- [Country, Text]
	private String box;
	private String circle;
	private Number elevation;//Notes - Allowed types- [Number, Text, WGS 84]
	private String line;
	private String polygon;
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

	public String getBox()
	{
		return box;
	}

	public void setBox(String box)
	{
		this.box = box;
	}

	public String getCircle()
	{
		return circle;
	}

	public void setCircle(String circle)
	{
		this.circle = circle;
	}

	public Number getElevation()
	{
		return elevation;
	}

	public void setElevation(Number elevation)
	{
		this.elevation = elevation;
	}

	public String getLine()
	{
		return line;
	}

	public void setLine(String line)
	{
		this.line = line;
	}

	public String getPolygon()
	{
		return polygon;
	}

	public void setPolygon(String polygon)
	{
		this.polygon = polygon;
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