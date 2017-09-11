package org.schema.api.model.thing.intangible.rating;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.organization.Organization;

public class Rating extends Intangible
{
	private Organization author;//Notes - Allowed types- [Organization, Person]
	private Number bestRating;//Notes - Allowed types- [Number, Text]
	private Number ratingValue;//Notes - Allowed types- [Number, Text]
	private Number worstRating;//Notes - Allowed types- [Number, Text]

	public Organization getAuthor()
	{
		return author;
	}

	public void setAuthor(Organization author)
	{
		this.author = author;
	}

	public Number getBestRating()
	{
		return bestRating;
	}

	public void setBestRating(Number bestRating)
	{
		this.bestRating = bestRating;
	}

	public Number getRatingValue()
	{
		return ratingValue;
	}

	public void setRatingValue(Number ratingValue)
	{
		this.ratingValue = ratingValue;
	}

	public Number getWorstRating()
	{
		return worstRating;
	}

	public void setWorstRating(Number worstRating)
	{
		this.worstRating = worstRating;
	}
}