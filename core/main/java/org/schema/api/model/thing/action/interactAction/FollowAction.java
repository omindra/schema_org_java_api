package org.schema.api.model.thing.action.interactAction;

import org.schema.api.model.thing.action.interactAction.InteractAction;
import org.schema.api.model.thing.organization.Organization;

public class FollowAction extends InteractAction
{
	private Organization followee;//Notes - Allowed types- [Organization, Person]

	public Organization getFollowee()
	{
		return followee;
	}

	public void setFollowee(Organization followee)
	{
		this.followee = followee;
	}
}