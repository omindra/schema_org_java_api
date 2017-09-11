package org.schema.api.model.thing.intangible.structuredValue;

import org.schema.api.model.thing.intangible.structuredValue.StructuredValue;
import org.schema.api.model.thing.intangible.structuredValue.PropertyValue;
import org.schema.api.model.thing.intangible.enumeration.Enumeration;

public class QuantitativeValue extends StructuredValue
{
	private PropertyValue additionalProperty;
	private Number maxValue;
	private Number minValue;
	private String unitCode;//Notes - Allowed types- [Text, URL]
	private String unitText;
	private Boolean value;//Notes - Allowed types- [Boolean, Number, StructuredValue, Text]
	private Enumeration valueReference;//Notes - Allowed types- [Enumeration, PropertyValue, QualitativeValue, QuantitativeValue, StructuredValue]

	public PropertyValue getAdditionalProperty()
	{
		return additionalProperty;
	}

	public void setAdditionalProperty(PropertyValue additionalProperty)
	{
		this.additionalProperty = additionalProperty;
	}

	public Number getMaxValue()
	{
		return maxValue;
	}

	public void setMaxValue(Number maxValue)
	{
		this.maxValue = maxValue;
	}

	public Number getMinValue()
	{
		return minValue;
	}

	public void setMinValue(Number minValue)
	{
		this.minValue = minValue;
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