package org.schema.api.model.thing.creativeWork.creativeWorkSeries;

import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.place.administrativeArea.Country;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.episode.Episode;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;

public class TVSeries extends CreativeWorkSeries
{
	private Person actor;
	private CreativeWorkSeason containsSeason;
	private Country countryOfOrigin;
	private Person director;
	private Episode episode;//Notes - Allowed types- [Episode, episodes]
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private Integer numberOfEpisodes;
	private Integer numberOfSeasons;
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

	public CreativeWorkSeason getContainsSeason()
	{
		return containsSeason;
	}

	public void setContainsSeason(CreativeWorkSeason containsSeason)
	{
		this.containsSeason = containsSeason;
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

	public Episode getEpisode()
	{
		return episode;
	}

	public void setEpisode(Episode episode)
	{
		this.episode = episode;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public Integer getNumberOfEpisodes()
	{
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(Integer numberOfEpisodes)
	{
		this.numberOfEpisodes = numberOfEpisodes;
	}

	public Integer getNumberOfSeasons()
	{
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(Integer numberOfSeasons)
	{
		this.numberOfSeasons = numberOfSeasons;
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