package org.schema.api.model.thing.action.updateAction.addAction.insertAction;

import org.schema.api.model.thing.action.updateAction.addAction.AddAction;
import org.schema.api.model.thing.place.Place;

public class InsertAction extends AddAction
{
	private Place toLocation;

	public Place getToLocation()
	{
		return toLocation;
	}

	public void setToLocation(Place toLocation)
	{
		this.toLocation = toLocation;
	}
}