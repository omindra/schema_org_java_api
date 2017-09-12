package org.schema.api.model.thing.product;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.creativeWork.review.Review;
import org.schema.api.model.thing.intangible.Brand;
import org.schema.api.model.thing.intangible.audience.Audience;
import org.schema.api.model.thing.intangible.enumeration.OfferItemCondition;
import org.schema.api.model.thing.intangible.offer.Offer;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.PropertyValue;
import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class Product extends Thing
{
	private PropertyValue additionalProperty;
	private AggregateRating aggregateRating;
	private Audience audience;//Notes - Allowed types- [Audience, serviceAudience]
	private String award;
	private Brand brand;//Notes - Allowed types- [Brand, Organization]
	private String category;//Notes - Allowed types- [PhysicalActivityCategory, Text, Thing]
	private String color;
	private Distance depth;//Notes - Allowed types- [Distance, QuantitativeValue]
	private String gtin12;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private Distance height;//Notes - Allowed types- [Distance, QuantitativeValue]
	private Product isAccessoryOrSparePartFor;
	private Product isConsumableFor;
	private Product isRelatedTo;//Notes - Allowed types- [Product, Service]
	private Product isSimilarTo;//Notes - Allowed types- [Product, Service]
	private OfferItemCondition itemCondition;
	private String logo;//Notes - Allowed types- [ImageObject, URL]
	private Organization manufacturer;
	private String material;//Notes - Allowed types- [Product, Text, URL]
	private String model;//Notes - Allowed types- [ProductModel, Text]
	private String mpn;
	private Offer offers;
	private String productID;
	private Date productionDate;
	private Date purchaseDate;
	private Date releaseDate;
	private Review review;//Notes - Allowed types- [Review, reviews]
	private String sku;
	private QuantitativeValue weight;
	private Distance width;//Notes - Allowed types- [Distance, QuantitativeValue]

	public PropertyValue getAdditionalProperty()
	{
		return additionalProperty;
	}

	public void setAdditionalProperty(PropertyValue additionalProperty)
	{
		this.additionalProperty = additionalProperty;
	}

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public Audience getAudience()
	{
		return audience;
	}

	public void setAudience(Audience audience)
	{
		this.audience = audience;
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

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public Distance getDepth()
	{
		return depth;
	}

	public void setDepth(Distance depth)
	{
		this.depth = depth;
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

	public Distance getHeight()
	{
		return height;
	}

	public void setHeight(Distance height)
	{
		this.height = height;
	}

	public Product getIsAccessoryOrSparePartFor()
	{
		return isAccessoryOrSparePartFor;
	}

	public void setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor)
	{
		this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
	}

	public Product getIsConsumableFor()
	{
		return isConsumableFor;
	}

	public void setIsConsumableFor(Product isConsumableFor)
	{
		this.isConsumableFor = isConsumableFor;
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

	public OfferItemCondition getItemCondition()
	{
		return itemCondition;
	}

	public void setItemCondition(OfferItemCondition itemCondition)
	{
		this.itemCondition = itemCondition;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public Organization getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(Organization manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getMpn()
	{
		return mpn;
	}

	public void setMpn(String mpn)
	{
		this.mpn = mpn;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
	}

	public String getProductID()
	{
		return productID;
	}

	public void setProductID(String productID)
	{
		this.productID = productID;
	}

	public Date getProductionDate()
	{
		return productionDate;
	}

	public void setProductionDate(Date productionDate)
	{
		this.productionDate = productionDate;
	}

	public Date getPurchaseDate()
	{
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate)
	{
		this.purchaseDate = purchaseDate;
	}

	public Date getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public String getSku()
	{
		return sku;
	}

	public void setSku(String sku)
	{
		this.sku = sku;
	}

	public QuantitativeValue getWeight()
	{
		return weight;
	}

	public void setWeight(QuantitativeValue weight)
	{
		this.weight = weight;
	}

	public Distance getWidth()
	{
		return width;
	}

	public void setWidth(Distance width)
	{
		this.width = width;
	}
}