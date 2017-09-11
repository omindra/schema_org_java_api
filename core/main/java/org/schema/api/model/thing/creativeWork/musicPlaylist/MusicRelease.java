package org.schema.api.model.thing.creativeWork.musicPlaylist;

import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicPlaylist;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.intangible.enumeration.MusicReleaseFormatType;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicAlbum;

public class MusicRelease extends MusicPlaylist
{
	private String catalogNumber;
	private Organization creditedTo;//Notes - Allowed types- [Organization, Person]
	private Duration duration;//Notes - Allowed types- [Duration, ISO 8601 date format]
	private MusicReleaseFormatType musicReleaseFormat;
	private Organization recordLabel;
	private MusicAlbum releaseOf;//Notes - Allowed types- [MusicAlbum, albumRelease]

	public String getCatalogNumber()
	{
		return catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber)
	{
		this.catalogNumber = catalogNumber;
	}

	public Organization getCreditedTo()
	{
		return creditedTo;
	}

	public void setCreditedTo(Organization creditedTo)
	{
		this.creditedTo = creditedTo;
	}

	public Duration getDuration()
	{
		return duration;
	}

	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}

	public MusicReleaseFormatType getMusicReleaseFormat()
	{
		return musicReleaseFormat;
	}

	public void setMusicReleaseFormat(MusicReleaseFormatType musicReleaseFormat)
	{
		this.musicReleaseFormat = musicReleaseFormat;
	}

	public Organization getRecordLabel()
	{
		return recordLabel;
	}

	public void setRecordLabel(Organization recordLabel)
	{
		this.recordLabel = recordLabel;
	}

	public MusicAlbum getReleaseOf()
	{
		return releaseOf;
	}

	public void setReleaseOf(MusicAlbum releaseOf)
	{
		this.releaseOf = releaseOf;
	}
}