package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;

public class AlignmentObject extends Intangible
{
	private String alignmentType;
	private String educationalFramework;
	private String targetDescription;
	private String targetName;
	private String targetUrl;

	public String getAlignmentType()
	{
		return alignmentType;
	}

	public void setAlignmentType(String alignmentType)
	{
		this.alignmentType = alignmentType;
	}

	public String getEducationalFramework()
	{
		return educationalFramework;
	}

	public void setEducationalFramework(String educationalFramework)
	{
		this.educationalFramework = educationalFramework;
	}

	public String getTargetDescription()
	{
		return targetDescription;
	}

	public void setTargetDescription(String targetDescription)
	{
		this.targetDescription = targetDescription;
	}

	public String getTargetName()
	{
		return targetName;
	}

	public void setTargetName(String targetName)
	{
		this.targetName = targetName;
	}

	public String getTargetUrl()
	{
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl)
	{
		this.targetUrl = targetUrl;
	}
}