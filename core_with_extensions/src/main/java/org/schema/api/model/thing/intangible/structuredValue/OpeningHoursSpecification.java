package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.enumeration.DayOfWeek;

import java.util.Date;

public class OpeningHoursSpecification extends StructuredValue
{
	private Date closes;
	private DayOfWeek dayOfWeek;
	private Date opens;
	private Date validFrom;
	private Date validThrough;

	public Date getCloses()
	{
		return closes;
	}

	public void setCloses(Date closes)
	{
		this.closes = closes;
	}

	public DayOfWeek getDayOfWeek()
	{
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}

	public Date getOpens()
	{
		return opens;
	}

	public void setOpens(Date opens)
	{
		this.opens = opens;
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