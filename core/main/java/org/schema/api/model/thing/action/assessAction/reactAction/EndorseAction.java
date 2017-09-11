package org.schema.api.model.thing.action.assessAction.reactAction;

import org.schema.api.model.thing.action.assessAction.reactAction.ReactAction;
import org.schema.api.model.thing.organization.Organization;

public class EndorseAction extends ReactAction
{
	private Organization endorsee;//Notes - Allowed types- [Organization, Person]

	public Organization getEndorsee()
	{
		return endorsee;
	}

	public void setEndorsee(Organization endorsee)
	{
		this.endorsee = endorsee;
	}
}