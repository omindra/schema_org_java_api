package org.schema.api.model.thing.action.assessAction.chooseAction;

import org.schema.api.model.thing.Person;

public class VoteAction extends ChooseAction
{
	private Person candidate;

	public Person getCandidate()
	{
		return candidate;
	}

	public void setCandidate(Person candidate)
	{
		this.candidate = candidate;
	}
}