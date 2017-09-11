package org.schema.api.model.thing.creativeWork.musicPlaylist;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.itemList.ItemList;

public class MusicPlaylist extends CreativeWork
{
	private Integer numTracks;
	private ItemList track;//Notes - Allowed types- [ItemList, MusicRecording, tracks]

	public Integer getNumTracks()
	{
		return numTracks;
	}

	public void setNumTracks(Integer numTracks)
	{
		this.numTracks = numTracks;
	}

	public ItemList getTrack()
	{
		return track;
	}

	public void setTrack(ItemList track)
	{
		this.track = track;
	}
}