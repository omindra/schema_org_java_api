package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.enumeration.MapCategoryType;

public class Map extends CreativeWork
{
	private MapCategoryType mapType;

	public MapCategoryType getMapType()
	{
		return mapType;
	}

	public void setMapType(MapCategoryType mapType)
	{
		this.mapType = mapType;
	}
}