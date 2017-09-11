package org.schema.api.model.thing.action.playAction;

import org.schema.api.model.thing.action.playAction.PlayAction;
import org.schema.api.model.thing.organization.localBusiness.entertainmentBusiness.EntertainmentBusiness;

public class PerformAction extends PlayAction
{
	private EntertainmentBusiness entertainmentBusiness;

	public EntertainmentBusiness getEntertainmentBusiness()
	{
		return entertainmentBusiness;
	}

	public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness)
	{
		this.entertainmentBusiness = entertainmentBusiness;
	}
}