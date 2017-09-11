package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;

public class PublicationVolume extends CreativeWork
{
	private String pageEnd;//Notes - Allowed types- [Integer, Text]
	private String pageStart;//Notes - Allowed types- [Integer, Text]
	private String pagination;
	private String volumeNumber;//Notes - Allowed types- [Integer, Text]

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

	public String getVolumeNumber()
	{
		return volumeNumber;
	}

	public void setVolumeNumber(String volumeNumber)
	{
		this.volumeNumber = volumeNumber;
	}
}