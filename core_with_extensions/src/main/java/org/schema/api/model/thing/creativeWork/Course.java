package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.event.CourseInstance;

public class Course extends CreativeWork
{
	private String courseCode;
	private String coursePrerequisites;//Notes - Allowed types- [AlignmentObject, Course, Text]
	private String educationalCredentialAwarded;//Notes - Allowed types- [Text, URL]
	private CourseInstance hasCourseInstance;

	public String getCourseCode()
	{
		return courseCode;
	}

	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getCoursePrerequisites()
	{
		return coursePrerequisites;
	}

	public void setCoursePrerequisites(String coursePrerequisites)
	{
		this.coursePrerequisites = coursePrerequisites;
	}

	public String getEducationalCredentialAwarded()
	{
		return educationalCredentialAwarded;
	}

	public void setEducationalCredentialAwarded(String educationalCredentialAwarded)
	{
		this.educationalCredentialAwarded = educationalCredentialAwarded;
	}

	public CourseInstance getHasCourseInstance()
	{
		return hasCourseInstance;
	}

	public void setHasCourseInstance(CourseInstance hasCourseInstance)
	{
		this.hasCourseInstance = hasCourseInstance;
	}
}