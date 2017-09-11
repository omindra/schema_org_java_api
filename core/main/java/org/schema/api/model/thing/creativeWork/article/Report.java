package org.schema.api.model.thing.creativeWork.article;

import org.schema.api.model.thing.creativeWork.article.Article;

public class Report extends Article
{
	private String reportNumber;

	public String getReportNumber()
	{
		return reportNumber;
	}

	public void setReportNumber(String reportNumber)
	{
		this.reportNumber = reportNumber;
	}
}