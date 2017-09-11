package org.schema.api.model.thing.creativeWork.visualArtwork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.intangible.quantity.Distance;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.Person;
import org.schema.api.model.thing.intangible.quantity.Distance;

public class VisualArtwork extends CreativeWork
{
	private String artEdition;//Notes - Allowed types- [Integer, Text]
	private String artMedium;//Notes - Allowed types- [Text, URL]
	private String artform;//Notes - Allowed types- [Text, URL]
	private Person artist;
	private String artworkSurface;//Notes - Allowed types- [Text, URL]
	private Person colorist;
	private Distance depth;//Notes - Allowed types- [Distance, QuantitativeValue]
	private Distance height;//Notes - Allowed types- [Distance, QuantitativeValue]
	private Person inker;
	private Person letterer;
	private Person penciler;
	private Distance width;//Notes - Allowed types- [Distance, QuantitativeValue]

	public String getArtEdition()
	{
		return artEdition;
	}

	public void setArtEdition(String artEdition)
	{
		this.artEdition = artEdition;
	}

	public String getArtMedium()
	{
		return artMedium;
	}

	public void setArtMedium(String artMedium)
	{
		this.artMedium = artMedium;
	}

	public String getArtform()
	{
		return artform;
	}

	public void setArtform(String artform)
	{
		this.artform = artform;
	}

	public Person getArtist()
	{
		return artist;
	}

	public void setArtist(Person artist)
	{
		this.artist = artist;
	}

	public String getArtworkSurface()
	{
		return artworkSurface;
	}

	public void setArtworkSurface(String artworkSurface)
	{
		this.artworkSurface = artworkSurface;
	}

	public Person getColorist()
	{
		return colorist;
	}

	public void setColorist(Person colorist)
	{
		this.colorist = colorist;
	}

	public Distance getDepth()
	{
		return depth;
	}

	public void setDepth(Distance depth)
	{
		this.depth = depth;
	}

	public Distance getHeight()
	{
		return height;
	}

	public void setHeight(Distance height)
	{
		this.height = height;
	}

	public Person getInker()
	{
		return inker;
	}

	public void setInker(Person inker)
	{
		this.inker = inker;
	}

	public Person getLetterer()
	{
		return letterer;
	}

	public void setLetterer(Person letterer)
	{
		this.letterer = letterer;
	}

	public Person getPenciler()
	{
		return penciler;
	}

	public void setPenciler(Person penciler)
	{
		this.penciler = penciler;
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