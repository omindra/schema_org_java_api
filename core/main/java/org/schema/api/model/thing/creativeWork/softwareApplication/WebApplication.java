package org.schema.api.model.thing.creativeWork.softwareApplication;

import org.schema.api.model.thing.creativeWork.softwareApplication.SoftwareApplication;

public class WebApplication extends SoftwareApplication
{
	private String browserRequirements;

	public String getBrowserRequirements()
	{
		return browserRequirements;
	}

	public void setBrowserRequirements(String browserRequirements)
	{
		this.browserRequirements = browserRequirements;
	}
}