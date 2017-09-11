package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.creativeWork.mediaObject.AudioObject;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.comment.Comment;
import org.schema.api.model.thing.place.Place;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.AlignmentObject;
import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.structuredValue.InteractionCounter;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.event.publicationEvent.PublicationEvent;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.event.publicationEvent.PublicationEvent;
import org.schema.api.model.thing.creativeWork.Review;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.intangible.quantity.Duration;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.mediaObject.VideoObject;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.CreativeWork;

public class CreativeWork extends Thing
{
	private Thing about;
	private String accessMode;
	private String accessModeSufficient;
	private String accessibilityAPI;
	private String accessibilityControl;
	private String accessibilityFeature;
	private String accessibilityHazard;
	private String accessibilitySummary;
	private Person accountablePerson;
	private AggregateRating aggregateRating;
	private String alternativeHeadline;
	private MediaObject associatedMedia;
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private AudioObject audio;
	private Organization author;//Notes - Allowed types- [Organization, Person]
	private String award;
	private Person character;
	private String citation;//Notes - Allowed types- [CreativeWork, Text]
	private Comment comment;
	private Integer commentCount;
	private Place contentLocation;
	private String contentRating;
	private Date contentReferenceTime;
	private Organization contributor;//Notes - Allowed types- [Organization, Person]
	private Organization copyrightHolder;//Notes - Allowed types- [Organization, Person]
	private Number copyrightYear;
	private Organization creator;//Notes - Allowed types- [Organization, Person]
	private Date dateCreated;//Notes - Allowed types- [Date, DateTime]
	private Date dateModified;//Notes - Allowed types- [Date, DateTime]
	private Date datePublished;
	private String discussionUrl;
	private Person editor;
	private AlignmentObject educationalAlignment;
	private String educationalUse;
	private MediaObject encoding;
	private CreativeWork exampleOfWork;//Notes - Allowed types- [CreativeWork, workExample]
	private Date expires;
	private String fileFormat;//Notes - Allowed types- [Text, URL]
	private Organization funder;//Notes - Allowed types- [Organization, Person]
	private String genre;//Notes - Allowed types- [Text, URL]
	private CreativeWork hasPart;//Notes - Allowed types- [CreativeWork, isPartOf]
	private String headline;
	private String inLanguage;//Notes - Allowed types- [Language, Text]
	private InteractionCounter interactionStatistic;
	private String interactivityType;
	private Boolean isAccessibleForFree;//Notes - Allowed types- [Boolean, free]
	private String isBasedOn;//Notes - Allowed types- [CreativeWork, Product, URL]
	private Boolean isFamilyFriendly;
	private CreativeWork isPartOf;//Notes - Allowed types- [CreativeWork, hasPart]
	private String keywords;
	private String learningResourceType;
	private String license;//Notes - Allowed types- [CreativeWork, URL]
	private Place locationCreated;
	private Thing mainEntity;//Notes - Allowed types- [Thing, mainEntityOfPage]
	private String material;//Notes - Allowed types- [Product, Text, URL]
	private Thing mentions;
	private Offer offers;
	private String position;//Notes - Allowed types- [Integer, Text]
	private Organization producer;//Notes - Allowed types- [Organization, Person]
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private PublicationEvent publication;
	private Organization publisher;//Notes - Allowed types- [Organization, Person]
	private Organization publisherImprint;
	private String publishingPrinciples;//Notes - Allowed types- [CreativeWork, URL]
	private Event recordedAt;//Notes - Allowed types- [Event, recordedIn]
	private PublicationEvent releasedEvent;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private String schemaVersion;//Notes - Allowed types- [Text, URL]
	private Organization sourceOrganization;
	private Place spatialCoverage;
	private Organization sponsor;//Notes - Allowed types- [Organization, Person]
	private Date temporalCoverage;//Notes - Allowed types- [DateTime, Text, URL]
	private String text;
	private String thumbnailUrl;
	private Duration timeRequired;
	private CreativeWork translationOfWork;//Notes - Allowed types- [CreativeWork, workTranslation]
	private Organization translator;//Notes - Allowed types- [Organization, Person]
	private String typicalAgeRange;
	private Number version;//Notes - Allowed types- [Number, Text]
	private VideoObject video;
	private CreativeWork workExample;//Notes - Allowed types- [CreativeWork, exampleOfWork]
	private CreativeWork workTranslation;//Notes - Allowed types- [CreativeWork, translationOfWork]

	public Thing getAbout()
	{
		return about;
	}

	public void setAbout(Thing about)
	{
		this.about = about;
	}

	public String getAccessMode()
	{
		return accessMode;
	}

	public void setAccessMode(String accessMode)
	{
		this.accessMode = accessMode;
	}

	public String getAccessModeSufficient()
	{
		return accessModeSufficient;
	}

	public void setAccessModeSufficient(String accessModeSufficient)
	{
		this.accessModeSufficient = accessModeSufficient;
	}

	public String getAccessibilityAPI()
	{
		return accessibilityAPI;
	}

	public void setAccessibilityAPI(String accessibilityAPI)
	{
		this.accessibilityAPI = accessibilityAPI;
	}

	public String getAccessibilityControl()
	{
		return accessibilityControl;
	}

	public void setAccessibilityControl(String accessibilityControl)
	{
		this.accessibilityControl = accessibilityControl;
	}

	public String getAccessibilityFeature()
	{
		return accessibilityFeature;
	}

	public void setAccessibilityFeature(String accessibilityFeature)
	{
		this.accessibilityFeature = accessibilityFeature;
	}

	public String getAccessibilityHazard()
	{
		return accessibilityHazard;
	}

	public void setAccessibilityHazard(String accessibilityHazard)
	{
		this.accessibilityHazard = accessibilityHazard;
	}

	public String getAccessibilitySummary()
	{
		return accessibilitySummary;
	}

	public void setAccessibilitySummary(String accessibilitySummary)
	{
		this.accessibilitySummary = accessibilitySummary;
	}

	public Person getAccountablePerson()
	{
		return accountablePerson;
	}

	public void setAccountablePerson(Person accountablePerson)
	{
		this.accountablePerson = accountablePerson;
	}

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public String getAlternativeHeadline()
	{
		return alternativeHeadline;
	}

	public void setAlternativeHeadline(String alternativeHeadline)
	{
		this.alternativeHeadline = alternativeHeadline;
	}

	public MediaObject getAssociatedMedia()
	{
		return associatedMedia;
	}

	public void setAssociatedMedia(MediaObject associatedMedia)
	{
		this.associatedMedia = associatedMedia;
	}

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
	}

	public AudioObject getAudio()
	{
		return audio;
	}

	public void setAudio(AudioObject audio)
	{
		this.audio = audio;
	}

	public Organization getAuthor()
	{
		return author;
	}

	public void setAuthor(Organization author)
	{
		this.author = author;
	}

	public String getAward()
	{
		return award;
	}

	public void setAward(String award)
	{
		this.award = award;
	}

	public Person getCharacter()
	{
		return character;
	}

	public void setCharacter(Person character)
	{
		this.character = character;
	}

	public String getCitation()
	{
		return citation;
	}

	public void setCitation(String citation)
	{
		this.citation = citation;
	}

	public Comment getComment()
	{
		return comment;
	}

	public void setComment(Comment comment)
	{
		this.comment = comment;
	}

	public Integer getCommentCount()
	{
		return commentCount;
	}

	public void setCommentCount(Integer commentCount)
	{
		this.commentCount = commentCount;
	}

	public Place getContentLocation()
	{
		return contentLocation;
	}

	public void setContentLocation(Place contentLocation)
	{
		this.contentLocation = contentLocation;
	}

	public String getContentRating()
	{
		return contentRating;
	}

	public void setContentRating(String contentRating)
	{
		this.contentRating = contentRating;
	}

	public Date getContentReferenceTime()
	{
		return contentReferenceTime;
	}

	public void setContentReferenceTime(Date contentReferenceTime)
	{
		this.contentReferenceTime = contentReferenceTime;
	}

	public Organization getContributor()
	{
		return contributor;
	}

	public void setContributor(Organization contributor)
	{
		this.contributor = contributor;
	}

	public Organization getCopyrightHolder()
	{
		return copyrightHolder;
	}

	public void setCopyrightHolder(Organization copyrightHolder)
	{
		this.copyrightHolder = copyrightHolder;
	}

	public Number getCopyrightYear()
	{
		return copyrightYear;
	}

	public void setCopyrightYear(Number copyrightYear)
	{
		this.copyrightYear = copyrightYear;
	}

	public Organization getCreator()
	{
		return creator;
	}

	public void setCreator(Organization creator)
	{
		this.creator = creator;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public Date getDateModified()
	{
		return dateModified;
	}

	public void setDateModified(Date dateModified)
	{
		this.dateModified = dateModified;
	}

	public Date getDatePublished()
	{
		return datePublished;
	}

	public void setDatePublished(Date datePublished)
	{
		this.datePublished = datePublished;
	}

	public String getDiscussionUrl()
	{
		return discussionUrl;
	}

	public void setDiscussionUrl(String discussionUrl)
	{
		this.discussionUrl = discussionUrl;
	}

	public Person getEditor()
	{
		return editor;
	}

	public void setEditor(Person editor)
	{
		this.editor = editor;
	}

	public AlignmentObject getEducationalAlignment()
	{
		return educationalAlignment;
	}

	public void setEducationalAlignment(AlignmentObject educationalAlignment)
	{
		this.educationalAlignment = educationalAlignment;
	}

	public String getEducationalUse()
	{
		return educationalUse;
	}

	public void setEducationalUse(String educationalUse)
	{
		this.educationalUse = educationalUse;
	}

	public MediaObject getEncoding()
	{
		return encoding;
	}

	public void setEncoding(MediaObject encoding)
	{
		this.encoding = encoding;
	}

	public CreativeWork getExampleOfWork()
	{
		return exampleOfWork;
	}

	public void setExampleOfWork(CreativeWork exampleOfWork)
	{
		this.exampleOfWork = exampleOfWork;
	}

	public Date getExpires()
	{
		return expires;
	}

	public void setExpires(Date expires)
	{
		this.expires = expires;
	}

	public String getFileFormat()
	{
		return fileFormat;
	}

	public void setFileFormat(String fileFormat)
	{
		this.fileFormat = fileFormat;
	}

	public Organization getFunder()
	{
		return funder;
	}

	public void setFunder(Organization funder)
	{
		this.funder = funder;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public CreativeWork getHasPart()
	{
		return hasPart;
	}

	public void setHasPart(CreativeWork hasPart)
	{
		this.hasPart = hasPart;
	}

	public String getHeadline()
	{
		return headline;
	}

	public void setHeadline(String headline)
	{
		this.headline = headline;
	}

	public String getInLanguage()
	{
		return inLanguage;
	}

	public void setInLanguage(String inLanguage)
	{
		this.inLanguage = inLanguage;
	}

	public InteractionCounter getInteractionStatistic()
	{
		return interactionStatistic;
	}

	public void setInteractionStatistic(InteractionCounter interactionStatistic)
	{
		this.interactionStatistic = interactionStatistic;
	}

	public String getInteractivityType()
	{
		return interactivityType;
	}

	public void setInteractivityType(String interactivityType)
	{
		this.interactivityType = interactivityType;
	}

	public Boolean getIsAccessibleForFree()
	{
		return isAccessibleForFree;
	}

	public void setIsAccessibleForFree(Boolean isAccessibleForFree)
	{
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public String getIsBasedOn()
	{
		return isBasedOn;
	}

	public void setIsBasedOn(String isBasedOn)
	{
		this.isBasedOn = isBasedOn;
	}

	public Boolean getIsFamilyFriendly()
	{
		return isFamilyFriendly;
	}

	public void setIsFamilyFriendly(Boolean isFamilyFriendly)
	{
		this.isFamilyFriendly = isFamilyFriendly;
	}

	public CreativeWork getIsPartOf()
	{
		return isPartOf;
	}

	public void setIsPartOf(CreativeWork isPartOf)
	{
		this.isPartOf = isPartOf;
	}

	public String getKeywords()
	{
		return keywords;
	}

	public void setKeywords(String keywords)
	{
		this.keywords = keywords;
	}

	public String getLearningResourceType()
	{
		return learningResourceType;
	}

	public void setLearningResourceType(String learningResourceType)
	{
		this.learningResourceType = learningResourceType;
	}

	public String getLicense()
	{
		return license;
	}

	public void setLicense(String license)
	{
		this.license = license;
	}

	public Place getLocationCreated()
	{
		return locationCreated;
	}

	public void setLocationCreated(Place locationCreated)
	{
		this.locationCreated = locationCreated;
	}

	public Thing getMainEntity()
	{
		return mainEntity;
	}

	public void setMainEntity(Thing mainEntity)
	{
		this.mainEntity = mainEntity;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public Thing getMentions()
	{
		return mentions;
	}

	public void setMentions(Thing mentions)
	{
		this.mentions = mentions;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public Organization getProducer()
	{
		return producer;
	}

	public void setProducer(Organization producer)
	{
		this.producer = producer;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public PublicationEvent getPublication()
	{
		return publication;
	}

	public void setPublication(PublicationEvent publication)
	{
		this.publication = publication;
	}

	public Organization getPublisher()
	{
		return publisher;
	}

	public void setPublisher(Organization publisher)
	{
		this.publisher = publisher;
	}

	public Organization getPublisherImprint()
	{
		return publisherImprint;
	}

	public void setPublisherImprint(Organization publisherImprint)
	{
		this.publisherImprint = publisherImprint;
	}

	public String getPublishingPrinciples()
	{
		return publishingPrinciples;
	}

	public void setPublishingPrinciples(String publishingPrinciples)
	{
		this.publishingPrinciples = publishingPrinciples;
	}

	public Event getRecordedAt()
	{
		return recordedAt;
	}

	public void setRecordedAt(Event recordedAt)
	{
		this.recordedAt = recordedAt;
	}

	public PublicationEvent getReleasedEvent()
	{
		return releasedEvent;
	}

	public void setReleasedEvent(PublicationEvent releasedEvent)
	{
		this.releasedEvent = releasedEvent;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public String getSchemaVersion()
	{
		return schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion)
	{
		this.schemaVersion = schemaVersion;
	}

	public Organization getSourceOrganization()
	{
		return sourceOrganization;
	}

	public void setSourceOrganization(Organization sourceOrganization)
	{
		this.sourceOrganization = sourceOrganization;
	}

	public Place getSpatialCoverage()
	{
		return spatialCoverage;
	}

	public void setSpatialCoverage(Place spatialCoverage)
	{
		this.spatialCoverage = spatialCoverage;
	}

	public Organization getSponsor()
	{
		return sponsor;
	}

	public void setSponsor(Organization sponsor)
	{
		this.sponsor = sponsor;
	}

	public Date getTemporalCoverage()
	{
		return temporalCoverage;
	}

	public void setTemporalCoverage(Date temporalCoverage)
	{
		this.temporalCoverage = temporalCoverage;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public String getThumbnailUrl()
	{
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl)
	{
		this.thumbnailUrl = thumbnailUrl;
	}

	public Duration getTimeRequired()
	{
		return timeRequired;
	}

	public void setTimeRequired(Duration timeRequired)
	{
		this.timeRequired = timeRequired;
	}

	public CreativeWork getTranslationOfWork()
	{
		return translationOfWork;
	}

	public void setTranslationOfWork(CreativeWork translationOfWork)
	{
		this.translationOfWork = translationOfWork;
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

	public Number getVersion()
	{
		return version;
	}

	public void setVersion(Number version)
	{
		this.version = version;
	}

	public VideoObject getVideo()
	{
		return video;
	}

	public void setVideo(VideoObject video)
	{
		this.video = video;
	}

	public CreativeWork getWorkExample()
	{
		return workExample;
	}

	public void setWorkExample(CreativeWork workExample)
	{
		this.workExample = workExample;
	}

	public CreativeWork getWorkTranslation()
	{
		return workTranslation;
	}

	public void setWorkTranslation(CreativeWork workTranslation)
	{
		this.workTranslation = workTranslation;
	}
}