package org.schema.api.model.thing.intangible.offer;

public class AggregateOffer extends Offer
{
	private Number highPrice;//Notes - Allowed types- [Number, Text]
	private Number lowPrice;//Notes - Allowed types- [Number, Text]
	private Integer offerCount;
	private Offer offers;

	public Number getHighPrice()
	{
		return highPrice;
	}

	public void setHighPrice(Number highPrice)
	{
		this.highPrice = highPrice;
	}

	public Number getLowPrice()
	{
		return lowPrice;
	}

	public void setLowPrice(Number lowPrice)
	{
		this.lowPrice = lowPrice;
	}

	public Integer getOfferCount()
	{
		return offerCount;
	}

	public void setOfferCount(Integer offerCount)
	{
		this.offerCount = offerCount;
	}

	public Offer getOffers()
	{
		return offers;
	}

	public void setOffers(Offer offers)
	{
		this.offers = offers;
	}
}