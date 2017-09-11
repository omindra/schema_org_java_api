package org.schema.api.model.thing.creativeWork.creativeWorkSeries.periodical;

import org.schema.api.model.thing.creativeWork.creativeWorkSeries.CreativeWorkSeries;
import java.util.Date;
import java.util.Date;

public class Periodical extends CreativeWorkSeries
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