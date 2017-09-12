package org.schema.api.model.thing.creativeWork.publicationIssue;

import org.schema.api.model.thing.creativeWork.CreativeWork;

public class PublicationIssue extends CreativeWork
{
	private String issueNumber;//Notes - Allowed types- [Integer, Text]
	private String pageEnd;//Notes - Allowed types- [Integer, Text]
	private String pageStart;//Notes - Allowed types- [Integer, Text]
	private String pagination;

	public String getIssueNumber()
	{
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber)
	{
		this.issueNumber = issueNumber;
	}

	public String getPageEnd()
	{
		return pageEnd;
	}

	public void setPageEnd(String pageEnd)
	{
		this.pageEnd = pageEnd;
	}

	public String getPageStart()
	{
		return pageStart;
	}

	public void setPageStart(String pageStart)
	{
		this.pageStart = pageStart;
	}

	public String getPagination()
	{
		return pagination;
	}

	public void setPagination(String pagination)
	{
		this.pagination = pagination;
	}
}