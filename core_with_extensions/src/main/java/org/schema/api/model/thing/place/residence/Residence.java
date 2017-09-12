package org.schema.api.model.thing.place.residence;

import org.schema.api.model.thing.creativeWork.mediaObject.imageObject.ImageObject;
import org.schema.api.model.thing.creativeWork.review.Review;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.intangible.GeospatialGeometry;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.intangible.structuredValue.GeoCoordinates;
import org.schema.api.model.thing.intangible.structuredValue.OpeningHoursSpecification;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.LocationFeatureSpecification;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.PropertyValue;
import org.schema.api.model.thing.place.Place;

public class Residence extends Place
{
	private PropertyValue additionalProperty;
	private String address;//Notes - Allowed types- [PostalAddress, Text]
	private AggregateRating aggregateRating;
	private LocationFeatureSpecification amenityFeature;
	private String branchCode;
	private Place containedInPlace;//Notes - Allowed types- [Place, containsPlace]
	private Place containsPlace;//Notes - Allowed types- [Place, containedInPlace]
	private Event event;
	private String faxNumber;
	private GeoCoordinates geo;//Notes - Allowed types- [GeoCoordinates, GeoShape]
	private GeospatialGeometry geospatiallyContains;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyCoveredBy;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyCovers;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyCrosses;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyDisjoint;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyEquals;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyIntersects;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyOverlaps;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyTouches;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private GeospatialGeometry geospatiallyWithin;//Notes - Allowed types- [GeospatialGeometry, Place, DE-9IM]
	private String globalLocationNumber;
	private String hasMap;//Notes - Allowed types- [Map, URL]
	private Boolean isAccessibleForFree;//Notes - Allowed types- [Boolean, free]
	private String isicV4;
	private String logo;//Notes - Allowed types- [ImageObject, URL]
	private Integer maximumAttendeeCapacity;
	private OpeningHoursSpecification openingHoursSpecification;
	private ImageObject photo;//Notes - Allowed types- [ImageObject, Photograph]
	private Boolean publicAccess;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private Boolean smokingAllowed;
	private OpeningHoursSpecification specialOpeningHoursSpecification;
	private String telephone;

	public PropertyValue getAdditionalProperty()
	{
		return additionalProperty;
	}

	public void setAdditionalProperty(PropertyValue additionalProperty)
	{
		this.additionalProperty = additionalProperty;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public LocationFeatureSpecification getAmenityFeature()
	{
		return amenityFeature;
	}

	public void setAmenityFeature(LocationFeatureSpecification amenityFeature)
	{
		this.amenityFeature = amenityFeature;
	}

	public String getBranchCode()
	{
		return branchCode;
	}

	public void setBranchCode(String branchCode)
	{
		this.branchCode = branchCode;
	}

	public Place getContainedInPlace()
	{
		return containedInPlace;
	}

	public void setContainedInPlace(Place containedInPlace)
	{
		this.containedInPlace = containedInPlace;
	}

	public Place getContainsPlace()
	{
		return containsPlace;
	}

	public void setContainsPlace(Place containsPlace)
	{
		this.containsPlace = containsPlace;
	}

	public Event getEvent()
	{
		return event;
	}

	public void setEvent(Event event)
	{
		this.event = event;
	}

	public String getFaxNumber()
	{
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public GeoCoordinates getGeo()
	{
		return geo;
	}

	public void setGeo(GeoCoordinates geo)
	{
		this.geo = geo;
	}

	public GeospatialGeometry getGeospatiallyContains()
	{
		return geospatiallyContains;
	}

	public void setGeospatiallyContains(GeospatialGeometry geospatiallyContains)
	{
		this.geospatiallyContains = geospatiallyContains;
	}

	public GeospatialGeometry getGeospatiallyCoveredBy()
	{
		return geospatiallyCoveredBy;
	}

	public void setGeospatiallyCoveredBy(GeospatialGeometry geospatiallyCoveredBy)
	{
		this.geospatiallyCoveredBy = geospatiallyCoveredBy;
	}

	public GeospatialGeometry getGeospatiallyCovers()
	{
		return geospatiallyCovers;
	}

	public void setGeospatiallyCovers(GeospatialGeometry geospatiallyCovers)
	{
		this.geospatiallyCovers = geospatiallyCovers;
	}

	public GeospatialGeometry getGeospatiallyCrosses()
	{
		return geospatiallyCrosses;
	}

	public void setGeospatiallyCrosses(GeospatialGeometry geospatiallyCrosses)
	{
		this.geospatiallyCrosses = geospatiallyCrosses;
	}

	public GeospatialGeometry getGeospatiallyDisjoint()
	{
		return geospatiallyDisjoint;
	}

	public void setGeospatiallyDisjoint(GeospatialGeometry geospatiallyDisjoint)
	{
		this.geospatiallyDisjoint = geospatiallyDisjoint;
	}

	public GeospatialGeometry getGeospatiallyEquals()
	{
		return geospatiallyEquals;
	}

	public void setGeospatiallyEquals(GeospatialGeometry geospatiallyEquals)
	{
		this.geospatiallyEquals = geospatiallyEquals;
	}

	public GeospatialGeometry getGeospatiallyIntersects()
	{
		return geospatiallyIntersects;
	}

	public void setGeospatiallyIntersects(GeospatialGeometry geospatiallyIntersects)
	{
		this.geospatiallyIntersects = geospatiallyIntersects;
	}

	public GeospatialGeometry getGeospatiallyOverlaps()
	{
		return geospatiallyOverlaps;
	}

	public void setGeospatiallyOverlaps(GeospatialGeometry geospatiallyOverlaps)
	{
		this.geospatiallyOverlaps = geospatiallyOverlaps;
	}

	public GeospatialGeometry getGeospatiallyTouches()
	{
		return geospatiallyTouches;
	}

	public void setGeospatiallyTouches(GeospatialGeometry geospatiallyTouches)
	{
		this.geospatiallyTouches = geospatiallyTouches;
	}

	public GeospatialGeometry getGeospatiallyWithin()
	{
		return geospatiallyWithin;
	}

	public void setGeospatiallyWithin(GeospatialGeometry geospatiallyWithin)
	{
		this.geospatiallyWithin = geospatiallyWithin;
	}

	public String getGlobalLocationNumber()
	{
		return globalLocationNumber;
	}

	public void setGlobalLocationNumber(String globalLocationNumber)
	{
		this.globalLocationNumber = globalLocationNumber;
	}

	public String getHasMap()
	{
		return hasMap;
	}

	public void setHasMap(String hasMap)
	{
		this.hasMap = hasMap;
	}

	public Boolean getIsAccessibleForFree()
	{
		return isAccessibleForFree;
	}

	public void setIsAccessibleForFree(Boolean isAccessibleForFree)
	{
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public String getIsicV4()
	{
		return isicV4;
	}

	public void setIsicV4(String isicV4)
	{
		this.isicV4 = isicV4;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public Integer getMaximumAttendeeCapacity()
	{
		return maximumAttendeeCapacity;
	}

	public void setMaximumAttendeeCapacity(Integer maximumAttendeeCapacity)
	{
		this.maximumAttendeeCapacity = maximumAttendeeCapacity;
	}

	public OpeningHoursSpecification getOpeningHoursSpecification()
	{
		return openingHoursSpecification;
	}

	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification)
	{
		this.openingHoursSpecification = openingHoursSpecification;
	}

	public ImageObject getPhoto()
	{
		return photo;
	}

	public void setPhoto(ImageObject photo)
	{
		this.photo = photo;
	}

	public Boolean getPublicAccess()
	{
		return publicAccess;
	}

	public void setPublicAccess(Boolean publicAccess)
	{
		this.publicAccess = publicAccess;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public Boolean getSmokingAllowed()
	{
		return smokingAllowed;
	}

	public void setSmokingAllowed(Boolean smokingAllowed)
	{
		this.smokingAllowed = smokingAllowed;
	}

	public OpeningHoursSpecification getSpecialOpeningHoursSpecification()
	{
		return specialOpeningHoursSpecification;
	}

	public void setSpecialOpeningHoursSpecification(OpeningHoursSpecification specialOpeningHoursSpecification)
	{
		this.specialOpeningHoursSpecification = specialOpeningHoursSpecification;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
}