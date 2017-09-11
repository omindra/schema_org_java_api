package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.audience.Audience;

public class EmailMessage extends CreativeWork
{
	private ContactPoint bccRecipient;//Notes - Allowed types- [ContactPoint, Organization, Person]
	private ContactPoint ccRecipient;//Notes - Allowed types- [ContactPoint, Organization, Person]
	private Date dateRead;
	private Date dateReceived;
	private Date dateSent;
	private CreativeWork messageAttachment;
	private Audience recipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]
	private Audience sender;//Notes - Allowed types- [Audience, Organization, Person]
	private Audience toRecipient;//Notes - Allowed types- [Audience, ContactPoint, Organization, Person]

	public ContactPoint getBccRecipient()
	{
		return bccRecipient;
	}

	public void setBccRecipient(ContactPoint bccRecipient)
	{
		this.bccRecipient = bccRecipient;
	}

	public ContactPoint getCcRecipient()
	{
		return ccRecipient;
	}

	public void setCcRecipient(ContactPoint ccRecipient)
	{
		this.ccRecipient = ccRecipient;
	}

	public Date getDateRead()
	{
		return dateRead;
	}

	public void setDateRead(Date dateRead)
	{
		this.dateRead = dateRead;
	}

	public Date getDateReceived()
	{
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived)
	{
		this.dateReceived = dateReceived;
	}

	public Date getDateSent()
	{
		return dateSent;
	}

	public void setDateSent(Date dateSent)
	{
		this.dateSent = dateSent;
	}

	public CreativeWork getMessageAttachment()
	{
		return messageAttachment;
	}

	public void setMessageAttachment(CreativeWork messageAttachment)
	{
		this.messageAttachment = messageAttachment;
	}

	public Audience getRecipient()
	{
		return recipient;
	}

	public void setRecipient(Audience recipient)
	{
		this.recipient = recipient;
	}

	public Audience getSender()
	{
		return sender;
	}

	public void setSender(Audience sender)
	{
		this.sender = sender;
	}

	public Audience getToRecipient()
	{
		return toRecipient;
	}

	public void setToRecipient(Audience toRecipient)
	{
		this.toRecipient = toRecipient;
	}
}