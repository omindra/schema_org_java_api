package org.schema.api.model.thing.intangible.audience.peopleAudience;

import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.medicalEntity.medicalCondition.MedicalCondition;

public class PeopleAudience extends Audience
{
	private MedicalCondition healthCondition;
	private String requiredGender;
	private Integer requiredMaxAge;
	private Integer requiredMinAge;
	private String suggestedGender;
	private Number suggestedMaxAge;
	private Number suggestedMinAge;

	public MedicalCondition getHealthCondition()
	{
		return healthCondition;
	}

	public void setHealthCondition(MedicalCondition healthCondition)
	{
		this.healthCondition = healthCondition;
	}

	public String getRequiredGender()
	{
		return requiredGender;
	}

	public void setRequiredGender(String requiredGender)
	{
		this.requiredGender = requiredGender;
	}

	public Integer getRequiredMaxAge()
	{
		return requiredMaxAge;
	}

	public void setRequiredMaxAge(Integer requiredMaxAge)
	{
		this.requiredMaxAge = requiredMaxAge;
	}

	public Integer getRequiredMinAge()
	{
		return requiredMinAge;
	}

	public void setRequiredMinAge(Integer requiredMinAge)
	{
		this.requiredMinAge = requiredMinAge;
	}

	public String getSuggestedGender()
	{
		return suggestedGender;
	}

	public void setSuggestedGender(String suggestedGender)
	{
		this.suggestedGender = suggestedGender;
	}

	public Number getSuggestedMaxAge()
	{
		return suggestedMaxAge;
	}

	public void setSuggestedMaxAge(Number suggestedMaxAge)
	{
		this.suggestedMaxAge = suggestedMaxAge;
	}

	public Number getSuggestedMinAge()
	{
		return suggestedMinAge;
	}

	public void setSuggestedMinAge(Number suggestedMinAge)
	{
		this.suggestedMinAge = suggestedMinAge;
	}
}