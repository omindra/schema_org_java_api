package org.schema.api.model.thing.event;

import org.schema.api.model.thing.creativeWork.Movie;

public class ScreeningEvent extends Event
{
	private String subtitleLanguage;//Notes - Allowed types- [Language, Text]
	private String videoFormat;
	private Movie workPresented;

	public String getSubtitleLanguage()
	{
		return subtitleLanguage;
	}

	public void setSubtitleLanguage(String subtitleLanguage)
	{
		this.subtitleLanguage = subtitleLanguage;
	}

	public String getVideoFormat()
	{
		return videoFormat;
	}

	public void setVideoFormat(String videoFormat)
	{
		this.videoFormat = videoFormat;
	}

	public Movie getWorkPresented()
	{
		return workPresented;
	}

	public void setWorkPresented(Movie workPresented)
	{
		this.workPresented = workPresented;
	}
}