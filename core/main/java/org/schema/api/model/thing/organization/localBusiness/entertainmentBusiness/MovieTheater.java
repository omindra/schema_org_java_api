package org.schema.api.model.thing.organization.localBusiness.entertainmentBusiness;

import org.schema.api.model.thing.organization.localBusiness.entertainmentBusiness.EntertainmentBusiness;

public class MovieTheater extends EntertainmentBusiness
{
	private Number screenCount;

	public Number getScreenCount()
	{
		return screenCount;
	}

	public void setScreenCount(Number screenCount)
	{
		this.screenCount = screenCount;
	}
}