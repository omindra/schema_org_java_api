package org.schema.api.model.thing.event.userInteraction;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class UserComments extends UserInteraction
{
	private String commentText;
	private Date commentTime;//Notes - Allowed types- [Date, DateTime]
	private Organization creator;//Notes - Allowed types- [Organization, Person]
	private CreativeWork discusses;
	private String replyToUrl;

	public String getCommentText()
	{
		return commentText;
	}

	public void setCommentText(String commentText)
	{
		this.commentText = commentText;
	}

	public Date getCommentTime()
	{
		return commentTime;
	}

	public void setCommentTime(Date commentTime)
	{
		this.commentTime = commentTime;
	}

	public Organization getCreator()
	{
		return creator;
	}

	public void setCreator(Organization creator)
	{
		this.creator = creator;
	}

	public CreativeWork getDiscusses()
	{
		return discusses;
	}

	public void setDiscusses(CreativeWork discusses)
	{
		this.discusses = discusses;
	}

	public String getReplyToUrl()
	{
		return replyToUrl;
	}

	public void setReplyToUrl(String replyToUrl)
	{
		this.replyToUrl = replyToUrl;
	}
}