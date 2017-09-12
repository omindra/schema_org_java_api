package org.schema.api.model.thing.action.interactAction.communicateAction;

import org.schema.api.model.thing.creativeWork.comment.Comment;

public class ReplyAction extends CommunicateAction
{
	private Comment resultComment;

	public Comment getResultComment()
	{
		return resultComment;
	}

	public void setResultComment(Comment resultComment)
	{
		this.resultComment = resultComment;
	}
}