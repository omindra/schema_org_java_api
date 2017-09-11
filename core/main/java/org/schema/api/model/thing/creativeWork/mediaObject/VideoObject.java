package org.schema.api.model.thing.creativeWork.mediaObject;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.performingGroup.MusicGroup;
import org.schema.api.model.thing.creativeWork.mediaObject.imageObject.ImageObject;

public class VideoObject extends MediaObject
{
	private Person actor;
	private String caption;
	private Person director;
	private MusicGroup musicBy;//Notes - Allowed types- [MusicGroup, Person]
	private ImageObject thumbnail;
	private String transcript;
	private String videoFrameSize;
	private String videoQuality;

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public String getCaption()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		this.caption = caption;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public MusicGroup getMusicBy()
	{
		return musicBy;
	}

	public void setMusicBy(MusicGroup musicBy)
	{
		this.musicBy = musicBy;
	}

	public ImageObject getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(ImageObject thumbnail)
	{
		this.thumbnail = thumbnail;
	}

	public String getTranscript()
	{
		return transcript;
	}

	public void setTranscript(String transcript)
	{
		this.transcript = transcript;
	}

	public String getVideoFrameSize()
	{
		return videoFrameSize;
	}

	public void setVideoFrameSize(String videoFrameSize)
	{
		this.videoFrameSize = videoFrameSize;
	}

	public String getVideoQuality()
	{
		return videoQuality;
	}

	public void setVideoQuality(String videoQuality)
	{
		this.videoQuality = videoQuality;
	}
}