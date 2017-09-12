package org.schema.api.model.thing.creativeWork.creativeWorkSeries;

import org.schema.api.model.thing.creativeWork.CreativeWork;

import java.util.Date;

public class CreativeWorkSeries extends CreativeWork
{
	private Date endDate;//Notes - Allowed types- [Date, DateTime]
	private String issn;
	private Date startDate;//Notes - Allowed types- [Date, DateTime]

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public String getIssn()
	{
		return issn;
	}

	public void setIssn(String issn)
	{
		this.issn = issn;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
}