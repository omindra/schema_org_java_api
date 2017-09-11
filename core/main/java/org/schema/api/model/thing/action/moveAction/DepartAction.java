package org.schema.api.model.thing.action.moveAction;

import org.schema.api.model.thing.action.moveAction.MoveAction;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.place.Place;

public class DepartAction extends MoveAction
{
	private Place fromLocation;
	private Place toLocation;

	public Place getFromLocation()
	{
		return fromLocation;
	}

	public void setFromLocation(Place fromLocation)
	{
		this.fromLocation = fromLocation;
	}

	public Place getToLocation()
	{
		return toLocation;
	}

	public void setToLocation(Place toLocation)
	{
		this.toLocation = toLocation;
	}
}