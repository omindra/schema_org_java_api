package org.schema.api.model.thing.place;

import org.schema.api.model.thing.place.Place;

public class TouristAttraction extends Place
{
	private String availableLanguage;//Notes - Allowed types- [Language, Text, IETF BCP 47 standard, inLanguage]
	private String touristType;//Notes - Allowed types- [Audience, Text]

	public String getAvailableLanguage()
	{
		return availableLanguage;
	}

	public void setAvailableLanguage(String availableLanguage)
	{
		this.availableLanguage = availableLanguage;
	}

	public String getTouristType()
	{
		return touristType;
	}

	public void setTouristType(String touristType)
	{
		this.touristType = touristType;
	}
}