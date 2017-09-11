package org.schema.api.model.thing.creativeWork.webPageElement;

import org.schema.api.model.thing.creativeWork.webPageElement.WebPageElement;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.creativeWork.mediaObject.AudioObject;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.structuredValue.InteractionCounter;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.CreativeWork;

public class SiteNavigationElement extends WebPageElement
{
	private String accessMode;
	private String accessModeSufficient;
	private String accessibilityFeature;
	private Audience audience;
	private AudioObject audio;
	private Organization author;//Notes - Allowed types- [Organization, Person]
	private String award;
	private String citation;//Notes - Allowed types- [CreativeWork, Text]
	private Place contentLocation;
	private Organization copyrightHolder;//Notes - Allowed types- [Organization, Person]
	private Date dateModified;//Notes - Allowed types- [Date, DateTime]
	private Date datePublished;
	private Person editor;
	private MediaObject encoding;
	private CreativeWork exampleOfWork;//Notes - Allowed types- [CreativeWork, workExample]
	private Date expires;
	private String fileFormat;//Notes - Allowed types- [Text, URL]
	private CreativeWork hasPart;//Notes - Allowed types- [CreativeWork, isPartOf]
	private String inLanguage;//Notes - Allowed types- [Language, Text]
	private InteractionCounter interactionStatistic;
	private Boolean isAccessibleForFree;//Notes - Allowed types- [Boolean, free]
	private CreativeWork isPartOf;//Notes - Allowed types- [CreativeWork, hasPart]
	private Thing mentions;
	private String position;//Notes - Allowed types- [Integer, Text]
	private Organization publisher;//Notes - Allowed types- [Organization, Person]
	private Organization publisherImprint;
	private String publishingPrinciples;//Notes - Allowed types- [CreativeWork, URL]
	private String schemaVersion;//Notes - Allowed types- [Text, URL]
	private Place spatialCoverage;
	private Organization sponsor;//Notes - Allowed types- [Organization, Person]
	private Date temporalCoverage;//Notes - Allowed types- [DateTime, Text, URL]
	private String text;
	private String thumbnailUrl;
	private CreativeWork translationOfWork;//Notes - Allowed types- [CreativeWork, workTranslation]
	private Organization translator;//Notes - Allowed types- [Organization, Person]
	private String typicalAgeRange;
	private Number version;//Notes - Allowed types- [Number, Text]
	private CreativeWork workExample;//Notes - Allowed types- [CreativeWork, exampleOfWork]
	private CreativeWork workTranslation;//Notes - Allowed types- [CreativeWork, translationOfWork]

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

	public String getAccessibilityFeature()
	{
		return accessibilityFeature;
	}

	public void setAccessibilityFeature(String accessibilityFeature)
	{
		this.accessibilityFeature = accessibilityFeature;
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

	public String getCitation()
	{
		return citation;
	}

	public void setCitation(String citation)
	{
		this.citation = citation;
	}

	public Place getContentLocation()
	{
		return contentLocation;
	}

	public void setContentLocation(Place contentLocation)
	{
		this.contentLocation = contentLocation;
	}

	public Organization getCopyrightHolder()
	{
		return copyrightHolder;
	}

	public void setCopyrightHolder(Organization copyrightHolder)
	{
		this.copyrightHolder = copyrightHolder;
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

	public Person getEditor()
	{
		return editor;
	}

	public void setEditor(Person editor)
	{
		this.editor = editor;
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

	public CreativeWork getHasPart()
	{
		return hasPart;
	}

	public void setHasPart(CreativeWork hasPart)
	{
		this.hasPart = hasPart;
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

	public Boolean getIsAccessibleForFree()
	{
		return isAccessibleForFree;
	}

	public void setIsAccessibleForFree(Boolean isAccessibleForFree)
	{
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public CreativeWork getIsPartOf()
	{
		return isPartOf;
	}

	public void setIsPartOf(CreativeWork isPartOf)
	{
		this.isPartOf = isPartOf;
	}

	public Thing getMentions()
	{
		return mentions;
	}

	public void setMentions(Thing mentions)
	{
		this.mentions = mentions;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
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

	public String getSchemaVersion()
	{
		return schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion)
	{
		this.schemaVersion = schemaVersion;
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