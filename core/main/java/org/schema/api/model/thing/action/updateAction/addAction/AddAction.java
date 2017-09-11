package org.schema.api.model.thing.action.updateAction.addAction;

import org.schema.api.model.thing.action.updateAction.UpdateAction;
import org.schema.api.model.thing.Thing;

public class AddAction extends UpdateAction
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