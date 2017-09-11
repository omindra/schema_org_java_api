package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.intangible.rating.AggregateRating;
import org.schema.api.model.thing.creativeWork.Review;

public class Brand extends Intangible
{
	private AggregateRating aggregateRating;
	private String logo;//Notes - Allowed types- [ImageObject, URL]
	private Review review;//Notes - Allowed types- [Review, reviews]

	public AggregateRating getAggregateRating()
	{
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating)
	{
		this.aggregateRating = aggregateRating;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}
}