package org.schema.api.model.thing.intangible.service;

import org.schema.api.model.thing.intangible.service.Service;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.broadcastChannel.BroadcastChannel;
import org.schema.api.model.thing.intangible.service.BroadcastService;

public class BroadcastService extends Service
{
	private Organization broadcastAffiliateOf;
	private String broadcastDisplayName;
	private String broadcastFrequency;//Notes - Allowed types- [BroadcastFrequencySpecification, Text]
	private String broadcastTimezone;
	private Organization broadcaster;
	private BroadcastChannel hasBroadcastChannel;//Notes - Allowed types- [BroadcastChannel, providesBroadcastService]
	private BroadcastService parentService;
	private String videoFormat;

	public Organization getBroadcastAffiliateOf()
	{
		return broadcastAffiliateOf;
	}

	public void setBroadcastAffiliateOf(Organization broadcastAffiliateOf)
	{
		this.broadcastAffiliateOf = broadcastAffiliateOf;
	}

	public String getBroadcastDisplayName()
	{
		return broadcastDisplayName;
	}

	public void setBroadcastDisplayName(String broadcastDisplayName)
	{
		this.broadcastDisplayName = broadcastDisplayName;
	}

	public String getBroadcastFrequency()
	{
		return broadcastFrequency;
	}

	public void setBroadcastFrequency(String broadcastFrequency)
	{
		this.broadcastFrequency = broadcastFrequency;
	}

	public String getBroadcastTimezone()
	{
		return broadcastTimezone;
	}

	public void setBroadcastTimezone(String broadcastTimezone)
	{
		this.broadcastTimezone = broadcastTimezone;
	}

	public Organization getBroadcaster()
	{
		return broadcaster;
	}

	public void setBroadcaster(Organization broadcaster)
	{
		this.broadcaster = broadcaster;
	}

	public BroadcastChannel getHasBroadcastChannel()
	{
		return hasBroadcastChannel;
	}

	public void setHasBroadcastChannel(BroadcastChannel hasBroadcastChannel)
	{
		this.hasBroadcastChannel = hasBroadcastChannel;
	}

	public BroadcastService getParentService()
	{
		return parentService;
	}

	public void setParentService(BroadcastService parentService)
	{
		this.parentService = parentService;
	}

	public String getVideoFormat()
	{
		return videoFormat;
	}

	public void setVideoFormat(String videoFormat)
	{
		this.videoFormat = videoFormat;
	}
}