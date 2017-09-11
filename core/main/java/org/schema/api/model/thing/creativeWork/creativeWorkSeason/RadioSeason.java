package org.schema.api.model.thing.creativeWork.creativeWorkSeason;

import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.episode.Episode;
import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;

public class RadioSeason extends CreativeWorkSeason
{
	private Person actor;
	private Person director;
	private Date endDate;//Notes - Allowed types- [Date, DateTime]
	private Episode episode;//Notes - Allowed types- [Episode, episodes]
	private Integer numberOfEpisodes;
	private CreativeWorkSeries partOfSeries;
	private Organization productionCompany;
	private String seasonNumber;//Notes - Allowed types- [Integer, Text]
	private Date startDate;//Notes - Allowed types- [Date, DateTime]
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

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public Episode getEpisode()
	{
		return episode;
	}

	public void setEpisode(Episode episode)
	{
		this.episode = episode;
	}

	public Integer getNumberOfEpisodes()
	{
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(Integer numberOfEpisodes)
	{
		this.numberOfEpisodes = numberOfEpisodes;
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

	public String getSeasonNumber()
	{
		return seasonNumber;
	}

	public void setSeasonNumber(String seasonNumber)
	{
		this.seasonNumber = seasonNumber;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
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