package org.schema.api.model.thing.action.updateAction;

import org.schema.api.model.thing.Thing;

public class ReplaceAction extends UpdateAction
{
	private Thing replacee;
	private Thing replacer;

	public Thing getReplacee()
	{
		return replacee;
	}

	public void setReplacee(Thing replacee)
	{
		this.replacee = replacee;
	}

	public Thing getReplacer()
	{
		return replacer;
	}

	public void setReplacer(Thing replacer)
	{
		this.replacer = replacer;
	}
}