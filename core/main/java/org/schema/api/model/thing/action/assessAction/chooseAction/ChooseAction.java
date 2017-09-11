package org.schema.api.model.thing.action.assessAction.chooseAction;

import org.schema.api.model.thing.action.assessAction.AssessAction;

public class ChooseAction extends AssessAction
{
	private String actionOption;//Notes - Allowed types- [Text, Thing]

	public String getActionOption()
	{
		return actionOption;
	}

	public void setActionOption(String actionOption)
	{
		this.actionOption = actionOption;
	}
}