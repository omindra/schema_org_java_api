package org.schema.api.model.thing.product.vehicle;

import org.schema.api.model.thing.product.vehicle.Vehicle;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import java.util.Date;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import java.util.Date;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import java.util.Date;
import java.util.Date;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.enumeration.qualitativeValue.SteeringPositionValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.EngineSpecification;
import java.util.Date;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;
import org.schema.api.model.thing.intangible.structuredValue.QuantitativeValue;

public class MotorizedBicycle extends Vehicle
{
	private QuantitativeValue accelerationTime;
	private String bodyType;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private QuantitativeValue cargoVolume;
	private Date dateVehicleFirstRegistered;
	private String driveWheelConfiguration;//Notes - Allowed types- [DriveWheelConfigurationValue, Text]
	private Number emissionsCO2;
	private QuantitativeValue fuelCapacity;
	private QuantitativeValue fuelConsumption;
	private QuantitativeValue fuelEfficiency;
	private String fuelType;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private String knownVehicleDamages;
	private String meetsEmissionStandard;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private QuantitativeValue mileageFromOdometer;
	private Date modelDate;
	private Number numberOfAirbags;//Notes - Allowed types- [Number, Text]
	private Number numberOfAxles;//Notes - Allowed types- [Number, QuantitativeValue]
	private Number numberOfDoors;//Notes - Allowed types- [Number, QuantitativeValue]
	private Number numberOfForwardGears;//Notes - Allowed types- [Number, QuantitativeValue]
	private Number numberOfPreviousOwners;//Notes - Allowed types- [Number, QuantitativeValue]
	private QuantitativeValue payload;
	private Date productionDate;
	private Date purchaseDate;
	private Number seatingCapacity;//Notes - Allowed types- [Number, QuantitativeValue]
	private QuantitativeValue speed;
	private SteeringPositionValue steeringPosition;
	private QuantitativeValue tongueWeight;
	private QuantitativeValue trailerWeight;
	private String vehicleConfiguration;
	private EngineSpecification vehicleEngine;
	private String vehicleIdentificationNumber;
	private String vehicleInteriorColor;
	private String vehicleInteriorType;
	private Date vehicleModelDate;
	private Number vehicleSeatingCapacity;//Notes - Allowed types- [Number, QuantitativeValue]
	private String vehicleSpecialUsage;//Notes - Allowed types- [CarUsageType, Text]
	private String vehicleTransmission;//Notes - Allowed types- [QualitativeValue, Text, URL]
	private QuantitativeValue weightTotal;
	private QuantitativeValue wheelbase;

	public QuantitativeValue getAccelerationTime()
	{
		return accelerationTime;
	}

	public void setAccelerationTime(QuantitativeValue accelerationTime)
	{
		this.accelerationTime = accelerationTime;
	}

	public String getBodyType()
	{
		return bodyType;
	}

	public void setBodyType(String bodyType)
	{
		this.bodyType = bodyType;
	}

	public QuantitativeValue getCargoVolume()
	{
		return cargoVolume;
	}

	public void setCargoVolume(QuantitativeValue cargoVolume)
	{
		this.cargoVolume = cargoVolume;
	}

	public Date getDateVehicleFirstRegistered()
	{
		return dateVehicleFirstRegistered;
	}

	public void setDateVehicleFirstRegistered(Date dateVehicleFirstRegistered)
	{
		this.dateVehicleFirstRegistered = dateVehicleFirstRegistered;
	}

	public String getDriveWheelConfiguration()
	{
		return driveWheelConfiguration;
	}

	public void setDriveWheelConfiguration(String driveWheelConfiguration)
	{
		this.driveWheelConfiguration = driveWheelConfiguration;
	}

	public Number getEmissionsCO2()
	{
		return emissionsCO2;
	}

	public void setEmissionsCO2(Number emissionsCO2)
	{
		this.emissionsCO2 = emissionsCO2;
	}

	public QuantitativeValue getFuelCapacity()
	{
		return fuelCapacity;
	}

	public void setFuelCapacity(QuantitativeValue fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}

	public QuantitativeValue getFuelConsumption()
	{
		return fuelConsumption;
	}

	public void setFuelConsumption(QuantitativeValue fuelConsumption)
	{
		this.fuelConsumption = fuelConsumption;
	}

	public QuantitativeValue getFuelEfficiency()
	{
		return fuelEfficiency;
	}

	public void setFuelEfficiency(QuantitativeValue fuelEfficiency)
	{
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getFuelType()
	{
		return fuelType;
	}

	public void setFuelType(String fuelType)
	{
		this.fuelType = fuelType;
	}

	public String getKnownVehicleDamages()
	{
		return knownVehicleDamages;
	}

	public void setKnownVehicleDamages(String knownVehicleDamages)
	{
		this.knownVehicleDamages = knownVehicleDamages;
	}

	public String getMeetsEmissionStandard()
	{
		return meetsEmissionStandard;
	}

	public void setMeetsEmissionStandard(String meetsEmissionStandard)
	{
		this.meetsEmissionStandard = meetsEmissionStandard;
	}

	public QuantitativeValue getMileageFromOdometer()
	{
		return mileageFromOdometer;
	}

	public void setMileageFromOdometer(QuantitativeValue mileageFromOdometer)
	{
		this.mileageFromOdometer = mileageFromOdometer;
	}

	public Date getModelDate()
	{
		return modelDate;
	}

	public void setModelDate(Date modelDate)
	{
		this.modelDate = modelDate;
	}

	public Number getNumberOfAirbags()
	{
		return numberOfAirbags;
	}

	public void setNumberOfAirbags(Number numberOfAirbags)
	{
		this.numberOfAirbags = numberOfAirbags;
	}

	public Number getNumberOfAxles()
	{
		return numberOfAxles;
	}

	public void setNumberOfAxles(Number numberOfAxles)
	{
		this.numberOfAxles = numberOfAxles;
	}

	public Number getNumberOfDoors()
	{
		return numberOfDoors;
	}

	public void setNumberOfDoors(Number numberOfDoors)
	{
		this.numberOfDoors = numberOfDoors;
	}

	public Number getNumberOfForwardGears()
	{
		return numberOfForwardGears;
	}

	public void setNumberOfForwardGears(Number numberOfForwardGears)
	{
		this.numberOfForwardGears = numberOfForwardGears;
	}

	public Number getNumberOfPreviousOwners()
	{
		return numberOfPreviousOwners;
	}

	public void setNumberOfPreviousOwners(Number numberOfPreviousOwners)
	{
		this.numberOfPreviousOwners = numberOfPreviousOwners;
	}

	public QuantitativeValue getPayload()
	{
		return payload;
	}

	public void setPayload(QuantitativeValue payload)
	{
		this.payload = payload;
	}

	public Date getProductionDate()
	{
		return productionDate;
	}

	public void setProductionDate(Date productionDate)
	{
		this.productionDate = productionDate;
	}

	public Date getPurchaseDate()
	{
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate)
	{
		this.purchaseDate = purchaseDate;
	}

	public Number getSeatingCapacity()
	{
		return seatingCapacity;
	}

	public void setSeatingCapacity(Number seatingCapacity)
	{
		this.seatingCapacity = seatingCapacity;
	}

	public QuantitativeValue getSpeed()
	{
		return speed;
	}

	public void setSpeed(QuantitativeValue speed)
	{
		this.speed = speed;
	}

	public SteeringPositionValue getSteeringPosition()
	{
		return steeringPosition;
	}

	public void setSteeringPosition(SteeringPositionValue steeringPosition)
	{
		this.steeringPosition = steeringPosition;
	}

	public QuantitativeValue getTongueWeight()
	{
		return tongueWeight;
	}

	public void setTongueWeight(QuantitativeValue tongueWeight)
	{
		this.tongueWeight = tongueWeight;
	}

	public QuantitativeValue getTrailerWeight()
	{
		return trailerWeight;
	}

	public void setTrailerWeight(QuantitativeValue trailerWeight)
	{
		this.trailerWeight = trailerWeight;
	}

	public String getVehicleConfiguration()
	{
		return vehicleConfiguration;
	}

	public void setVehicleConfiguration(String vehicleConfiguration)
	{
		this.vehicleConfiguration = vehicleConfiguration;
	}

	public EngineSpecification getVehicleEngine()
	{
		return vehicleEngine;
	}

	public void setVehicleEngine(EngineSpecification vehicleEngine)
	{
		this.vehicleEngine = vehicleEngine;
	}

	public String getVehicleIdentificationNumber()
	{
		return vehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(String vehicleIdentificationNumber)
	{
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public String getVehicleInteriorColor()
	{
		return vehicleInteriorColor;
	}

	public void setVehicleInteriorColor(String vehicleInteriorColor)
	{
		this.vehicleInteriorColor = vehicleInteriorColor;
	}

	public String getVehicleInteriorType()
	{
		return vehicleInteriorType;
	}

	public void setVehicleInteriorType(String vehicleInteriorType)
	{
		this.vehicleInteriorType = vehicleInteriorType;
	}

	public Date getVehicleModelDate()
	{
		return vehicleModelDate;
	}

	public void setVehicleModelDate(Date vehicleModelDate)
	{
		this.vehicleModelDate = vehicleModelDate;
	}

	public Number getVehicleSeatingCapacity()
	{
		return vehicleSeatingCapacity;
	}

	public void setVehicleSeatingCapacity(Number vehicleSeatingCapacity)
	{
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}

	public String getVehicleSpecialUsage()
	{
		return vehicleSpecialUsage;
	}

	public void setVehicleSpecialUsage(String vehicleSpecialUsage)
	{
		this.vehicleSpecialUsage = vehicleSpecialUsage;
	}

	public String getVehicleTransmission()
	{
		return vehicleTransmission;
	}

	public void setVehicleTransmission(String vehicleTransmission)
	{
		this.vehicleTransmission = vehicleTransmission;
	}

	public QuantitativeValue getWeightTotal()
	{
		return weightTotal;
	}

	public void setWeightTotal(QuantitativeValue weightTotal)
	{
		this.weightTotal = weightTotal;
	}

	public QuantitativeValue getWheelbase()
	{
		return wheelbase;
	}

	public void setWheelbase(QuantitativeValue wheelbase)
	{
		this.wheelbase = wheelbase;
	}
}