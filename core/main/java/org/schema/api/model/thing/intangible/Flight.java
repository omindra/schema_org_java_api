package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.place.civicStructure.Airport;
import java.util.Date;
import org.schema.api.model.thing.intangible.enumeration.BoardingPolicyType;
import org.schema.api.model.thing.place.civicStructure.Airport;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;
import org.schema.api.model.thing.organization.Organization;
import java.util.Date;

public class Flight extends Intangible
{
	private String aircraft;//Notes - Allowed types- [Text, Vehicle]
	private Airport arrivalAirport;
	private String arrivalGate;
	private String arrivalTerminal;
	private Date arrivalTime;
	private BoardingPolicyType boardingPolicy;
	private Airport departureAirport;
	private String departureGate;
	private String departureTerminal;
	private Date departureTime;
	private String estimatedFlightDuration;//Notes - Allowed types- [Duration, Text]
	private String flightDistance;//Notes - Allowed types- [Distance, Text]
	private String flightNumber;
	private String mealService;
	private Organization provider;//Notes - Allowed types- [Organization, Person, carrier]
	private Organization seller;//Notes - Allowed types- [Organization, Person]
	private Date webCheckinTime;

	public String getAircraft()
	{
		return aircraft;
	}

	public void setAircraft(String aircraft)
	{
		this.aircraft = aircraft;
	}

	public Airport getArrivalAirport()
	{
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport)
	{
		this.arrivalAirport = arrivalAirport;
	}

	public String getArrivalGate()
	{
		return arrivalGate;
	}

	public void setArrivalGate(String arrivalGate)
	{
		this.arrivalGate = arrivalGate;
	}

	public String getArrivalTerminal()
	{
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal)
	{
		this.arrivalTerminal = arrivalTerminal;
	}

	public Date getArrivalTime()
	{
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	public BoardingPolicyType getBoardingPolicy()
	{
		return boardingPolicy;
	}

	public void setBoardingPolicy(BoardingPolicyType boardingPolicy)
	{
		this.boardingPolicy = boardingPolicy;
	}

	public Airport getDepartureAirport()
	{
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport)
	{
		this.departureAirport = departureAirport;
	}

	public String getDepartureGate()
	{
		return departureGate;
	}

	public void setDepartureGate(String departureGate)
	{
		this.departureGate = departureGate;
	}

	public String getDepartureTerminal()
	{
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal)
	{
		this.departureTerminal = departureTerminal;
	}

	public Date getDepartureTime()
	{
		return departureTime;
	}

	public void setDepartureTime(Date departureTime)
	{
		this.departureTime = departureTime;
	}

	public String getEstimatedFlightDuration()
	{
		return estimatedFlightDuration;
	}

	public void setEstimatedFlightDuration(String estimatedFlightDuration)
	{
		this.estimatedFlightDuration = estimatedFlightDuration;
	}

	public String getFlightDistance()
	{
		return flightDistance;
	}

	public void setFlightDistance(String flightDistance)
	{
		this.flightDistance = flightDistance;
	}

	public String getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public String getMealService()
	{
		return mealService;
	}

	public void setMealService(String mealService)
	{
		this.mealService = mealService;
	}

	public Organization getProvider()
	{
		return provider;
	}

	public void setProvider(Organization provider)
	{
		this.provider = provider;
	}

	public Organization getSeller()
	{
		return seller;
	}

	public void setSeller(Organization seller)
	{
		this.seller = seller;
	}

	public Date getWebCheckinTime()
	{
		return webCheckinTime;
	}

	public void setWebCheckinTime(Date webCheckinTime)
	{
		this.webCheckinTime = webCheckinTime;
	}
}