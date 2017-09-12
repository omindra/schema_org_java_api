package org.schema.api.model.thing.organization.localBusiness.lodgingBusiness;

import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.rating.Rating;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.LocationFeatureSpecification;

import java.util.Date;

public class Hotel extends LodgingBusiness
{
	private LocationFeatureSpecification amenityFeature;
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private String availableLanguage;//Notes - Allowed types- [Language, Text, IETF BCP 47 standard, inLanguage]
	private Date checkinTime;
	private Date checkoutTime;
	private Boolean petsAllowed;//Notes - Allowed types- [Boolean, Text]
	private Rating starRating;

	public LocationFeatureSpecification getAmenityFeature()
	{
		return amenityFeature;
	}

	public void setAmenityFeature(LocationFeatureSpecification amenityFeature)
	{
		this.amenityFeature = amenityFeature;
	}

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
	}

	public String getAvailableLanguage()
	{
		return availableLanguage;
	}

	public void setAvailableLanguage(String availableLanguage)
	{
		this.availableLanguage = availableLanguage;
	}

	public Date getCheckinTime()
	{
		return checkinTime;
	}

	public void setCheckinTime(Date checkinTime)
	{
		this.checkinTime = checkinTime;
	}

	public Date getCheckoutTime()
	{
		return checkoutTime;
	}

	public void setCheckoutTime(Date checkoutTime)
	{
		this.checkoutTime = checkoutTime;
	}

	public Boolean getPetsAllowed()
	{
		return petsAllowed;
	}

	public void setPetsAllowed(Boolean petsAllowed)
	{
		this.petsAllowed = petsAllowed;
	}

	public Rating getStarRating()
	{
		return starRating;
	}

	public void setStarRating(Rating starRating)
	{
		this.starRating = starRating;
	}
}