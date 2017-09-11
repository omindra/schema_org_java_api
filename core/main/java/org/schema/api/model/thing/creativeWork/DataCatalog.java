package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.dataset.Dataset;

public class DataCatalog extends CreativeWork
{
	private Dataset dataset;//Notes - Allowed types- [Dataset, includedInDataCatalog]
	private String measurementTechnique;//Notes - Allowed types- [Text, URL, Dataset, DataDownload, DataCatalog]

	public Dataset getDataset()
	{
		return dataset;
	}

	public void setDataset(Dataset dataset)
	{
		this.dataset = dataset;
	}

	public String getMeasurementTechnique()
	{
		return measurementTechnique;
	}

	public void setMeasurementTechnique(String measurementTechnique)
	{
		this.measurementTechnique = measurementTechnique;
	}
}