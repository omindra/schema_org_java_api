package org.schema.api.model.thing.organization.performingGroup;

import org.schema.api.model.thing.organization.performingGroup.PerformingGroup;
import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicAlbum;
import org.schema.api.model.thing.intangible.itemList.ItemList;

public class MusicGroup extends PerformingGroup
{
	private MusicAlbum album;
	private String genre;//Notes - Allowed types- [Text, URL]
	private ItemList track;//Notes - Allowed types- [ItemList, MusicRecording, tracks]

	public MusicAlbum getAlbum()
	{
		return album;
	}

	public void setAlbum(MusicAlbum album)
	{
		this.album = album;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
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