package org.schema.api.model.thing.intangible.audience;

import org.schema.api.model.thing.intangible.audience.Audience;

public class EducationalAudience extends Audience
{
	private String educationalRole;

	public String getEducationalRole()
	{
		return educationalRole;
	}

	public void setEducationalRole(String educationalRole)
	{
		this.educationalRole = educationalRole;
	}
}