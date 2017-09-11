package org.schema.api.model.thing.action.tradeAction;

import org.schema.api.model.thing.action.tradeAction.TradeAction;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.localBusiness.RealEstateAgent;

public class RentAction extends TradeAction
{
	private Organization landlord;//Notes - Allowed types- [Organization, Person]
	private RealEstateAgent realEstateAgent;

	public Organization getLandlord()
	{
		return landlord;
	}

	public void setLandlord(Organization landlord)
	{
		this.landlord = landlord;
	}

	public RealEstateAgent getRealEstateAgent()
	{
		return realEstateAgent;
	}

	public void setRealEstateAgent(RealEstateAgent realEstateAgent)
	{
		this.realEstateAgent = realEstateAgent;
	}
}