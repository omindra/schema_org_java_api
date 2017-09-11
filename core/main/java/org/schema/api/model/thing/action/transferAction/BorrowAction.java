package org.schema.api.model.thing.action.transferAction;

import org.schema.api.model.thing.action.transferAction.TransferAction;
import org.schema.api.model.thing.organization.Organization;

public class BorrowAction extends TransferAction
{
	private Organization lender;//Notes - Allowed types- [Organization, Person]

	public Organization getLender()
	{
		return lender;
	}

	public void setLender(Organization lender)
	{
		this.lender = lender;
	}
}