package org.schema.api.model.thing.creativeWork.episode;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;

public class Episode extends CreativeWork
{
	private Person actor;
	private Person director;
	private String episodeNumber;//Notes - Allowed types- [Integer, Text]
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private CreativeWorkSeason partOfSeason;
	private CreativeWorkSeries partOfSeries;
	private Organization productionCompany;
	private VideoObject trailer;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public String getEpisodeNumber()
	{
		return episodeNumber;
	}

	public void setEpisodeNumber(String episodeNumber)
	{
		this.episodeNumber = episodeNumber;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public CreativeWorkSeason getPartOfSeason()
	{
		return partOfSeason;
	}

	public void setPartOfSeason(CreativeWorkSeason partOfSeason)
	{
		this.partOfSeason = partOfSeason;
	}

	public CreativeWorkSeries getPartOfSeries()
	{
		return partOfSeries;
	}

	public void setPartOfSeries(CreativeWorkSeries partOfSeries)
	{
		this.partOfSeries = partOfSeries;
	}

	public Organization getProductionCompany()
	{
		return productionCompany;
	}

	public void setProductionCompany(Organization productionCompany)
	{
		this.productionCompany = productionCompany;
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