package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.place.civicStructure.BusStation;
import java.util.Date;
import org.schema.api.model.thing.place.civicStructure.BusStation;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;

public class BusTrip extends Intangible
{
	private BusStation arrivalBusStop;//Notes - Allowed types- [BusStation, BusStop]
	private Date arrivalTime;
	private String busName;
	private String busNumber;
	private BusStation departureBusStop;//Notes - Allowed types- [BusStation, BusStop]
	private Date departureTime;
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]

	public BusStation getArrivalBusStop()
	{
		return arrivalBusStop;
	}

	public void setArrivalBusStop(BusStation arrivalBusStop)
	{
		this.arrivalBusStop = arrivalBusStop;
	}

	public Date getArrivalTime()
	{
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	public String getBusName()
	{
		return busName;
	}

	public void setBusName(String busName)
	{
		this.busName = busName;
	}

	public String getBusNumber()
	{
		return busNumber;
	}

	public void setBusNumber(String busNumber)
	{
		this.busNumber = busNumber;
	}

	public BusStation getDepartureBusStop()
	{
		return departureBusStop;
	}

	public void setDepartureBusStop(BusStation departureBusStop)
	{
		this.departureBusStop = departureBusStop;
	}

	public Date getDepartureTime()
	{
		return departureTime;
	}

	public void setDepartureTime(Date departureTime)
	{
		this.departureTime = departureTime;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}
}