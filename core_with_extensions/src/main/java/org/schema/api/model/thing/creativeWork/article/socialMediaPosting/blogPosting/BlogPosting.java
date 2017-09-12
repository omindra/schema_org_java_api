package org.schema.api.model.thing.creativeWork.article.socialMediaPosting.blogPosting;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.article.socialMediaPosting.SocialMediaPosting;

public class BlogPosting extends SocialMediaPosting
{
	private CreativeWork sharedContent;

	public CreativeWork getSharedContent()
	{
		return sharedContent;
	}

	public void setSharedContent(CreativeWork sharedContent)
	{
		this.sharedContent = sharedContent;
	}
}