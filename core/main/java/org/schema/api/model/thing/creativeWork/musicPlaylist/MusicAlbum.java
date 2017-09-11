package org.schema.api.model.thing.creativeWork.musicPlaylist;

import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicPlaylist;
import org.schema.api.model.thing.intangible.enumeration.MusicAlbumProductionType;
import org.schema.api.model.thing.creativeWork.musicPlaylist.MusicRelease;
import org.schema.api.model.thing.intangible.enumeration.MusicAlbumReleaseType;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;

public class MusicAlbum extends MusicPlaylist
{
	private MusicAlbumProductionType albumProductionType;
	private MusicRelease albumRelease;//Notes - Allowed types- [MusicRelease, releaseOf]
	private MusicAlbumReleaseType albumReleaseType;
	private MusicGroup byArtist;

	public MusicAlbumProductionType getAlbumProductionType()
	{
		return albumProductionType;
	}

	public void setAlbumProductionType(MusicAlbumProductionType albumProductionType)
	{
		this.albumProductionType = albumProductionType;
	}

	public MusicRelease getAlbumRelease()
	{
		return albumRelease;
	}

	public void setAlbumRelease(MusicRelease albumRelease)
	{
		this.albumRelease = albumRelease;
	}

	public MusicAlbumReleaseType getAlbumReleaseType()
	{
		return albumReleaseType;
	}

	public void setAlbumReleaseType(MusicAlbumReleaseType albumReleaseType)
	{
		this.albumReleaseType = albumReleaseType;
	}

	public MusicGroup getByArtist()
	{
		return byArtist;
	}

	public void setByArtist(MusicGroup byArtist)
	{
		this.byArtist = byArtist;
	}
}