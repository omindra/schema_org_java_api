package org.schema.api.model.thing.intangible.role.organizationRole;

import org.schema.api.model.thing.intangible.role.Role;

public class OrganizationRole extends Role
{
	private Number numberedPosition;

	public Number getNumberedPosition()
	{
		return numberedPosition;
	}

	public void setNumberedPosition(Number numberedPosition)
	{
		this.numberedPosition = numberedPosition;
	}
}