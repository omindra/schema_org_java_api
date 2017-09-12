package org.schema.api.model.thing.creativeWork.softwareApplication;

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