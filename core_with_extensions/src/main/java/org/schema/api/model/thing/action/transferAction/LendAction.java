package org.schema.api.model.thing.action.transferAction;

import org.schema.api.model.thing.Person;

public class LendAction extends TransferAction
{
	private Person borrower;

	public Person getBorrower()
	{
		return borrower;
	}

	public void setBorrower(Person borrower)
	{
		this.borrower = borrower;
	}
}