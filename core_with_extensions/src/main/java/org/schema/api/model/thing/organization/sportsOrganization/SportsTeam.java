package org.schema.api.model.thing.organization.sportsOrganization;

import org.schema.api.model.thing.Person;

public class SportsTeam extends SportsOrganization
{
	private Person athlete;
	private Person coach;

	public Person getAthlete()
	{
		return athlete;
	}

	public void setAthlete(Person athlete)
	{
		this.athlete = athlete;
	}

	public Person getCoach()
	{
		return coach;
	}

	public void setCoach(Person coach)
	{
		this.coach = coach;
	}
}