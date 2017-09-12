package org.schema.api.model.thing.creativeWork.game;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class Game extends CreativeWork
{
	private Thing characterAttribute;
	private Thing gameItem;
	private String gameLocation;//Notes - Allowed types- [Place, PostalAddress, URL]
	private QuantitativeValue numberOfPlayers;
	private Thing quest;

	public Thing getCharacterAttribute()
	{
		return characterAttribute;
	}

	public void setCharacterAttribute(Thing characterAttribute)
	{
		this.characterAttribute = characterAttribute;
	}

	public Thing getGameItem()
	{
		return gameItem;
	}

	public void setGameItem(Thing gameItem)
	{
		this.gameItem = gameItem;
	}

	public String getGameLocation()
	{
		return gameLocation;
	}

	public void setGameLocation(String gameLocation)
	{
		this.gameLocation = gameLocation;
	}

	public QuantitativeValue getNumberOfPlayers()
	{
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(QuantitativeValue numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}

	public Thing getQuest()
	{
		return quest;
	}

	public void setQuest(Thing quest)
	{
		this.quest = quest;
	}
}