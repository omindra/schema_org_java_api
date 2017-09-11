package org.schema.api.model.thing.creativeWork.creativeWorkSeason;

import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.place.administrativeArea.Country;

public class TVSeason extends CreativeWorkSeason
{
	private Country countryOfOrigin;

	public Country getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(Country countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
}