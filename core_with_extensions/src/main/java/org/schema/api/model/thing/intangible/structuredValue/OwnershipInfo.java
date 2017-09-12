package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.product.Product;

import java.util.Date;

public class OwnershipInfo extends StructuredValue
{
	private Organization acquiredFrom;//Notes - Allowed types- [Organization, Person]
	private Date ownedFrom;
	private Date ownedThrough;
	private Product typeOfGood;//Notes - Allowed types- [Product, Service]

	public Organization getAcquiredFrom()
	{
		return acquiredFrom;
	}

	public void setAcquiredFrom(Organization acquiredFrom)
	{
		this.acquiredFrom = acquiredFrom;
	}

	public Date getOwnedFrom()
	{
		return ownedFrom;
	}

	public void setOwnedFrom(Date ownedFrom)
	{
		this.ownedFrom = ownedFrom;
	}

	public Date getOwnedThrough()
	{
		return ownedThrough;
	}

	public void setOwnedThrough(Date ownedThrough)
	{
		this.ownedThrough = ownedThrough;
	}

	public Product getTypeOfGood()
	{
		return typeOfGood;
	}

	public void setTypeOfGood(Product typeOfGood)
	{
		this.typeOfGood = typeOfGood;
	}
}