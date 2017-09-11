package org.schema.api.model.thing.organization.localBusiness.medicalOrganization;

import org.schema.api.model.thing.organization.localBusiness.medicalOrganization.MedicalOrganization;
import org.schema.api.model.thing.intangible.enumeration.medicalEnumeration.MedicalSpecialty;

public class Pharmacy extends MedicalOrganization
{
	private String healthPlanNetworkId;
	private Boolean isAcceptingNewPatients;
	private MedicalSpecialty medicalSpecialty;

	public String getHealthPlanNetworkId()
	{
		return healthPlanNetworkId;
	}

	public void setHealthPlanNetworkId(String healthPlanNetworkId)
	{
		this.healthPlanNetworkId = healthPlanNetworkId;
	}

	public Boolean getIsAcceptingNewPatients()
	{
		return isAcceptingNewPatients;
	}

	public void setIsAcceptingNewPatients(Boolean isAcceptingNewPatients)
	{
		this.isAcceptingNewPatients = isAcceptingNewPatients;
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