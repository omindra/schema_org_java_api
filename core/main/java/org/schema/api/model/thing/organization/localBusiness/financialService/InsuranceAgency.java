package org.schema.api.model.thing.organization.localBusiness.financialService;

import org.schema.api.model.thing.organization.localBusiness.financialService.FinancialService;

public class InsuranceAgency extends FinancialService
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