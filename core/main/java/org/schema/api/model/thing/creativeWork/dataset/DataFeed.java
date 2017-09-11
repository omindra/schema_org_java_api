package org.schema.api.model.thing.creativeWork.dataset;

import org.schema.api.model.thing.creativeWork.dataset.Dataset;

public class DataFeed extends Dataset
{
	private String dataFeedElement;//Notes - Allowed types- [DataFeedItem, Text, Thing]

	public String getDataFeedElement()
	{
		return dataFeedElement;
	}

	public void setDataFeedElement(String dataFeedElement)
	{
		this.dataFeedElement = dataFeedElement;
	}
}