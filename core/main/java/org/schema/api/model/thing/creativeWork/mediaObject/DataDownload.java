package org.schema.api.model.thing.creativeWork.mediaObject;

import org.schema.api.model.thing.creativeWork.mediaObject.MediaObject;

public class DataDownload extends MediaObject
{
	private String measurementTechnique;//Notes - Allowed types- [Text, URL, Dataset, DataDownload, DataCatalog]

	public String getMeasurementTechnique()
	{
		return measurementTechnique;
	}

	public void setMeasurementTechnique(String measurementTechnique)
	{
		this.measurementTechnique = measurementTechnique;
	}
}