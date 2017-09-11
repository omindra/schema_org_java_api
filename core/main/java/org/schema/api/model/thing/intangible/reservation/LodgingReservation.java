package org.schema.api.model.thing.intangible.reservation;

import org.schema.api.model.thing.intangible.reservation.Reservation;
import java.util.Date;
import java.util.Date;

public class LodgingReservation extends Reservation
{
	private Date checkinTime;
	private Date checkoutTime;
	private String lodgingUnitDescription;
	private String lodgingUnitType;//Notes - Allowed types- [QualitativeValue, Text]
	private Integer numAdults;//Notes - Allowed types- [Integer, QuantitativeValue]
	private Integer numChildren;//Notes - Allowed types- [Integer, QuantitativeValue]

	public Date getCheckinTime()
	{
		return checkinTime;
	}

	public void setCheckinTime(Date checkinTime)
	{
		this.checkinTime = checkinTime;
	}

	public Date getCheckoutTime()
	{
		return checkoutTime;
	}

	public void setCheckoutTime(Date checkoutTime)
	{
		this.checkoutTime = checkoutTime;
	}

	public String getLodgingUnitDescription()
	{
		return lodgingUnitDescription;
	}

	public void setLodgingUnitDescription(String lodgingUnitDescription)
	{
		this.lodgingUnitDescription = lodgingUnitDescription;
	}

	public String getLodgingUnitType()
	{
		return lodgingUnitType;
	}

	public void setLodgingUnitType(String lodgingUnitType)
	{
		this.lodgingUnitType = lodgingUnitType;
	}

	public Integer getNumAdults()
	{
		return numAdults;
	}

	public void setNumAdults(Integer numAdults)
	{
		this.numAdults = numAdults;
	}

	public Integer getNumChildren()
	{
		return numChildren;
	}

	public void setNumChildren(Integer numChildren)
	{
		this.numChildren = numChildren;
	}
}