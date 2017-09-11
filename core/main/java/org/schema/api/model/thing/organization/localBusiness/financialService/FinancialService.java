package org.schema.api.model.thing.organization.localBusiness.financialService;

import org.schema.api.model.thing.organization.localBusiness.LocalBusiness;

public class FinancialService extends LocalBusiness
{
	private String feesAndCommissionsSpecification;//Notes - Allowed types- [Text, URL]

	public String getFeesAndCommissionsSpecification()
	{
		return feesAndCommissionsSpecification;
	}

	public void setFeesAndCommissionsSpecification(String feesAndCommissionsSpecification)
	{
		this.feesAndCommissionsSpecification = feesAndCommissionsSpecification;
	}
}