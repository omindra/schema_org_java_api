package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.Thing;

public class DataFeedItem extends Intangible
{
	private Date dateCreated;//Notes - Allowed types- [Date, DateTime]
	private Date dateDeleted;
	private Date dateModified;//Notes - Allowed types- [Date, DateTime]
	private Thing item;

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public Date getDateDeleted()
	{
		return dateDeleted;
	}

	public void setDateDeleted(Date dateDeleted)
	{
		this.dateDeleted = dateDeleted;
	}

	public Date getDateModified()
	{
		return dateModified;
	}

	public void setDateModified(Date dateModified)
	{
		this.dateModified = dateModified;
	}

	public Thing getItem()
	{
		return item;
	}

	public void setItem(Thing item)
	{
		this.item = item;
	}
}