package org.schema.api.model.thing.creativeWork.dataset;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.creativeWork.mediaObject.DataDownload;
import org.schema.api.model.thing.creativeWork.DataCatalog;

public class Dataset extends CreativeWork
{
	private DataDownload distribution;
	private DataCatalog includedInDataCatalog;//Notes - Allowed types- [DataCatalog, dataset]
	private String issn;
	private String measurementTechnique;//Notes - Allowed types- [Text, URL, Dataset, DataDownload, DataCatalog]
	private String variableMeasured;//Notes - Allowed types- [PropertyValue, Text]

	public DataDownload getDistribution()
	{
		return distribution;
	}

	public void setDistribution(DataDownload distribution)
	{
		this.distribution = distribution;
	}

	public DataCatalog getIncludedInDataCatalog()
	{
		return includedInDataCatalog;
	}

	public void setIncludedInDataCatalog(DataCatalog includedInDataCatalog)
	{
		this.includedInDataCatalog = includedInDataCatalog;
	}

	public String getIssn()
	{
		return issn;
	}

	public void setIssn(String issn)
	{
		this.issn = issn;
	}

	public String getMeasurementTechnique()
	{
		return measurementTechnique;
	}

	public void setMeasurementTechnique(String measurementTechnique)
	{
		this.measurementTechnique = measurementTechnique;
	}

	public String getVariableMeasured()
	{
		return variableMeasured;
	}

	public void setVariableMeasured(String variableMeasured)
	{
		this.variableMeasured = variableMeasured;
	}
}