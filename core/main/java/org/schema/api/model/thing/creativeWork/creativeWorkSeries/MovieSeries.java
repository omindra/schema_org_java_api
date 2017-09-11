package org.schema.api.model.thing.creativeWork.creativeWorkSeries;

import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;

public class MovieSeries extends CreativeWorkSeries
{
	private Person actor;
	private Person director;
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
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

	public VideoObject getTrailer()
	{
		return trailer;
	}

	public void setTrailer(VideoObject trailer)
	{
		this.trailer = trailer;
	}
}