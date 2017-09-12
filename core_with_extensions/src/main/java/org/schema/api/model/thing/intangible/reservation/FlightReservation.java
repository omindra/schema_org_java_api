package org.schema.api.model.thing.intangible.reservation;

public class FlightReservation extends Reservation
{
	private String boardingGroup;
	private String passengerPriorityStatus;//Notes - Allowed types- [QualitativeValue, Text]
	private String passengerSequenceNumber;
	private String securityScreening;

	public String getBoardingGroup()
	{
		return boardingGroup;
	}

	public void setBoardingGroup(String boardingGroup)
	{
		this.boardingGroup = boardingGroup;
	}

	public String getPassengerPriorityStatus()
	{
		return passengerPriorityStatus;
	}

	public void setPassengerPriorityStatus(String passengerPriorityStatus)
	{
		this.passengerPriorityStatus = passengerPriorityStatus;
	}

	public String getPassengerSequenceNumber()
	{
		return passengerSequenceNumber;
	}

	public void setPassengerSequenceNumber(String passengerSequenceNumber)
	{
		this.passengerSequenceNumber = passengerSequenceNumber;
	}

	public String getSecurityScreening()
	{
		return securityScreening;
	}

	public void setSecurityScreening(String securityScreening)
	{
		this.securityScreening = securityScreening;
	}
}