package org.schema.api.model.thing.organization.educationalOrganization;

import org.schema.api.model.thing.organization.educationalOrganization.EducationalOrganization;
import org.schema.api.model.thing.Person;

public class CollegeOrUniversity extends EducationalOrganization
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