package org.schema.api.model.thing.action.interactAction.communicateAction;

import org.schema.api.model.thing.action.interactAction.communicateAction.CommunicateAction;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.intangible.audience.Audience;

public class ShareAction extends CommunicateAction
{
	private Thing about;
	private String inLanguage;//Notes - Allowed types- [Language, Text]
	private Audience recipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]

	public Thing getAbout()
	{
		return about;
	}

	public void setAbout(Thing about)
	{
		this.about = about;
	}

	public String getInLanguage()
	{
		return inLanguage;
	}

	public void setInLanguage(String inLanguage)
	{
		this.inLanguage = inLanguage;
	}

	public Audience getRecipient()
	{
		return recipient;
	}

	public void setRecipient(Audience recipient)
	{
		this.recipient = recipient;
	}
}