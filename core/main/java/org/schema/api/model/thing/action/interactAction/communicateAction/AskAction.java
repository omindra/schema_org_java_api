package org.schema.api.model.thing.action.interactAction.communicateAction;

import org.schema.api.model.thing.action.interactAction.communicateAction.CommunicateAction;
import org.schema.api.model.thing.creativeWork.Question;

public class AskAction extends CommunicateAction
{
	private Question question;

	public Question getQuestion()
	{
		return question;
	}

	public void setQuestion(Question question)
	{
		this.question = question;
	}
}