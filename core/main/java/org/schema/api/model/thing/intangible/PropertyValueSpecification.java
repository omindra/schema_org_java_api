package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;

public class PropertyValueSpecification extends Intangible
{
	private String defaultValue;//Notes - Allowed types- [Text, Thing]
	private Number maxValue;
	private Number minValue;
	private Boolean multipleValues;
	private Boolean readonlyValue;
	private Number stepValue;
	private Number valueMaxLength;
	private Number valueMinLength;
	private String valueName;
	private String valuePattern;
	private Boolean valueRequired;

	public String getDefaultValue()
	{
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue)
	{
		this.defaultValue = defaultValue;
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

	public Boolean getMultipleValues()
	{
		return multipleValues;
	}

	public void setMultipleValues(Boolean multipleValues)
	{
		this.multipleValues = multipleValues;
	}

	public Boolean getReadonlyValue()
	{
		return readonlyValue;
	}

	public void setReadonlyValue(Boolean readonlyValue)
	{
		this.readonlyValue = readonlyValue;
	}

	public Number getStepValue()
	{
		return stepValue;
	}

	public void setStepValue(Number stepValue)
	{
		this.stepValue = stepValue;
	}

	public Number getValueMaxLength()
	{
		return valueMaxLength;
	}

	public void setValueMaxLength(Number valueMaxLength)
	{
		this.valueMaxLength = valueMaxLength;
	}

	public Number getValueMinLength()
	{
		return valueMinLength;
	}

	public void setValueMinLength(Number valueMinLength)
	{
		this.valueMinLength = valueMinLength;
	}

	public String getValueName()
	{
		return valueName;
	}

	public void setValueName(String valueName)
	{
		this.valueName = valueName;
	}

	public String getValuePattern()
	{
		return valuePattern;
	}

	public void setValuePattern(String valuePattern)
	{
		this.valuePattern = valuePattern;
	}

	public Boolean getValueRequired()
	{
		return valueRequired;
	}

	public void setValueRequired(Boolean valueRequired)
	{
		this.valueRequired = valueRequired;
	}
}