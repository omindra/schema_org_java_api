package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.comment.Answer;
import org.schema.api.model.thing.creativeWork.comment.Answer;

public class Question extends CreativeWork
{
	private Answer acceptedAnswer;
	private Integer answerCount;
	private Integer downvoteCount;
	private Answer suggestedAnswer;
	private Integer upvoteCount;

	public Answer getAcceptedAnswer()
	{
		return acceptedAnswer;
	}

	public void setAcceptedAnswer(Answer acceptedAnswer)
	{
		this.acceptedAnswer = acceptedAnswer;
	}

	public Integer getAnswerCount()
	{
		return answerCount;
	}

	public void setAnswerCount(Integer answerCount)
	{
		this.answerCount = answerCount;
	}

	public Integer getDownvoteCount()
	{
		return downvoteCount;
	}

	public void setDownvoteCount(Integer downvoteCount)
	{
		this.downvoteCount = downvoteCount;
	}

	public Answer getSuggestedAnswer()
	{
		return suggestedAnswer;
	}

	public void setSuggestedAnswer(Answer suggestedAnswer)
	{
		this.suggestedAnswer = suggestedAnswer;
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