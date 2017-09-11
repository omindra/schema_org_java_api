package org.schema.api.model.thing.intangible.broadcastChannel;

import org.schema.api.model.thing.intangible.broadcastChannel.BroadcastChannel;
import org.schema.api.model.thing.intangible.service.CableOrSatelliteService;
import org.schema.api.model.thing.intangible.service.BroadcastService;

public class TelevisionChannel extends BroadcastChannel
{
	private String broadcastChannelId;
	private String broadcastFrequency;//Notes - Allowed types- [BroadcastFrequencySpecification, Text]
	private String broadcastServiceTier;
	private String genre;//Notes - Allowed types- [Text, URL]
	private CableOrSatelliteService inBroadcastLineup;
	private BroadcastService providesBroadcastService;//Notes - Allowed types- [BroadcastService, hasBroadcastChannel]

	public String getBroadcastChannelId()
	{
		return broadcastChannelId;
	}

	public void setBroadcastChannelId(String broadcastChannelId)
	{
		this.broadcastChannelId = broadcastChannelId;
	}

	public String getBroadcastFrequency()
	{
		return broadcastFrequency;
	}

	public void setBroadcastFrequency(String broadcastFrequency)
	{
		this.broadcastFrequency = broadcastFrequency;
	}

	public String getBroadcastServiceTier()
	{
		return broadcastServiceTier;
	}

	public void setBroadcastServiceTier(String broadcastServiceTier)
	{
		this.broadcastServiceTier = broadcastServiceTier;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public CableOrSatelliteService getInBroadcastLineup()
	{
		return inBroadcastLineup;
	}

	public void setInBroadcastLineup(CableOrSatelliteService inBroadcastLineup)
	{
		this.inBroadcastLineup = inBroadcastLineup;
	}

	public BroadcastService getProvidesBroadcastService()
	{
		return providesBroadcastService;
	}

	public void setProvidesBroadcastService(BroadcastService providesBroadcastService)
	{
		this.providesBroadcastService = providesBroadcastService;
	}
}