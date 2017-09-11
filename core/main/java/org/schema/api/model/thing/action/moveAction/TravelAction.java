package org.schema.api.model.thing.action.moveAction;

import org.schema.api.model.thing.action.moveAction.MoveAction;
import org.schema.api.model.thing.intangible.quantity.Distance;

public class TravelAction extends MoveAction
{
	private Distance distance;

	public Distance getDistance()
	{
		return distance;
	}

	public void setDistance(Distance distance)
	{
		this.distance = distance;
	}
}