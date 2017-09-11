package org.schema.api.model.thing.action.updateAction;

import org.schema.api.model.thing.action.updateAction.UpdateAction;
import org.schema.api.model.thing.Thing;

public class DeleteAction extends UpdateAction
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