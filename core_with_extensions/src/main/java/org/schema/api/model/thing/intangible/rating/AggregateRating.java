package org.schema.api.model.thing.intangible.rating;

import org.schema.api.model.thing.Thing;

public class AggregateRating extends Rating
{
	private Thing itemReviewed;
	private Integer ratingCount;
	private Integer reviewCount;

	public Thing getItemReviewed()
	{
		return itemReviewed;
	}

	public void setItemReviewed(Thing itemReviewed)
	{
		this.itemReviewed = itemReviewed;
	}

	public Integer getRatingCount()
	{
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount)
	{
		this.ratingCount = ratingCount;
	}

	public Integer getReviewCount()
	{
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount)
	{
		this.reviewCount = reviewCount;
	}
}