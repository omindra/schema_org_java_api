package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;

public class WebSite extends CreativeWork
{
	private String issn;

	public String getIssn()
	{
		return issn;
	}

	public void setIssn(String issn)
	{
		this.issn = issn;
	}
}