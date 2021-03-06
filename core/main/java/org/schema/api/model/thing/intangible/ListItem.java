package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.intangible.ListItem;
import org.schema.api.model.thing.intangible.ListItem;

public class ListItem extends Intangible
{
	private Thing item;
	private ListItem nextItem;
	private String position;//Notes - Allowed types- [Integer, Text]
	private ListItem previousItem;

	public Thing getItem()
	{
		return item;
	}

	public void setItem(Thing item)
	{
		this.item = item;
	}

	public ListItem getNextItem()
	{
		return nextItem;
	}

	public void setNextItem(ListItem nextItem)
	{
		this.nextItem = nextItem;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public ListItem getPreviousItem()
	{
		return previousItem;
	}

	public void setPreviousItem(ListItem previousItem)
	{
		this.previousItem = previousItem;
	}
}