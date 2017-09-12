package org.schema.api.model.thing.intangible.structuredValue.propertyValue;

import org.schema.api.model.thing.intangible.enumeration.Enumeration;
import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;

public class PropertyValue extends StructuredValue
{
	private Number maxValue;
	private String measurementTechnique;//Notes - Allowed types- [Text, URL, Dataset, DataDownload, DataCatalog]
	private Number minValue;
	private String propertyID;//Notes - Allowed types- [Text, URL]
	private String unitCode;//Notes - Allowed types- [Text, URL]
	private String unitText;
	private Boolean value;//Notes - Allowed types- [Boolean, Number, StructuredValue, Text]
	private Enumeration valueReference;//Notes - Allowed types- [Enumeration, PropertyValue, QualitativeValue, QuantitativeValue, StructuredValue]

	public Number getMaxValue()
	{
		return maxValue;
	}

	public void setMaxValue(Number maxValue)
	{
		this.maxValue = maxValue;
	}

	public String getMeasurementTechnique()
	{
		return measurementTechnique;
	}

	public void setMeasurementTechnique(String measurementTechnique)
	{
		this.measurementTechnique = measurementTechnique;
	}

	public Number getMinValue()
	{
		return minValue;
	}

	public void setMinValue(Number minValue)
	{
		this.minValue = minValue;
	}

	public String getPropertyID()
	{
		return propertyID;
	}

	public void setPropertyID(String propertyID)
	{
		this.propertyID = propertyID;
	}

	public String getUnitCode()
	{
		return unitCode;
	}

	public void setUnitCode(String unitCode)
	{
		this.unitCode = unitCode;
	}

	public String getUnitText()
	{
		return unitText;
	}

	public void setUnitText(String unitText)
	{
		this.unitText = unitText;
	}

	public Boolean getValue()
	{
		return value;
	}

	public void setValue(Boolean value)
	{
		this.value = value;
	}

	public Enumeration getValueReference()
	{
		return valueReference;
	}

	public void setValueReference(Enumeration valueReference)
	{
		this.valueReference = valueReference;
	}
}