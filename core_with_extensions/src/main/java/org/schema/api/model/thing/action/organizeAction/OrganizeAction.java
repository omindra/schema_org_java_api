package org.schema.api.model.thing.action.organizeAction;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.action.Action;
import org.schema.api.model.thing.intangible.EntryPoint;
import org.schema.api.model.thing.intangible.enumeration.ActionStatusType;
import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class OrganizeAction extends Action
{
	private ActionStatusType actionStatus;
	private Organization agent;//Notes - Allowed types- [Organization, Person]
	private Date endTime;
	private Thing error;
	private Thing instrument;
	private String location;//Notes - Allowed types- [Place, PostalAddress, Text]
	private Thing object;
	private Organization participant;//Notes - Allowed types- [Organization, Person]
	private Thing result;
	private Date startTime;
	private EntryPoint target;

	public ActionStatusType getActionStatus()
	{
		return actionStatus;
	}

	public void setActionStatus(ActionStatusType actionStatus)
	{
		this.actionStatus = actionStatus;
	}

	public Organization getAgent()
	{
		return agent;
	}

	public void setAgent(Organization agent)
	{
		this.agent = agent;
	}

	public Date getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}

	public Thing getError()
	{
		return error;
	}

	public void setError(Thing error)
	{
		this.error = error;
	}

	public Thing getInstrument()
	{
		return instrument;
	}

	public void setInstrument(Thing instrument)
	{
		this.instrument = instrument;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public Thing getObject()
	{
		return object;
	}

	public void setObject(Thing object)
	{
		this.object = object;
	}

	public Organization getParticipant()
	{
		return participant;
	}

	public void setParticipant(Organization participant)
	{
		this.participant = participant;
	}

	public Thing getResult()
	{
		return result;
	}

	public void setResult(Thing result)
	{
		this.result = result;
	}

	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}

	public EntryPoint getTarget()
	{
		return target;
	}

	public void setTarget(EntryPoint target)
	{
		this.target = target;
	}
}