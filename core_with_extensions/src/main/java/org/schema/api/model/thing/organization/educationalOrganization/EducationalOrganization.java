package org.schema.api.model.thing.organization.educationalOrganization;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.Organization;

public class EducationalOrganization extends Organization
{
	private Person alumni;

	public Person getAlumni()
	{
		return alumni;
	}

	public void setAlumni(Person alumni)
	{
		this.alumni = alumni;
	}
}