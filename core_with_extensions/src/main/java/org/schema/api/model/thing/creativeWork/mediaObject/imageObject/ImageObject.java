package org.schema.api.model.thing.creativeWork.mediaObject.imageObject;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;

public class ImageObject extends MediaObject
{
	private String caption;
	private String exifData;//Notes - Allowed types- [PropertyValue, Text]
	private Boolean representativeOfPage;
	private ImageObject thumbnail;

	public String getCaption()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		this.caption = caption;
	}

	public String getExifData()
	{
		return exifData;
	}

	public void setExifData(String exifData)
	{
		this.exifData = exifData;
	}

	public Boolean getRepresentativeOfPage()
	{
		return representativeOfPage;
	}

	public void setRepresentativeOfPage(Boolean representativeOfPage)
	{
		this.representativeOfPage = representativeOfPage;
	}

	public ImageObject getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(ImageObject thumbnail)
	{
		this.thumbnail = thumbnail;
	}
}