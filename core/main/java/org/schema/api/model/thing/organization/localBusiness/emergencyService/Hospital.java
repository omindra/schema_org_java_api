package org.schema.api.model.thing.organization.localBusiness.emergencyService;

import org.schema.api.model.thing.organization.localBusiness.emergencyService.EmergencyService;
import org.schema.api.model.thing.medicalEntity.medicalProcedure.MedicalProcedure;
import org.schema.api.model.thing.intangible.enumeration.medicalEnumeration.MedicalSpecialty;

public class Hospital extends EmergencyService
{
	private MedicalProcedure availableService;//Notes - Allowed types- [MedicalProcedure, MedicalTest, MedicalTherapy]
	private MedicalSpecialty medicalSpecialty;

	public MedicalProcedure getAvailableService()
	{
		return availableService;
	}

	public void setAvailableService(MedicalProcedure availableService)
	{
		this.availableService = availableService;
	}

	public MedicalSpecialty getMedicalSpecialty()
	{
		return medicalSpecialty;
	}

	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty)
	{
		this.medicalSpecialty = medicalSpecialty;
	}
}