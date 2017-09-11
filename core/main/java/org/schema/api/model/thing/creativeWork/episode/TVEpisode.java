package org.schema.api.model.thing.creativeWork.episode;

import org.schema.api.model.thing.creativeWork.episode.Episode;
import org.schema.api.model.thing.place.administrativeArea.Country;

public class TVEpisode extends Episode
{
	private Country countryOfOrigin;
	private String subtitleLanguage;//Notes - Allowed types- [Language, Text]

	public Country getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(Country countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getSubtitleLanguage()
	{
		return subtitleLanguage;
	}

	public void setSubtitleLanguage(String subtitleLanguage)
	{
		this.subtitleLanguage = subtitleLanguage;
	}
}