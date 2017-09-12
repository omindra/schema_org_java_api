package org.schema.api.model.thing.creativeWork.clip;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.creativeWorkSeason.CreativeWorkSeason;
import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import org.schema.api.model.thing.creativeWork.episode.Episode;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;

public class TVClip extends Clip
{
	private Person actor;
	private String clipNumber;//Notes - Allowed types- [Integer, Text]
	private Person director;
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private Episode partOfEpisode;
	private CreativeWorkSeason partOfSeason;
	private CreativeWorkSeries partOfSeries;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public String getClipNumber()
	{
		return clipNumber;
	}

	public void setClipNumber(String clipNumber)
	{
		this.clipNumber = clipNumber;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public Episode getPartOfEpisode()
	{
		return partOfEpisode;
	}

	public void setPartOfEpisode(Episode partOfEpisode)
	{
		this.partOfEpisode = partOfEpisode;
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
}