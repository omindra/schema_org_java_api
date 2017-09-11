package org.schema.api.model.thing.creativeWork.mediaObject;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;

public class AudioObject extends MediaObject
{
	private String transcript;

	public String getTranscript()
	{
		return transcript;
	}

	public void setTranscript(String transcript)
	{
		this.transcript = transcript;
	}
}