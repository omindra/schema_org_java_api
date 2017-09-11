package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.article.socialMediaPosting.blogPosting.BlogPosting;

public class Blog extends CreativeWork
{
	private BlogPosting blogPost;
	private String issn;

	public BlogPosting getBlogPost()
	{
		return blogPost;
	}

	public void setBlogPost(BlogPosting blogPost)
	{
		this.blogPost = blogPost;
	}

	public String getIssn()
	{
		return issn;
	}

	public void setIssn(String issn)
	{
		this.issn = issn;
	}
}