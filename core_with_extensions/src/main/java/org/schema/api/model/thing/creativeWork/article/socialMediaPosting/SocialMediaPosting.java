package org.schema.api.model.thing.creativeWork.article.socialMediaPosting;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.article.Article;

public class SocialMediaPosting extends Article
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