package org.schema.api.model.thing.organization.localBusiness.financialService;

public class AccountingService extends FinancialService
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