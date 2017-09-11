package org.schema.api.model.thing.intangible.role.organizationRole;

import org.schema.api.model.thing.intangible.role.organizationRole.OrganizationRole;

public class EmployeeRole extends OrganizationRole
{
	private Number baseSalary;//Notes - Allowed types- [MonetaryAmount, Number, PriceSpecification]
	private String salaryCurrency;//Notes - Allowed types- [Text, ISO 4217]

	public Number getBaseSalary()
	{
		return baseSalary;
	}

	public void setBaseSalary(Number baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public String getSalaryCurrency()
	{
		return salaryCurrency;
	}

	public void setSalaryCurrency(String salaryCurrency)
	{
		this.salaryCurrency = salaryCurrency;
	}
}