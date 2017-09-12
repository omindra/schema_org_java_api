package org.schema.api.model.thing.organization.sportsOrganization;

import org.schema.api.model.thing.organization.Organization;

public class SportsOrganization extends Organization
{
	private String sport;//Notes - Allowed types- [Text, URL]

	public String getSport()
	{
		return sport;
	}

	public void setSport(String sport)
	{
		this.sport = sport;
	}
}