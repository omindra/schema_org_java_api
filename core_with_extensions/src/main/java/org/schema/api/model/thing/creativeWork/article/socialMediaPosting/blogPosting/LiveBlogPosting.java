package org.schema.api.model.thing.creativeWork.article.socialMediaPosting.blogPosting;

import java.util.Date;

public class LiveBlogPosting extends BlogPosting
{
	private Date coverageEndTime;
	private Date coverageStartTime;
	private BlogPosting liveBlogUpdate;

	public Date getCoverageEndTime()
	{
		return coverageEndTime;
	}

	public void setCoverageEndTime(Date coverageEndTime)
	{
		this.coverageEndTime = coverageEndTime;
	}

	public Date getCoverageStartTime()
	{
		return coverageStartTime;
	}

	public void setCoverageStartTime(Date coverageStartTime)
	{
		this.coverageStartTime = coverageStartTime;
	}

	public BlogPosting getLiveBlogUpdate()
	{
		return liveBlogUpdate;
	}

	public void setLiveBlogUpdate(BlogPosting liveBlogUpdate)
	{
		this.liveBlogUpdate = liveBlogUpdate;
	}
}