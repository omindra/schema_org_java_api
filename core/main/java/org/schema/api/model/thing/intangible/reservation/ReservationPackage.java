package org.schema.api.model.thing.intangible.reservation;

import org.schema.api.model.thing.intangible.reservation.Reservation;
import org.schema.api.model.thing.intangible.reservation.Reservation;

public class ReservationPackage extends Reservation
{
	private Reservation subReservation;

	public Reservation getSubReservation()
	{
		return subReservation;
	}

	public void setSubReservation(Reservation subReservation)
	{
		this.subReservation = subReservation;
	}
}