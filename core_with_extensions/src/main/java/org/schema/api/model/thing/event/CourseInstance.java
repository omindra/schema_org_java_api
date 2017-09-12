package org.schema.api.model.thing.event;

import org.schema.api.model.thing.Person;

public class CourseInstance extends Event
{
	private String courseMode;//Notes - Allowed types- [Text, URL]
	private Person instructor;

	public String getCourseMode()
	{
		return courseMode;
	}

	public void setCourseMode(String courseMode)
	{
		this.courseMode = courseMode;
	}

	public Person getInstructor()
	{
		return instructor;
	}

	public void setInstructor(Person instructor)
	{
		this.instructor = instructor;
	}
}