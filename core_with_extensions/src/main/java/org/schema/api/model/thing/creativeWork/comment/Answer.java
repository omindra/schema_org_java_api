package org.schema.api.model.thing.creativeWork.comment;

import org.schema.api.model.thing.creativeWork.Question;

public class Answer extends Comment
{
	private Integer downvoteCount;
	private Question parentItem;
	private Integer upvoteCount;

	public Integer getDownvoteCount()
	{
		return downvoteCount;
	}

	public void setDownvoteCount(Integer downvoteCount)
	{
		this.downvoteCount = downvoteCount;
	}

	public Question getParentItem()
	{
		return parentItem;
	}

	public void setParentItem(Question parentItem)
	{
		this.parentItem = parentItem;
	}

	public Integer getUpvoteCount()
	{
		return upvoteCount;
	}

	public void setUpvoteCount(Integer upvoteCount)
	{
		this.upvoteCount = upvoteCount;
	}
}