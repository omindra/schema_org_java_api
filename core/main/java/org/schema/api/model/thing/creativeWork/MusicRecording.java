package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicAlbum;
import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicPlaylist;
import org.schema.api.model.thing.creativeWork.MusicComposition;

public class MusicRecording extends CreativeWork
{
	private MusicGroup byArtist;
	private Duration duration;//Notes - Allowed types- [Duration, ISO 8601 date format]
	private MusicAlbum inAlbum;
	private MusicPlaylist inPlaylist;
	private String isrcCode;
	private MusicComposition recordingOf;//Notes - Allowed types- [MusicComposition, recordedAs]

	public MusicGroup getByArtist()
	{
		return byArtist;
	}

	public void setByArtist(MusicGroup byArtist)
	{
		this.byArtist = byArtist;
	}

	public Duration getDuration()
	{
		return duration;
	}

	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}

	public MusicAlbum getInAlbum()
	{
		return inAlbum;
	}

	public void setInAlbum(MusicAlbum inAlbum)
	{
		this.inAlbum = inAlbum;
	}

	public MusicPlaylist getInPlaylist()
	{
		return inPlaylist;
	}

	public void setInPlaylist(MusicPlaylist inPlaylist)
	{
		this.inPlaylist = inPlaylist;
	}

	public String getIsrcCode()
	{
		return isrcCode;
	}

	public void setIsrcCode(String isrcCode)
	{
		this.isrcCode = isrcCode;
	}

	public MusicComposition getRecordingOf()
	{
		return recordingOf;
	}

	public void setRecordingOf(MusicComposition recordingOf)
	{
		this.recordingOf = recordingOf;
	}
}