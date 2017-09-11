package org.schema.api.model.thing.creativeWork.article;

import org.schema.api.model.thing.creativeWork.article.Article;

public class NewsArticle extends Article
{
	private String dateline;
	private String printColumn;
	private String printEdition;
	private String printPage;
	private String printSection;

	public String getDateline()
	{
		return dateline;
	}

	public void setDateline(String dateline)
	{
		this.dateline = dateline;
	}

	public String getPrintColumn()
	{
		return printColumn;
	}

	public void setPrintColumn(String printColumn)
	{
		this.printColumn = printColumn;
	}

	public String getPrintEdition()
	{
		return printEdition;
	}

	public void setPrintEdition(String printEdition)
	{
		this.printEdition = printEdition;
	}

	public String getPrintPage()
	{
		return printPage;
	}

	public void setPrintPage(String printPage)
	{
		this.printPage = printPage;
	}

	public String getPrintSection()
	{
		return printSection;
	}

	public void setPrintSection(String printSection)
	{
		this.printSection = printSection;
	}
}