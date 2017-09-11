package org.schema.api.model.thing.event;

import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.Person;
import java.util.Date;
import org.schema.api.model.thing.intangible.quantity.Duration;
import java.util.Date;
import org.schema.api.model.thing.intangible.enumeration.EventStatusType;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.Review;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.CreativeWork;

public class LiteraryEvent extends Event
{
	private Thing about;
	private Person actor;
	private AggregateRating aggregateRating;
	private Organization attendee;//Notes - Allowed types- [Organization, Person]
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private Organization composer;//Notes - Allowed types- [Organization, Person]
	private Organization contributor;//Notes - Allowed types- [Organization, Person]
	private Person director;
	private Date doorTime;
	private Duration duration;//Notes - Allowed types- [Duration, ISO 8601 date format]
	private Date endDate;//Notes - Allowed types- [Date, DateTime]
	private EventStatusType eventStatus;
	private Organization funder;//Notes - Allowed types- [Organization, Person]
	private String inLanguage;//Notes - Allowed types- [Language, Text]
	private Boolean isAccessibleForFree;//Notes - Allowed types- [Boolean, free]
	private String location;//Notes - Allowed types- [Place, PostalAddress, Text]
	private Integer maximumAttendeeCapacity;
	private Offer offers;
	private Organization organizer;//Notes - Allowed types- [Organization, Person]
	private Organization performer;//Notes - Allowed types- [Organization, Person]
	private Date previousStartDate;
	private CreativeWork recordedIn;//Notes - Allowed types- [CreativeWork, recordedAt]
	private Integer remainingAttendeeCapacity;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private Organization sponsor;//Notes - Allowed types- [Organization, Person]
	private Date startDate;//Notes - Allowed types- [Date, DateTime]
	private Event subEvent;//Notes - Allowed types- [Event, superEvent]
	private Event superEvent;//Notes - Allowed types- [Event, subEvent]
	private Organization translator;//Notes - Allowed types- [Organization, Person]
	private String typicalAgeRange;
	private CreativeWork workFeatured;
	private CreativeWork workPerformed;

	public Thing getAbout()
	{
		return about;
	}

	public void setAbout(Thing about)
	{
		this.about = about;
	}

	public Person getActor()
	{
		return actor;
	}

	public void setActor(Person actor)
	{
		this.actor = actor;
	}

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public Organization getAttendee()
	{
		return attendee;
	}

	public void setAttendee(Organization attendee)
	{
		this.attendee = attendee;
	}

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
	}

	public Organization getComposer()
	{
		return composer;
	}

	public void setComposer(Organization composer)
	{
		this.composer = composer;
	}

	public Organization getContributor()
	{
		return contributor;
	}

	public void setContributor(Organization contributor)
	{
		this.contributor = contributor;
	}

	public Person getDirector()
	{
		return director;
	}

	public void setDirector(Person director)
	{
		this.director = director;
	}

	public Date getDoorTime()
	{
		return doorTime;
	}

	public void setDoorTime(Date doorTime)
	{
		this.doorTime = doorTime;
	}

	public Duration getDuration()
	{
		return duration;
	}

	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public EventStatusType getEventStatus()
	{
		return eventStatus;
	}

	public void setEventStatus(EventStatusType eventStatus)
	{
		this.eventStatus = eventStatus;
	}

	public Organization getFunder()
	{
		return funder;
	}

	public void setFunder(Organization funder)
	{
		this.funder = funder;
	}

	public String getInLanguage()
	{
		return inLanguage;
	}

	public void setInLanguage(String inLanguage)
	{
		this.inLanguage = inLanguage;
	}

	public Boolean getIsAccessibleForFree()
	{
		return isAccessibleForFree;
	}

	public void setIsAccessibleForFree(Boolean isAccessibleForFree)
	{
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public Integer getMaximumAttendeeCapacity()
	{
		return maximumAttendeeCapacity;
	}

	public void setMaximumAttendeeCapacity(Integer maximumAttendeeCapacity)
	{
		this.maximumAttendeeCapacity = maximumAttendeeCapacity;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
	}

	public Organization getOrganizer()
	{
		return organizer;
	}

	public void setOrganizer(Organization organizer)
	{
		this.organizer = organizer;
	}

	public Organization getPerformer()
	{
		return performer;
	}

	public void setPerformer(Organization performer)
	{
		this.performer = performer;
	}

	public Date getPreviousStartDate()
	{
		return previousStartDate;
	}

	public void setPreviousStartDate(Date previousStartDate)
	{
		this.previousStartDate = previousStartDate;
	}

	public CreativeWork getRecordedIn()
	{
		return recordedIn;
	}

	public void setRecordedIn(CreativeWork recordedIn)
	{
		this.recordedIn = recordedIn;
	}

	public Integer getRemainingAttendeeCapacity()
	{
		return remainingAttendeeCapacity;
	}

	public void setRemainingAttendeeCapacity(Integer remainingAttendeeCapacity)
	{
		this.remainingAttendeeCapacity = remainingAttendeeCapacity;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public Organization getSponsor()
	{
		return sponsor;
	}

	public void setSponsor(Organization sponsor)
	{
		this.sponsor = sponsor;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	public Event getSubEvent()
	{
		return subEvent;
	}

	public void setSubEvent(Event subEvent)
	{
		this.subEvent = subEvent;
	}

	public Event getSuperEvent()
	{
		return superEvent;
	}

	public void setSuperEvent(Event superEvent)
	{
		this.superEvent = superEvent;
	}

	public Organization getTranslator()
	{
		return translator;
	}

	public void setTranslator(Organization translator)
	{
		this.translator = translator;
	}

	public String getTypicalAgeRange()
	{
		return typicalAgeRange;
	}

	public void setTypicalAgeRange(String typicalAgeRange)
	{
		this.typicalAgeRange = typicalAgeRange;
	}

	public CreativeWork getWorkFeatured()
	{
		return workFeatured;
	}

	public void setWorkFeatured(CreativeWork workFeatured)
	{
		this.workFeatured = workFeatured;
	}

	public CreativeWork getWorkPerformed()
	{
		return workPerformed;
	}

	public void setWorkPerformed(CreativeWork workPerformed)
	{
		this.workPerformed = workPerformed;
	}
}