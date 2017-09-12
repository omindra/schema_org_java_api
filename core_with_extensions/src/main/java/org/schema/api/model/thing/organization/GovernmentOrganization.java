package org.schema.api.model.thing.organization;

import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.creativeWork.review.Review;
import org.schema.api.model.thing.event.Event;
import org.schema.api.model.thing.intangible.Brand;
import org.schema.api.model.thing.intangible.Demand;
import org.schema.api.model.thing.intangible.itemList.OfferCatalog;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.intangible.structuredValue.OwnershipInfo;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.contactPoint.ContactPoint;
import org.schema.api.model.thing.place.Place;

import java.util.Date;

public class GovernmentOrganization extends Organization
{
	private String actionableFeedbackPolicy;//Notes - Allowed types- [CreativeWork, URL, NewsMediaOrganization, Organization]
	private String address;//Notes - Allowed types- [PostalAddress, Text]
	private AggregateRating aggregateRating;
	private Person alumni;
	private String areaServed;//Notes - Allowed types- [AdministrativeArea, GeoShape, Place, Text, serviceArea]
	private String award;
	private Brand brand;//Notes - Allowed types- [Brand, Organization]
	private ContactPoint contactPoint;
	private String correctionsPolicy;//Notes - Allowed types- [CreativeWork, URL, Organization, NewsMediaOrganization]
	private Organization department;
	private Date dissolutionDate;
	private String diversityPolicy;//Notes - Allowed types- [CreativeWork, URL, Organization, NewsMediaOrganization, NewsMediaOrganization]
	private String duns;
	private String email;
	private Person employee;
	private String ethicsPolicy;//Notes - Allowed types- [CreativeWork, URL, NewsMediaOrganization, Restaurant, NewsMediaOrganization]
	private Event event;
	private String faxNumber;
	private Person founder;
	private Date foundingDate;
	private Place foundingLocation;
	private Organization funder;//Notes - Allowed types- [Organization, Person]
	private String globalLocationNumber;
	private OfferCatalog hasOfferCatalog;
	private Place hasPOS;
	private String isicV4;
	private String legalName;
	private String leiCode;
	private String location;//Notes - Allowed types- [Place, PostalAddress, Text]
	private String logo;//Notes - Allowed types- [ImageObject, URL]
	private Offer makesOffer;
	private Organization member;//Notes - Allowed types- [Organization, Person, members, musicGroupMember]
	private Organization memberOf;//Notes - Allowed types- [Organization, ProgramMembership]
	private String naics;
	private QuantitativeValue numberOfEmployees;
	private OwnershipInfo owns;//Notes - Allowed types- [OwnershipInfo, Product]
	private Organization parentOrganization;//Notes - Allowed types- [Organization, subOrganization]
	private String publishingPrinciples;//Notes - Allowed types- [CreativeWork, URL]
	private Review review;//Notes - Allowed types- [Review, reviews]
	private Demand seeks;
	private Organization sponsor;//Notes - Allowed types- [Organization, Person]
	private Organization subOrganization;//Notes - Allowed types- [Organization, parentOrganization]
	private String taxID;
	private String telephone;
	private String unnamedSourcesPolicy;//Notes - Allowed types- [CreativeWork, URL, Organization, NewsMediaOrganization]
	private String vatID;

	public String getActionableFeedbackPolicy()
	{
		return actionableFeedbackPolicy;
	}

	public void setActionableFeedbackPolicy(String actionableFeedbackPolicy)
	{
		this.actionableFeedbackPolicy = actionableFeedbackPolicy;
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

	public Person getAlumni()
	{
		return alumni;
	}

	public void setAlumni(Person alumni)
	{
		this.alumni = alumni;
	}

	public String getAreaServed()
	{
		return areaServed;
	}

	public void setAreaServed(String areaServed)
	{
		this.areaServed = areaServed;
	}

	public String getAward()
	{
		return award;
	}

	public void setAward(String award)
	{
		this.award = award;
	}

	public Brand getBrand()
	{
		return brand;
	}

	public void setBrand(Brand brand)
	{
		this.brand = brand;
	}

	public ContactPoint getContactPoint()
	{
		return contactPoint;
	}

	public void setContactPoint(ContactPoint contactPoint)
	{
		this.contactPoint = contactPoint;
	}

	public String getCorrectionsPolicy()
	{
		return correctionsPolicy;
	}

	public void setCorrectionsPolicy(String correctionsPolicy)
	{
		this.correctionsPolicy = correctionsPolicy;
	}

	public Organization getDepartment()
	{
		return department;
	}

	public void setDepartment(Organization department)
	{
		this.department = department;
	}

	public Date getDissolutionDate()
	{
		return dissolutionDate;
	}

	public void setDissolutionDate(Date dissolutionDate)
	{
		this.dissolutionDate = dissolutionDate;
	}

	public String getDiversityPolicy()
	{
		return diversityPolicy;
	}

	public void setDiversityPolicy(String diversityPolicy)
	{
		this.diversityPolicy = diversityPolicy;
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

	public Person getEmployee()
	{
		return employee;
	}

	public void setEmployee(Person employee)
	{
		this.employee = employee;
	}

	public String getEthicsPolicy()
	{
		return ethicsPolicy;
	}

	public void setEthicsPolicy(String ethicsPolicy)
	{
		this.ethicsPolicy = ethicsPolicy;
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

	public Person getFounder()
	{
		return founder;
	}

	public void setFounder(Person founder)
	{
		this.founder = founder;
	}

	public Date getFoundingDate()
	{
		return foundingDate;
	}

	public void setFoundingDate(Date foundingDate)
	{
		this.foundingDate = foundingDate;
	}

	public Place getFoundingLocation()
	{
		return foundingLocation;
	}

	public void setFoundingLocation(Place foundingLocation)
	{
		this.foundingLocation = foundingLocation;
	}

	public Organization getFunder()
	{
		return funder;
	}

	public void setFunder(Organization funder)
	{
		this.funder = funder;
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

	public String getIsicV4()
	{
		return isicV4;
	}

	public void setIsicV4(String isicV4)
	{
		this.isicV4 = isicV4;
	}

	public String getLegalName()
	{
		return legalName;
	}

	public void setLegalName(String legalName)
	{
		this.legalName = legalName;
	}

	public String getLeiCode()
	{
		return leiCode;
	}

	public void setLeiCode(String leiCode)
	{
		this.leiCode = leiCode;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public Offer getMakesOffer()
	{
		return makesOffer;
	}

	public void setMakesOffer(Offer makesOffer)
	{
		this.makesOffer = makesOffer;
	}

	public Organization getMember()
	{
		return member;
	}

	public void setMember(Organization member)
	{
		this.member = member;
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

	public QuantitativeValue getNumberOfEmployees()
	{
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(QuantitativeValue numberOfEmployees)
	{
		this.numberOfEmployees = numberOfEmployees;
	}

	public OwnershipInfo getOwns()
	{
		return owns;
	}

	public void setOwns(OwnershipInfo owns)
	{
		this.owns = owns;
	}

	public Organization getParentOrganization()
	{
		return parentOrganization;
	}

	public void setParentOrganization(Organization parentOrganization)
	{
		this.parentOrganization = parentOrganization;
	}

	public String getPublishingPrinciples()
	{
		return publishingPrinciples;
	}

	public void setPublishingPrinciples(String publishingPrinciples)
	{
		this.publishingPrinciples = publishingPrinciples;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public Demand getSeeks()
	{
		return seeks;
	}

	public void setSeeks(Demand seeks)
	{
		this.seeks = seeks;
	}

	public Organization getSponsor()
	{
		return sponsor;
	}

	public void setSponsor(Organization sponsor)
	{
		this.sponsor = sponsor;
	}

	public Organization getSubOrganization()
	{
		return subOrganization;
	}

	public void setSubOrganization(Organization subOrganization)
	{
		this.subOrganization = subOrganization;
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

	public String getUnnamedSourcesPolicy()
	{
		return unnamedSourcesPolicy;
	}

	public void setUnnamedSourcesPolicy(String unnamedSourcesPolicy)
	{
		this.unnamedSourcesPolicy = unnamedSourcesPolicy;
	}

	public String getVatID()
	{
		return vatID;
	}

	public void setVatID(String vatID)
	{
		this.vatID = vatID;
	}
}