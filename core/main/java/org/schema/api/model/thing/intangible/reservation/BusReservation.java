package org.schema.api.model.thing.intangible.reservation;

import org.schema.api.model.thing.intangible.reservation.Reservation;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;
import org.schema.api.model.thing.intangible.ProgramMembership;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.Thing;
import org.schema.api.model.thing.intangible.enumeration.ReservationStatusType;
import org.schema.api.model.thing.intangible.Ticket;
import org.schema.api.model.thing.organization.Organization;

public class BusReservation extends Reservation
{
	private Date bookingTime;
	private Organization broker;//Notes - Allowed types- [Organization, Person, bookingAgent]
	private Date modifiedTime;
	private String priceCurrency;//Notes - Allowed types- [Text, PriceSpecification]
	private ProgramMembership programMembershipUsed;
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private Thing reservationFor;
	private String reservationId;
	private ReservationStatusType reservationStatus;
	private Ticket reservedTicket;
	private Number totalPrice;//Notes - Allowed types- [Number, PriceSpecification, Text]
	private Organization underName;//Notes - Allowed types- [Organization, Person]

	public Date getBookingTime()
	{
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime)
	{
		this.bookingTime = bookingTime;
	}

	public Organization getBroker()
	{
		return broker;
	}

	public void setBroker(Organization broker)
	{
		this.broker = broker;
	}

	public Date getModifiedTime()
	{
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime)
	{
		this.modifiedTime = modifiedTime;
	}

	public String getPriceCurrency()
	{
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency)
	{
		this.priceCurrency = priceCurrency;
	}

	public ProgramMembership getProgramMembershipUsed()
	{
		return programMembershipUsed;
	}

	public void setProgramMembershipUsed(ProgramMembership programMembershipUsed)
	{
		this.programMembershipUsed = programMembershipUsed;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public Thing getReservationFor()
	{
		return reservationFor;
	}

	public void setReservationFor(Thing reservationFor)
	{
		this.reservationFor = reservationFor;
	}

	public String getReservationId()
	{
		return reservationId;
	}

	public void setReservationId(String reservationId)
	{
		this.reservationId = reservationId;
	}

	public ReservationStatusType getReservationStatus()
	{
		return reservationStatus;
	}

	public void setReservationStatus(ReservationStatusType reservationStatus)
	{
		this.reservationStatus = reservationStatus;
	}

	public Ticket getReservedTicket()
	{
		return reservedTicket;
	}

	public void setReservedTicket(Ticket reservedTicket)
	{
		this.reservedTicket = reservedTicket;
	}

	public Number getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(Number totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public Organization getUnderName()
	{
		return underName;
	}

	public void setUnderName(Organization underName)
	{
		this.underName = underName;
	}
}