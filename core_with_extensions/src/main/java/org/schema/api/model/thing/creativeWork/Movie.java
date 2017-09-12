package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;
import org.schema.api.model.thing.place.administrativeArea.Country;

public class Movie extends CreativeWork
{
	private Person actor;
	private Country countryOfOrigin;
	private Person director;
	private Duration duration;//Notes - Allowed types- [Duration, ISO 8601 date format]
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private Organization productionCompany;
	private String subtitleLanguage;//Notes - Allowed types- [Language, Text]
	private VideoObject trailer;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public Country getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(Country countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public Duration getDuration()
	{
		return duration;
	}

	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public Organization getProductionCompany()
	{
		return productionCompany;
	}

	public void setProductionCompany(Organization productionCompany)
	{
		this.productionCompany = productionCompany;
	}

	public String getSubtitleLanguage()
	{
		return subtitleLanguage;
	}

	public void setSubtitleLanguage(String subtitleLanguage)
	{
		this.subtitleLanguage = subtitleLanguage;
	}

	public VideoObject getTrailer()
	{
		return trailer;
	}

	public void setTrailer(VideoObject trailer)
	{
		this.trailer = trailer;
	}
}