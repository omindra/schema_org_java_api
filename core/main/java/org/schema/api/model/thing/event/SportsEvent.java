package org.schema.api.model.thing.event;

import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;

public class SportsEvent extends Event
{
	private Person awayTeam;//Notes - Allowed types- [Person, SportsTeam]
	private Person competitor;//Notes - Allowed types- [Person, SportsTeam]
	private Person homeTeam;//Notes - Allowed types- [Person, SportsTeam]

	public Person getAwayTeam()
	{
		return awayTeam;
	}

	public void setAwayTeam(Person awayTeam)
	{
		this.awayTeam = awayTeam;
	}

	public Person getCompetitor()
	{
		return competitor;
	}

	public void setCompetitor(Person competitor)
	{
		this.competitor = competitor;
	}

	public Person getHomeTeam()
	{
		return homeTeam;
	}

	public void setHomeTeam(Person homeTeam)
	{
		this.homeTeam = homeTeam;
	}
}