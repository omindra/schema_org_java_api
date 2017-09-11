package org.schema.api.model.thing.action.organizeAction.allocateAction;

import org.schema.api.model.thing.action.organizeAction.OrganizeAction;
import org.schema.api.model.thing.intangible.enumeration.MedicalDevicePurpose;

public class AllocateAction extends OrganizeAction
{
	private MedicalDevicePurpose purpose;//Notes - Allowed types- [MedicalDevicePurpose, Thing]

	public MedicalDevicePurpose getPurpose()
	{
		return purpose;
	}

	public void setPurpose(MedicalDevicePurpose purpose)
	{
		this.purpose = purpose;
	}
}