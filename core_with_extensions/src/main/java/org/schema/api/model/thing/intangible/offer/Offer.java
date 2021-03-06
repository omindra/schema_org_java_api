package org.schema.api.model.thing.intangible.offer;

import org.schema.api.model.thing.creativeWork.review.Review;
import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.intangible.enumeration.BusinessEntityType;
import org.schema.api.model.thing.intangible.enumeration.BusinessFunction;
import org.schema.api.model.thing.intangible.enumeration.ItemAvailability;
import org.schema.api.model.thing.intangible.enumeration.OfferItemCondition;
import org.schema.api.model.thing.intangible.enumeration.deliveryMethod.DeliveryMethod;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.intangible.service.financialProduct.loanOrCredit.LoanOrCredit;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.TypeAndQuantityNode;
import org.schema.api.model.thing.intangible.structuredValue.WarrantyPromise;
import org.schema.api.model.thing.intangible.structuredValue.priceSpecification.PriceSpecification;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.place.Place;
import org.schema.api.model.thing.product.Product;

import java.util.Date;

public class Offer extends Intangible
{
	private LoanOrCredit acceptedPaymentMethod;//Notes - Allowed types- [LoanOrCredit, PaymentMethod]
	private Offer addOn;
	private QuantitativeValue advanceBookingRequirement;
	private AggregateRating aggregateRating;
	private String areaServed;//Notes - Allowed types- [AdministrativeArea, GeoShape, Place, Text, serviceArea]
	private ItemAvailability availability;
	private Date availabilityEnds;
	private Date availabilityStarts;
	private Place availableAtOrFrom;
	private DeliveryMethod availableDeliveryMethod;
	private BusinessFunction businessFunction;
	private String category;//Notes - Allowed types- [PhysicalActivityCategory, Text, Thing]
	private QuantitativeValue deliveryLeadTime;
	private BusinessEntityType eligibleCustomerType;
	private QuantitativeValue eligibleDuration;
	private QuantitativeValue eligibleQuantity;
	private String eligibleRegion;//Notes - Allowed types- [GeoShape, Place, Text]
	private PriceSpecification eligibleTransactionVolume;
	private String gtin12;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private TypeAndQuantityNode includesObject;
	private String ineligibleRegion;//Notes - Allowed types- [GeoShape, Place, Text]
	private QuantitativeValue inventoryLevel;
	private OfferItemCondition itemCondition;
	private Product itemOffered;//Notes - Allowed types- [Product, Service]
	private String mpn;
	private Organization offeredBy;//Notes - Allowed types- [Organization, Person, makesOffer]
	private Number price;//Notes - Allowed types- [Number, Text]
	private String priceCurrency;//Notes - Allowed types- [Text, PriceSpecification]
	private PriceSpecification priceSpecification;
	private Date priceValidUntil;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private Organization seller;//Notes - Allowed types- [Organization, Person]
	private String serialNumber;
	private String sku;
	private Date validFrom;
	private Date validThrough;
	private WarrantyPromise warranty;//Notes - Allowed types- [WarrantyPromise, warrantyPromise]

	public LoanOrCredit getAcceptedPaymentMethod()
	{
		return acceptedPaymentMethod;
	}

	public void setAcceptedPaymentMethod(LoanOrCredit acceptedPaymentMethod)
	{
		this.acceptedPaymentMethod = acceptedPaymentMethod;
	}

	public Offer getAddOn()
	{
		return addOn;
	}

	public void setAddOn(Offer addOn)
	{
		this.addOn = addOn;
	}

	public QuantitativeValue getAdvanceBookingRequirement()
	{
		return advanceBookingRequirement;
	}

	public void setAdvanceBookingRequirement(QuantitativeValue advanceBookingRequirement)
	{
		this.advanceBookingRequirement = advanceBookingRequirement;
	}

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

	public ItemAvailability getAvailability()
	{
		return availability;
	}

	public void setAvailability(ItemAvailability availability)
	{
		this.availability = availability;
	}

	public Date getAvailabilityEnds()
	{
		return availabilityEnds;
	}

	public void setAvailabilityEnds(Date availabilityEnds)
	{
		this.availabilityEnds = availabilityEnds;
	}

	public Date getAvailabilityStarts()
	{
		return availabilityStarts;
	}

	public void setAvailabilityStarts(Date availabilityStarts)
	{
		this.availabilityStarts = availabilityStarts;
	}

	public Place getAvailableAtOrFrom()
	{
		return availableAtOrFrom;
	}

	public void setAvailableAtOrFrom(Place availableAtOrFrom)
	{
		this.availableAtOrFrom = availableAtOrFrom;
	}

	public DeliveryMethod getAvailableDeliveryMethod()
	{
		return availableDeliveryMethod;
	}

	public void setAvailableDeliveryMethod(DeliveryMethod availableDeliveryMethod)
	{
		this.availableDeliveryMethod = availableDeliveryMethod;
	}

	public BusinessFunction getBusinessFunction()
	{
		return businessFunction;
	}

	public void setBusinessFunction(BusinessFunction businessFunction)
	{
		this.businessFunction = businessFunction;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public QuantitativeValue getDeliveryLeadTime()
	{
		return deliveryLeadTime;
	}

	public void setDeliveryLeadTime(QuantitativeValue deliveryLeadTime)
	{
		this.deliveryLeadTime = deliveryLeadTime;
	}

	public BusinessEntityType getEligibleCustomerType()
	{
		return eligibleCustomerType;
	}

	public void setEligibleCustomerType(BusinessEntityType eligibleCustomerType)
	{
		this.eligibleCustomerType = eligibleCustomerType;
	}

	public QuantitativeValue getEligibleDuration()
	{
		return eligibleDuration;
	}

	public void setEligibleDuration(QuantitativeValue eligibleDuration)
	{
		this.eligibleDuration = eligibleDuration;
	}

	public QuantitativeValue getEligibleQuantity()
	{
		return eligibleQuantity;
	}

	public void setEligibleQuantity(QuantitativeValue eligibleQuantity)
	{
		this.eligibleQuantity = eligibleQuantity;
	}

	public String getEligibleRegion()
	{
		return eligibleRegion;
	}

	public void setEligibleRegion(String eligibleRegion)
	{
		this.eligibleRegion = eligibleRegion;
	}

	public PriceSpecification getEligibleTransactionVolume()
	{
		return eligibleTransactionVolume;
	}

	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume)
	{
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}

	public String getGtin12()
	{
		return gtin12;
	}

	public void setGtin12(String gtin12)
	{
		this.gtin12 = gtin12;
	}

	public String getGtin13()
	{
		return gtin13;
	}

	public void setGtin13(String gtin13)
	{
		this.gtin13 = gtin13;
	}

	public String getGtin14()
	{
		return gtin14;
	}

	public void setGtin14(String gtin14)
	{
		this.gtin14 = gtin14;
	}

	public String getGtin8()
	{
		return gtin8;
	}

	public void setGtin8(String gtin8)
	{
		this.gtin8 = gtin8;
	}

	public TypeAndQuantityNode getIncludesObject()
	{
		return includesObject;
	}

	public void setIncludesObject(TypeAndQuantityNode includesObject)
	{
		this.includesObject = includesObject;
	}

	public String getIneligibleRegion()
	{
		return ineligibleRegion;
	}

	public void setIneligibleRegion(String ineligibleRegion)
	{
		this.ineligibleRegion = ineligibleRegion;
	}

	public QuantitativeValue getInventoryLevel()
	{
		return inventoryLevel;
	}

	public void setInventoryLevel(QuantitativeValue inventoryLevel)
	{
		this.inventoryLevel = inventoryLevel;
	}

	public OfferItemCondition getItemCondition()
	{
		return itemCondition;
	}

	public void setItemCondition(OfferItemCondition itemCondition)
	{
		this.itemCondition = itemCondition;
	}

	public Product getItemOffered()
	{
		return itemOffered;
	}

	public void setItemOffered(Product itemOffered)
	{
		this.itemOffered = itemOffered;
	}

	public String getMpn()
	{
		return mpn;
	}

	public void setMpn(String mpn)
	{
		this.mpn = mpn;
	}

	public Organization getOfferedBy()
	{
		return offeredBy;
	}

	public void setOfferedBy(Organization offeredBy)
	{
		this.offeredBy = offeredBy;
	}

	public Number getPrice()
	{
		return price;
	}

	public void setPrice(Number price)
	{
		this.price = price;
	}

	public String getPriceCurrency()
	{
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency)
	{
		this.priceCurrency = priceCurrency;
	}

	public PriceSpecification getPriceSpecification()
	{
		return priceSpecification;
	}

	public void setPriceSpecification(PriceSpecification priceSpecification)
	{
		this.priceSpecification = priceSpecification;
	}

	public Date getPriceValidUntil()
	{
		return priceValidUntil;
	}

	public void setPriceValidUntil(Date priceValidUntil)
	{
		this.priceValidUntil = priceValidUntil;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public Organization getSeller()
	{
		return seller;
	}

	public void setSeller(Organization seller)
	{
		this.seller = seller;
	}

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public String getSku()
	{
		return sku;
	}

	public void setSku(String sku)
	{
		this.sku = sku;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidThrough()
	{
		return validThrough;
	}

	public void setValidThrough(Date validThrough)
	{
		this.validThrough = validThrough;
	}

	public WarrantyPromise getWarranty()
	{
		return warranty;
	}

	public void setWarranty(WarrantyPromise warranty)
	{
		this.warranty = warranty;
	}
}