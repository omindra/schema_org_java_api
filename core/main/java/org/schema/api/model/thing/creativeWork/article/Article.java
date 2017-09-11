package org.schema.api.model.thing.creativeWork.article;

import org.schema.api.model.thing.creativeWork.CreativeWork;

public class Article extends CreativeWork
{
	private String articleBody;
	private String articleSection;
	private String pageEnd;//Notes - Allowed types- [Integer, Text]
	private String pageStart;//Notes - Allowed types- [Integer, Text]
	private String pagination;
	private String speakable;//Notes - Allowed types- [SpeakableSpecification, URL]
	private Integer wordCount;

	public String getArticleBody()
	{
		return articleBody;
	}

	public void setArticleBody(String articleBody)
	{
		this.articleBody = articleBody;
	}

	public String getArticleSection()
	{
		return articleSection;
	}

	public void setArticleSection(String articleSection)
	{
		this.articleSection = articleSection;
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

	public String getSpeakable()
	{
		return speakable;
	}

	public void setSpeakable(String speakable)
	{
		this.speakable = speakable;
	}

	public Integer getWordCount()
	{
		return wordCount;
	}

	public void setWordCount(Integer wordCount)
	{
		this.wordCount = wordCount;
	}
}