package org.schema.api.model.thing.organization;

import org.schema.api.model.thing.intangible.enumeration.BoardingPolicyType;

public class Airline extends Organization
{
	private BoardingPolicyType boardingPolicy;
	private String iataCode;

	public BoardingPolicyType getBoardingPolicy()
	{
		return boardingPolicy;
	}

	public void setBoardingPolicy(BoardingPolicyType boardingPolicy)
	{
		this.boardingPolicy = boardingPolicy;
	}

	public String getIataCode()
	{
		return iataCode;
	}

	public void setIataCode(String iataCode)
	{
		this.iataCode = iataCode;
	}
}