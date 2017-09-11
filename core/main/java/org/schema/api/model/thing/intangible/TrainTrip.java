package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.intangible.Intangible;
import org.schema.api.model.thing.place.civicStructure.TrainStation;
import java.util.Date;
import org.schema.api.model.thing.place.civicStructure.TrainStation;
import java.util.Date;
import org.schema.api.model.thing.organization.Organization;

public class TrainTrip extends Intangible
{
	private String arrivalPlatform;
	private TrainStation arrivalStation;
	private Date arrivalTime;
	private String departurePlatform;
	private TrainStation departureStation;
	private Date departureTime;
	private Organization provider;//Notes - Allowed types- [Organization, Person]
	private String trainName;
	private String trainNumber;

	public String getArrivalPlatform()
	{
		return arrivalPlatform;
	}

	public void setArrivalPlatform(String arrivalPlatform)
	{
		this.arrivalPlatform = arrivalPlatform;
	}

	public TrainStation getArrivalStation()
	{
		return arrivalStation;
	}

	public void setArrivalStation(TrainStation arrivalStation)
	{
		this.arrivalStation = arrivalStation;
	}

	public Date getArrivalTime()
	{
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	public String getDeparturePlatform()
	{
		return departurePlatform;
	}

	public void setDeparturePlatform(String departurePlatform)
	{
		this.departurePlatform = departurePlatform;
	}

	public TrainStation getDepartureStation()
	{
		return departureStation;
	}

	public void setDepartureStation(TrainStation departureStation)
	{
		this.departureStation = departureStation;
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

	public String getTrainName()
	{
		return trainName;
	}

	public void setTrainName(String trainName)
	{
		this.trainName = trainName;
	}

	public String getTrainNumber()
	{
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber)
	{
		this.trainNumber = trainNumber;
	}
}