package org.schema.api.model.thing.action.assessAction;

import org.schema.api.model.thing.action.assessAction.AssessAction;
import org.schema.api.model.thing.creativeWork.Review;

public class ReviewAction extends AssessAction
{
	private Review resultReview;

	public Review getResultReview()
	{
		return resultReview;
	}

	public void setResultReview(Review resultReview)
	{
		this.resultReview = resultReview;
	}
}