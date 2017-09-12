package org.schema.api.model.thing.intangible.structuredValue.geoShape;

import org.schema.api.model.thing.intangible.structuredValue.GeoCoordinates;

public class GeoCircle extends GeoShape
{
	private GeoCoordinates geoMidpoint;
	private Number geoRadius;//Notes - Allowed types- [Distance, Number, Text]

	public GeoCoordinates getGeoMidpoint()
	{
		return geoMidpoint;
	}

	public void setGeoMidpoint(GeoCoordinates geoMidpoint)
	{
		this.geoMidpoint = geoMidpoint;
	}

	public Number getGeoRadius()
	{
		return geoRadius;
	}

	public void setGeoRadius(Number geoRadius)
	{
		this.geoRadius = geoRadius;
	}
}