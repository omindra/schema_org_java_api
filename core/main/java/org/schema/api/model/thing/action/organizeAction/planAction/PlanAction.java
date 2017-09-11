package org.schema.api.model.thing.action.organizeAction.planAction;

import org.schema.api.model.thing.action.organizeAction.OrganizeAction;
import java.util.Date;

public class PlanAction extends OrganizeAction
{
	private Date scheduledTime;

	public Date getScheduledTime()
	{
		return scheduledTime;
	}

	public void setScheduledTime(Date scheduledTime)
	{
		this.scheduledTime = scheduledTime;
	}
}