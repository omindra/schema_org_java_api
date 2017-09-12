package org.schema.api.model.thing.intangible.service;

import org.schema.api.model.thing.organization.Organization;

public class GovernmentService extends Service
{
	private Organization serviceOperator;

	public Organization getServiceOperator()
	{
		return serviceOperator;
	}

	public void setServiceOperator(Organization serviceOperator)
	{
		this.serviceOperator = serviceOperator;
	}
}