package org.schema.api.model.thing.intangible.role;

import org.schema.api.model.thing.intangible.Intangible;
import java.util.Date;
import java.util.Date;

public class Role extends Intangible
{
	private Date endDate;//Notes - Allowed types- [Date, DateTime]
	private String roleName;//Notes - Allowed types- [Text, URL]
	private Date startDate;//Notes - Allowed types- [Date, DateTime]

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
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