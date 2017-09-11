package org.schema.api.model.thing.intangible.quantity;

import org.schema.api.model.thing.intangible.quantity.Quantity;
import org.schema.api.model.thing.action.Action;

public class Mass extends Quantity
{
	private String additionalType;
	private String alternateName;
	private String description;
	private String disambiguatingDescription;
	private String identifier;//Notes - Allowed types- [PropertyValue, Text, URL]
	private String image;//Notes - Allowed types- [ImageObject, URL]
	private String mainEntityOfPage;//Notes - Allowed types- [CreativeWork, URL, mainEntity]
	private String name;
	private Action potentialAction;
	private String sameAs;
	private String url;

	public String getAdditionalType()
	{
		return additionalType;
	}

	public void setAdditionalType(String additionalType)
	{
		this.additionalType = additionalType;
	}

	public String getAlternateName()
	{
		return alternateName;
	}

	public void setAlternateName(String alternateName)
	{
		this.alternateName = alternateName;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDisambiguatingDescription()
	{
		return disambiguatingDescription;
	}

	public void setDisambiguatingDescription(String disambiguatingDescription)
	{
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public String getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	public String getMainEntityOfPage()
	{
		return mainEntityOfPage;
	}

	public void setMainEntityOfPage(String mainEntityOfPage)
	{
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Action getPotentialAction()
	{
		return potentialAction;
	}

	public void setPotentialAction(Action potentialAction)
	{
		this.potentialAction = potentialAction;
	}

	public String getSameAs()
	{
		return sameAs;
	}

	public void setSameAs(String sameAs)
	{
		this.sameAs = sameAs;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
}