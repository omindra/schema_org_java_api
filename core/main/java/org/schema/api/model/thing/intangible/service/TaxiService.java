package org.schema.api.model.thing.intangible.service;

import org.schema.api.model.thing.intangible.service.Service;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.ServiceChannel;
import org.schema.api.model.thing.intangible.Brand;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.itemList.OfferCatalog;
import org.schema.api.model.thing.intangible.structuredValue.OpeningHoursSpecification;
import org.schema.api.model.thing.product.Product;
import org.schema.api.model.thing.product.Product;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.creativeWork.Review;
import org.schema.api.model.thing.Thing;

public class TaxiService extends Service
{
	private AggregateRating aggregateRating;
	private String areaServed;//Notes - Allowed types- [AdministrativeArea, GeoShape, Place, Text, serviceArea]
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private ServiceChannel availableChannel;
	private String award;
	private Brand brand;//Notes - Allowed types- [Brand, Organization]
	private Organization broker;//Notes - Allowed types- [Organization, Person, bookingAgent]
	private String category;//Notes - Allowed types- [PhysicalActivityCategory, Text, Thing]
	private OfferCatalog hasOfferCatalog;
	private OpeningHoursSpecification hoursAvailable;
	private Product isRelatedTo;//Notes - Allowed types- [Product, Service]
	private Product isSimilarTo;//Notes - Allowed types- [Product, Service]
	private String logo;//Notes - Allowed types- [ImageObject, URL]
	private Offer offers;
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private String providerMobility;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private Thing serviceOutput;
	private String serviceType;
	private String termsOfService;//Notes - Allowed types- [Text, URL]

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public String getAreaServed()
	{
		return areaServed;
	}

	public void setAreaServed(String areaServed)
	{
		this.areaServed = areaServed;
	}

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
	}

	public ServiceChannel getAvailableChannel()
	{
		return availableChannel;
	}

	public void setAvailableChannel(ServiceChannel availableChannel)
	{
		this.availableChannel = availableChannel;
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

	public Organization getBroker()
	{
		return broker;
	}

	public void setBroker(Organization broker)
	{
		this.broker = broker;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public OfferCatalog getHasOfferCatalog()
	{
		return hasOfferCatalog;
	}

	public void setHasOfferCatalog(OfferCatalog hasOfferCatalog)
	{
		this.hasOfferCatalog = hasOfferCatalog;
	}

	public OpeningHoursSpecification getHoursAvailable()
	{
		return hoursAvailable;
	}

	public void setHoursAvailable(OpeningHoursSpecification hoursAvailable)
	{
		this.hoursAvailable = hoursAvailable;
	}

	public Product getIsRelatedTo()
	{
		return isRelatedTo;
	}

	public void setIsRelatedTo(Product isRelatedTo)
	{
		this.isRelatedTo = isRelatedTo;
	}

	public Product getIsSimilarTo()
	{
		return isSimilarTo;
	}

	public void setIsSimilarTo(Product isSimilarTo)
	{
		this.isSimilarTo = isSimilarTo;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public String getProviderMobility()
	{
		return providerMobility;
	}

	public void setProviderMobility(String providerMobility)
	{
		this.providerMobility = providerMobility;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public Thing getServiceOutput()
	{
		return serviceOutput;
	}

	public void setServiceOutput(Thing serviceOutput)
	{
		this.serviceOutput = serviceOutput;
	}

	public String getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(String serviceType)
	{
		this.serviceType = serviceType;
	}

	public String getTermsOfService()
	{
		return termsOfService;
	}

	public void setTermsOfService(String termsOfService)
	{
		this.termsOfService = termsOfService;
	}
}