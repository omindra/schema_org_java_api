package org.schema.api.model.thing.intangible.reservation;

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