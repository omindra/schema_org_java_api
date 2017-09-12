package org.schema.api.model.thing.action.organizeAction.planAction;

import java.util.Date;

public class ScheduleAction extends PlanAction
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