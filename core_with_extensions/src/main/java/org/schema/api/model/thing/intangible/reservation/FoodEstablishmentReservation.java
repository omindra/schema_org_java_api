package org.schema.api.model.thing.intangible.reservation;

import java.util.Date;

public class FoodEstablishmentReservation extends Reservation
{
	private Date endTime;
	private Integer partySize;//Notes - Allowed types- [Integer, QuantitativeValue]
	private Date startTime;

	public Date getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}

	public Integer getPartySize()
	{
		return partySize;
	}

	public void setPartySize(Integer partySize)
	{
		this.partySize = partySize;
	}

	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}
}