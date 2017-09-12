package org.schema.api.model.thing.intangible.audience.peopleAudience;

public class ParentAudience extends PeopleAudience
{
	private Number childMaxAge;
	private Number childMinAge;

	public Number getChildMaxAge()
	{
		return childMaxAge;
	}

	public void setChildMaxAge(Number childMaxAge)
	{
		this.childMaxAge = childMaxAge;
	}

	public Number getChildMinAge()
	{
		return childMinAge;
	}

	public void setChildMinAge(Number childMinAge)
	{
		this.childMinAge = childMinAge;
	}
}