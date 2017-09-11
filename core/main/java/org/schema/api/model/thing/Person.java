package org.schema.api.model.thing;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.educationalOrganization.EducationalOrganization;
import java.util.Date;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.intangible.Brand;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import java.util.Date;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.itemList.OfferCatalog;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.administrativeArea.Country;
import org.schema.api.model.thing.intangible.structuredValue.OwnershipInfo;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.Demand;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import org.schema.api.model.thing.organization.Organization;

public class Person extends Thing
{
	private String additionalName;
	private String address;//Notes - Allowed types- [PostalAddress, Text]
	private Organization affiliation;
	private EducationalOrganization alumniOf;//Notes - Allowed types- [EducationalOrganization, Organization, alumni]
	private String award;
	private Date birthDate;
	private Place birthPlace;
	private Brand brand;//Notes - Allowed types- [Brand, Organization]
	private Person children;
	private String colleague;//Notes - Allowed types- [Person, URL]
	private ContactPoint contactPoint;
	private Date deathDate;
	private Place deathPlace;
	private String duns;
	private String email;
	private String familyName;
	private String faxNumber;
	private Person follows;
	private Organization funder;//Notes - Allowed types- [Organization, Person]
	private String gender;//Notes - Allowed types- [GenderType, Text]
	private String givenName;
	private String globalLocationNumber;
	private OfferCatalog hasOfferCatalog;
	private Place hasPOS;
	private Distance height;//Notes - Allowed types- [Distance, QuantitativeValue]
	private ContactPoint homeLocation;//Notes - Allowed types- [ContactPoint, Place]
	private String honorificPrefix;
	private String honorificSuffix;
	private String isicV4;
	private String jobTitle;
	private Person knows;
	private Offer makesOffer;
	private Organization memberOf;//Notes - Allowed types- [Organization, ProgramMembership]
	private String naics;
	private Country nationality;
	private MonetaryAmount netWorth;//Notes - Allowed types- [MonetaryAmount, PriceSpecification]
	private OwnershipInfo owns;//Notes - Allowed types- [OwnershipInfo, Product]
	private Person parent;
	private Event performerIn;
	private String publishingPrinciples;//Notes - Allowed types- [CreativeWork, URL]
	private Person relatedTo;
	private Demand seeks;
	private Person sibling;
	private Organization sponsor;//Notes - Allowed types- [Organization, Person]
	private Person spouse;
	private String taxID;
	private String telephone;
	private String vatID;
	private QuantitativeValue weight;
	private ContactPoint workLocation;//Notes - Allowed types- [ContactPoint, Place]
	private Organization worksFor;

	public String getAdditionalName()
	{
		return additionalName;
	}

	public void setAdditionalName(String additionalName)
	{
		this.additionalName = additionalName;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Organization getAffiliation()
	{
		return affiliation;
	}

	public void setAffiliation(Organization affiliation)
	{
		this.affiliation = affiliation;
	}

	public EducationalOrganization getAlumniOf()
	{
		return alumniOf;
	}

	public void setAlumniOf(EducationalOrganization alumniOf)
	{
		this.alumniOf = alumniOf;
	}

	public String getAward()
	{
		return award;
	}

	public void setAward(String award)
	{
		this.award = award;
	}

	public Date getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	public Place getBirthPlace()
	{
		return birthPlace;
	}

	public void setBirthPlace(Place birthPlace)
	{
		this.birthPlace = birthPlace;
	}

	public Brand getBrand()
	{
		return brand;
	}

	public void setBrand(Brand brand)
	{
		this.brand = brand;
	}

	public Person getChildren()
	{
		return children;
	}

	public void setChildren(Person children)
	{
		this.children = children;
	}

	public String getColleague()
	{
		return colleague;
	}

	public void setColleague(String colleague)
	{
		this.colleague = colleague;
	}

	public ContactPoint getContactPoint()
	{
		return contactPoint;
	}

	public void setContactPoint(ContactPoint contactPoint)
	{
		this.contactPoint = contactPoint;
	}

	public Date getDeathDate()
	{
		return deathDate;
	}

	public void setDeathDate(Date deathDate)
	{
		this.deathDate = deathDate;
	}

	public Place getDeathPlace()
	{
		return deathPlace;
	}

	public void setDeathPlace(Place deathPlace)
	{
		this.deathPlace = deathPlace;
	}

	public String getDuns()
	{
		return duns;
	}

	public void setDuns(String duns)
	{
		this.duns = duns;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getFamilyName()
	{
		return familyName;
	}

	public void setFamilyName(String familyName)
	{
		this.familyName = familyName;
	}

	public String getFaxNumber()
	{
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public Person getFollows()
	{
		return follows;
	}

	public void setFollows(Person follows)
	{
		this.follows = follows;
	}

	public Organization getFunder()
	{
		return funder;
	}

	public void setFunder(Organization funder)
	{
		this.funder = funder;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getGivenName()
	{
		return givenName;
	}

	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}

	public String getGlobalLocationNumber()
	{
		return globalLocationNumber;
	}

	public void setGlobalLocationNumber(String globalLocationNumber)
	{
		this.globalLocationNumber = globalLocationNumber;
	}

	public OfferCatalog getHasOfferCatalog()
	{
		return hasOfferCatalog;
	}

	public void setHasOfferCatalog(OfferCatalog hasOfferCatalog)
	{
		this.hasOfferCatalog = hasOfferCatalog;
	}

	public Place getHasPOS()
	{
		return hasPOS;
	}

	public void setHasPOS(Place hasPOS)
	{
		this.hasPOS = hasPOS;
	}

	public Distance getHeight()
	{
		return height;
	}

	public void setHeight(Distance height)
	{
		this.height = height;
	}

	public ContactPoint getHomeLocation()
	{
		return homeLocation;
	}

	public void setHomeLocation(ContactPoint homeLocation)
	{
		this.homeLocation = homeLocation;
	}

	public String getHonorificPrefix()
	{
		return honorificPrefix;
	}

	public void setHonorificPrefix(String honorificPrefix)
	{
		this.honorificPrefix = honorificPrefix;
	}

	public String getHonorificSuffix()
	{
		return honorificSuffix;
	}

	public void setHonorificSuffix(String honorificSuffix)
	{
		this.honorificSuffix = honorificSuffix;
	}

	public String getIsicV4()
	{
		return isicV4;
	}

	public void setIsicV4(String isicV4)
	{
		this.isicV4 = isicV4;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public Person getKnows()
	{
		return knows;
	}

	public void setKnows(Person knows)
	{
		this.knows = knows;
	}

	public Offer getMakesOffer()
	{
		return makesOffer;
	}

	public void setMakesOffer(Offer makesOffer)
	{
		this.makesOffer = makesOffer;
	}

	public Organization getMemberOf()
	{
		return memberOf;
	}

	public void setMemberOf(Organization memberOf)
	{
		this.memberOf = memberOf;
	}

	public String getNaics()
	{
		return naics;
	}

	public void setNaics(String naics)
	{
		this.naics = naics;
	}

	public Country getNationality()
	{
		return nationality;
	}

	public void setNationality(Country nationality)
	{
		this.nationality = nationality;
	}

	public MonetaryAmount getNetWorth()
	{
		return netWorth;
	}

	public void setNetWorth(MonetaryAmount netWorth)
	{
		this.netWorth = netWorth;
	}

	public OwnershipInfo getOwns()
	{
		return owns;
	}

	public void setOwns(OwnershipInfo owns)
	{
		this.owns = owns;
	}

	public Person getParent()
	{
		return parent;
	}

	public void setParent(Person parent)
	{
		this.parent = parent;
	}

	public Event getPerformerIn()
	{
		return performerIn;
	}

	public void setPerformerIn(Event performerIn)
	{
		this.performerIn = performerIn;
	}

	public String getPublishingPrinciples()
	{
		return publishingPrinciples;
	}

	public void setPublishingPrinciples(String publishingPrinciples)
	{
		this.publishingPrinciples = publishingPrinciples;
	}

	public Person getRelatedTo()
	{
		return relatedTo;
	}

	public void setRelatedTo(Person relatedTo)
	{
		this.relatedTo = relatedTo;
	}

	public Demand getSeeks()
	{
		return seeks;
	}

	public void setSeeks(Demand seeks)
	{
		this.seeks = seeks;
	}

	public Person getSibling()
	{
		return sibling;
	}

	public void setSibling(Person sibling)
	{
		this.sibling = sibling;
	}

	public Organization getSponsor()
	{
		return sponsor;
	}

	public void setSponsor(Organization sponsor)
	{
		this.sponsor = sponsor;
	}

	public Person getSpouse()
	{
		return spouse;
	}

	public void setSpouse(Person spouse)
	{
		this.spouse = spouse;
	}

	public String getTaxID()
	{
		return taxID;
	}

	public void setTaxID(String taxID)
	{
		this.taxID = taxID;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getVatID()
	{
		return vatID;
	}

	public void setVatID(String vatID)
	{
		this.vatID = vatID;
	}

	public QuantitativeValue getWeight()
	{
		return weight;
	}

	public void setWeight(QuantitativeValue weight)
	{
		this.weight = weight;
	}

	public ContactPoint getWorkLocation()
	{
		return workLocation;
	}

	public void setWorkLocation(ContactPoint workLocation)
	{
		this.workLocation = workLocation;
	}

	public Organization getWorksFor()
	{
		return worksFor;
	}

	public void setWorksFor(Organization worksFor)
	{
		this.worksFor = worksFor;
	}
}