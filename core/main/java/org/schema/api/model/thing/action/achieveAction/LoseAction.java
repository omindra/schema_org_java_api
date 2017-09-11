package org.schema.api.model.thing.action.achieveAction;

import org.schema.api.model.thing.action.achieveAction.AchieveAction;
import org.schema.api.model.thing.Person;

public class LoseAction extends AchieveAction
{
	private Person winner;

	public Person getWinner()
	{
		return winner;
	}

	public void setWinner(Person winner)
	{
		this.winner = winner;
	}
}