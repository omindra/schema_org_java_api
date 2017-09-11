package org.schema.api.model.thing.creativeWork.mediaObject;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.creativeWork.article.NewsArticle;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;
import java.util.Date;
import org.schema.api.model.thing.intangible.quantity.Distance;

public class MusicVideoObject extends MediaObject
{
	private NewsArticle associatedArticle;
	private String bitrate;
	private String contentSize;
	private String contentUrl;
	private Duration duration;//Notes - Allowed types- [Duration, ISO 8601 date format]
	private String embedUrl;
	private CreativeWork encodesCreativeWork;
	private String encodingFormat;
	private Distance height;//Notes - Allowed types- [Distance, QuantitativeValue]
	private String playerType;
	private Organization productionCompany;
	private Place regionsAllowed;
	private Boolean requiresSubscription;
	private Date uploadDate;
	private Distance width;//Notes - Allowed types- [Distance, QuantitativeValue]

	public NewsArticle getAssociatedArticle()
	{
		return associatedArticle;
	}

	public void setAssociatedArticle(NewsArticle associatedArticle)
	{
		this.associatedArticle = associatedArticle;
	}

	public String getBitrate()
	{
		return bitrate;
	}

	public void setBitrate(String bitrate)
	{
		this.bitrate = bitrate;
	}

	public String getContentSize()
	{
		return contentSize;
	}

	public void setContentSize(String contentSize)
	{
		this.contentSize = contentSize;
	}

	public String getContentUrl()
	{
		return contentUrl;
	}

	public void setContentUrl(String contentUrl)
	{
		this.contentUrl = contentUrl;
	}

	public Duration getDuration()
	{
		return duration;
	}

	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}

	public String getEmbedUrl()
	{
		return embedUrl;
	}

	public void setEmbedUrl(String embedUrl)
	{
		this.embedUrl = embedUrl;
	}

	public CreativeWork getEncodesCreativeWork()
	{
		return encodesCreativeWork;
	}

	public void setEncodesCreativeWork(CreativeWork encodesCreativeWork)
	{
		this.encodesCreativeWork = encodesCreativeWork;
	}

	public String getEncodingFormat()
	{
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat)
	{
		this.encodingFormat = encodingFormat;
	}

	public Distance getHeight()
	{
		return height;
	}

	public void setHeight(Distance height)
	{
		this.height = height;
	}

	public String getPlayerType()
	{
		return playerType;
	}

	public void setPlayerType(String playerType)
	{
		this.playerType = playerType;
	}

	public Organization getProductionCompany()
	{
		return productionCompany;
	}

	public void setProductionCompany(Organization productionCompany)
	{
		this.productionCompany = productionCompany;
	}

	public Place getRegionsAllowed()
	{
		return regionsAllowed;
	}

	public void setRegionsAllowed(Place regionsAllowed)
	{
		this.regionsAllowed = regionsAllowed;
	}

	public Boolean getRequiresSubscription()
	{
		return requiresSubscription;
	}

	public void setRequiresSubscription(Boolean requiresSubscription)
	{
		this.requiresSubscription = requiresSubscription;
	}

	public Date getUploadDate()
	{
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate)
	{
		this.uploadDate = uploadDate;
	}

	public Distance getWidth()
	{
		return width;
	}

	public void setWidth(Distance width)
	{
		this.width = width;
	}
}