package org.schema.api.model.thing.organization.localBusiness.medicalOrganization;

import org.schema.api.model.thing.organization.localBusiness.medicalOrganization.MedicalOrganization;
import org.schema.api.model.thing.medicalEntity.medicalProcedure.MedicalProcedure;
import org.schema.api.model.thing.organization.localBusiness.emergencyService.Hospital;
import org.schema.api.model.thing.intangible.enumeration.medicalEnumeration.MedicalSpecialty;

public class Physician extends MedicalOrganization
{
	private MedicalProcedure availableService;//Notes - Allowed types- [MedicalProcedure, MedicalTest, MedicalTherapy]
	private Hospital hospitalAffiliation;
	private MedicalSpecialty medicalSpecialty;

	public MedicalProcedure getAvailableService()
	{
		return availableService;
	}

	public void setAvailableService(MedicalProcedure availableService)
	{
		this.availableService = availableService;
	}

	public Hospital getHospitalAffiliation()
	{
		return hospitalAffiliation;
	}

	public void setHospitalAffiliation(Hospital hospitalAffiliation)
	{
		this.hospitalAffiliation = hospitalAffiliation;
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