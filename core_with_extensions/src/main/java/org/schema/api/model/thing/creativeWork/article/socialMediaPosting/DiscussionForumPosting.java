package org.schema.api.model.thing.creativeWork.article.socialMediaPosting;

import org.schema.api.model.thing.creativeWork.CreativeWork;

public class DiscussionForumPosting extends SocialMediaPosting
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