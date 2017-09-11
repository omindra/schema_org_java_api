package org.schema.api.model.thing.action.updateAction;

import org.schema.api.model.thing.action.Action;
import org.schema.api.model.thing.Thing;

public class UpdateAction extends Action
{
	private Thing targetCollection;

	public Thing getTargetCollection()
	{
		return targetCollection;
	}

	public void setTargetCollection(Thing targetCollection)
	{
		this.targetCollection = targetCollection;
	}
}