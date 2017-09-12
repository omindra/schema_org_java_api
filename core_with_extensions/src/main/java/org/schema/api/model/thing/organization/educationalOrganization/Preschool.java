package org.schema.api.model.thing.organization.educationalOrganization;

import org.schema.api.model.thing.Person;

public class Preschool extends EducationalOrganization
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