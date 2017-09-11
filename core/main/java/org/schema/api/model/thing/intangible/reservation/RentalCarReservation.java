package org.schema.api.model.thing.intangible.reservation;

import org.schema.api.model.thing.intangible.reservation.Reservation;
import org.schema.api.model.thing.place.Place;
import java.util.Date;
import org.schema.api.model.thing.place.Place;
import java.util.Date;

public class RentalCarReservation extends Reservation
{
	private Place dropoffLocation;
	private Date dropoffTime;
	private Place pickupLocation;
	private Date pickupTime;

	public Place getDropoffLocation()
	{
		return dropoffLocation;
	}

	public void setDropoffLocation(Place dropoffLocation)
	{
		this.dropoffLocation = dropoffLocation;
	}

	public Date getDropoffTime()
	{
		return dropoffTime;
	}

	public void setDropoffTime(Date dropoffTime)
	{
		this.dropoffTime = dropoffTime;
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