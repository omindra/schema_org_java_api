package org.schema.api.model.thing.intangible.reservation;

import org.schema.api.model.thing.place.Place;

import java.util.Date;

public class TaxiReservation extends Reservation
{
	private Integer partySize;//Notes - Allowed types- [Integer, QuantitativeValue]
	private Place pickupLocation;
	private Date pickupTime;

	public Integer getPartySize()
	{
		return partySize;
	}

	public void setPartySize(Integer partySize)
	{
		this.partySize = partySize;
	}

	public Place getPickupLocation()
	{
		return pickupLocation;
	}

	public void setPickupLocation(Place pickupLocation)
	{
		this.pickupLocation = pickupLocation;
	}

	public Date getPickupTime()
	{
		return pickupTime;
	}

	public void setPickupTime(Date pickupTime)
	{
		this.pickupTime = pickupTime;
	}
}