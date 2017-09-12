package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.organization.Organization;

public class MusicComposition extends CreativeWork
{
	private Organization composer;//Notes - Allowed types- [Organization, Person]
	private Event firstPerformance;
	private MusicComposition includedComposition;
	private String iswcCode;
	private Person lyricist;
	private CreativeWork lyrics;
	private MusicComposition musicArrangement;
	private String musicCompositionForm;
	private String musicalKey;
	private MusicRecording recordedAs;//Notes - Allowed types- [MusicRecording, recordingOf]

	public Organization getComposer()
	{
		return composer;
	}

	public void setComposer(Organization composer)
	{
		this.composer = composer;
	}

	public Event getFirstPerformance()
	{
		return firstPerformance;
	}

	public void setFirstPerformance(Event firstPerformance)
	{
		this.firstPerformance = firstPerformance;
	}

	public MusicComposition getIncludedComposition()
	{
		return includedComposition;
	}

	public void setIncludedComposition(MusicComposition includedComposition)
	{
		this.includedComposition = includedComposition;
	}

	public String getIswcCode()
	{
		return iswcCode;
	}

	public void setIswcCode(String iswcCode)
	{
		this.iswcCode = iswcCode;
	}

	public Person getLyricist()
	{
		return lyricist;
	}

	public void setLyricist(Person lyricist)
	{
		this.lyricist = lyricist;
	}

	public CreativeWork getLyrics()
	{
		return lyrics;
	}

	public void setLyrics(CreativeWork lyrics)
	{
		this.lyrics = lyrics;
	}

	public MusicComposition getMusicArrangement()
	{
		return musicArrangement;
	}

	public void setMusicArrangement(MusicComposition musicArrangement)
	{
		this.musicArrangement = musicArrangement;
	}

	public String getMusicCompositionForm()
	{
		return musicCompositionForm;
	}

	public void setMusicCompositionForm(String musicCompositionForm)
	{
		this.musicCompositionForm = musicCompositionForm;
	}

	public String getMusicalKey()
	{
		return musicalKey;
	}

	public void setMusicalKey(String musicalKey)
	{
		this.musicalKey = musicalKey;
	}

	public MusicRecording getRecordedAs()
	{
		return recordedAs;
	}

	public void setRecordedAs(MusicRecording recordedAs)
	{
		this.recordedAs = recordedAs;
	}
}