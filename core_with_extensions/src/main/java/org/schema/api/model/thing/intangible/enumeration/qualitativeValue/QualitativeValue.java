package org.schema.api.model.thing.intangible.enumeration.qualitativeValue;

import org.schema.api.model.thing.intangible.enumeration.Enumeration;
import org.schema.api.model.thing.intangible.structuredValue.propertyValue.PropertyValue;

public class QualitativeValue extends Enumeration
{
	private PropertyValue additionalProperty;
	private QualitativeValue equal;
	private QualitativeValue greater;
	private QualitativeValue greaterOrEqual;
	private QualitativeValue lesser;
	private QualitativeValue lesserOrEqual;
	private QualitativeValue nonEqual;
	private Enumeration valueReference;//Notes - Allowed types- [Enumeration, PropertyValue, QualitativeValue, QuantitativeValue, StructuredValue]

	public PropertyValue getAdditionalProperty()
	{
		return additionalProperty;
	}

	public void setAdditionalProperty(PropertyValue additionalProperty)
	{
		this.additionalProperty = additionalProperty;
	}

	public QualitativeValue getEqual()
	{
		return equal;
	}

	public void setEqual(QualitativeValue equal)
	{
		this.equal = equal;
	}

	public QualitativeValue getGreater()
	{
		return greater;
	}

	public void setGreater(QualitativeValue greater)
	{
		this.greater = greater;
	}

	public QualitativeValue getGreaterOrEqual()
	{
		return greaterOrEqual;
	}

	public void setGreaterOrEqual(QualitativeValue greaterOrEqual)
	{
		this.greaterOrEqual = greaterOrEqual;
	}

	public QualitativeValue getLesser()
	{
		return lesser;
	}

	public void setLesser(QualitativeValue lesser)
	{
		this.lesser = lesser;
	}

	public QualitativeValue getLesserOrEqual()
	{
		return lesserOrEqual;
	}

	public void setLesserOrEqual(QualitativeValue lesserOrEqual)
	{
		this.lesserOrEqual = lesserOrEqual;
	}

	public QualitativeValue getNonEqual()
	{
		return nonEqual;
	}

	public void setNonEqual(QualitativeValue nonEqual)
	{
		this.nonEqual = nonEqual;
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