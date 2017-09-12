package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.enumeration.DigitalDocumentPermissionType;

public class DigitalDocumentPermission extends Intangible
{
	private Audience grantee;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]
	private DigitalDocumentPermissionType permissionType;

	public Audience getGrantee()
	{
		return grantee;
	}

	public void setGrantee(Audience grantee)
	{
		this.grantee = grantee;
	}

	public DigitalDocumentPermissionType getPermissionType()
	{
		return permissionType;
	}

	public void setPermissionType(DigitalDocumentPermissionType permissionType)
	{
		this.permissionType = permissionType;
	}
}