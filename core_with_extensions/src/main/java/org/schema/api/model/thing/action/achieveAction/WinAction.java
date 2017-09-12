package org.schema.api.model.thing.action.achieveAction;

import org.schema.api.model.thing.Person;

public class WinAction extends AchieveAction
{
	private Person loser;

	public Person getLoser()
	{
		return loser;
	}

	public void setLoser(Person loser)
	{
		this.loser = loser;
	}
}