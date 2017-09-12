package org.schema.api.model.thing.action.organizeAction.allocateAction;

import org.schema.api.model.thing.intangible.enumeration.medicalEnumeration.MedicalDevicePurpose;

public class AssignAction extends AllocateAction
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