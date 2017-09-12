package org.schema.api.model.thing.creativeWork.review;

import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.rating.Rating;

public class Review extends CreativeWork
{
	private Thing itemReviewed;
	private String reviewBody;
	private Rating reviewRating;

	public Thing getItemReviewed()
	{
		return itemReviewed;
	}

	public void setItemReviewed(Thing itemReviewed)
	{
		this.itemReviewed = itemReviewed;
	}

	public String getReviewBody()
	{
		return reviewBody;
	}

	public void setReviewBody(String reviewBody)
	{
		this.reviewBody = reviewBody;
	}

	public Rating getReviewRating()
	{
		return reviewRating;
	}

	public void setReviewRating(Rating reviewRating)
	{
		this.reviewRating = reviewRating;
	}
}