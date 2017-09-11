package org.schema.api.model.thing.intangible.audience;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.place.administrativeArea.AdministrativeArea;

public class Audience extends Intangible
{
	private String audienceType;
	private AdministrativeArea geographicArea;

	public String getAudienceType()
	{
		return audienceType;
	}

	public void setAudienceType(String audienceType)
	{
		this.audienceType = audienceType;
	}

	public AdministrativeArea getGeographicArea()
	{
		return geographicArea;
	}

	public void setGeographicArea(AdministrativeArea geographicArea)
	{
		this.geographicArea = geographicArea;
	}
}