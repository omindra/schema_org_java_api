package org.schema.api.model.thing.intangible.structuredValue.propertyValue;

import org.schema.api.model.thing.intangible.structuredValue.OpeningHoursSpecification;

import java.util.Date;

public class LocationFeatureSpecification extends PropertyValue
{
	private OpeningHoursSpecification hoursAvailable;
	private Date validFrom;
	private Date validThrough;

	public OpeningHoursSpecification getHoursAvailable()
	{
		return hoursAvailable;
	}

	public void setHoursAvailable(OpeningHoursSpecification hoursAvailable)
	{
		this.hoursAvailable = hoursAvailable;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidThrough()
	{
		return validThrough;
	}

	public void setValidThrough(Date validThrough)
	{
		this.validThrough = validThrough;
	}
}