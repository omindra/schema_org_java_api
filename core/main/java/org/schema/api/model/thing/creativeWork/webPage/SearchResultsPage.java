package org.schema.api.model.thing.creativeWork.webPage;

import org.schema.api.model.thing.creativeWork.webPage.WebPage;
import java.util.Date;
import org.schema.api.model.thing.creativeWork.webPageElement.WebPageElement;
import org.schema.api.model.thing.creativeWork.mediaObject.imageObject.ImageObject;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.intangible.enumeration.Specialty;

public class SearchResultsPage extends WebPage
{
	private String breadcrumb;//Notes - Allowed types- [BreadcrumbList, Text]
	private Date lastReviewed;
	private WebPageElement mainContentOfPage;
	private ImageObject primaryImageOfPage;
	private String relatedLink;
	private Organization reviewedBy;//Notes - Allowed types- [Organization, Person]
	private String significantLink;
	private String speakable;//Notes - Allowed types- [SpeakableSpecification, URL]
	private Specialty specialty;

	public String getBreadcrumb()
	{
		return breadcrumb;
	}

	public void setBreadcrumb(String breadcrumb)
	{
		this.breadcrumb = breadcrumb;
	}

	public Date getLastReviewed()
	{
		return lastReviewed;
	}

	public void setLastReviewed(Date lastReviewed)
	{
		this.lastReviewed = lastReviewed;
	}

	public WebPageElement getMainContentOfPage()
	{
		return mainContentOfPage;
	}

	public void setMainContentOfPage(WebPageElement mainContentOfPage)
	{
		this.mainContentOfPage = mainContentOfPage;
	}

	public ImageObject getPrimaryImageOfPage()
	{
		return primaryImageOfPage;
	}

	public void setPrimaryImageOfPage(ImageObject primaryImageOfPage)
	{
		this.primaryImageOfPage = primaryImageOfPage;
	}

	public String getRelatedLink()
	{
		return relatedLink;
	}

	public void setRelatedLink(String relatedLink)
	{
		this.relatedLink = relatedLink;
	}

	public Organization getReviewedBy()
	{
		return reviewedBy;
	}

	public void setReviewedBy(Organization reviewedBy)
	{
		this.reviewedBy = reviewedBy;
	}

	public String getSignificantLink()
	{
		return significantLink;
	}

	public void setSignificantLink(String significantLink)
	{
		this.significantLink = significantLink;
	}

	public String getSpeakable()
	{
		return speakable;
	}

	public void setSpeakable(String speakable)
	{
		this.speakable = speakable;
	}

	public Specialty getSpecialty()
	{
		return specialty;
	}

	public void setSpecialty(Specialty specialty)
	{
		this.specialty = specialty;
	}
}