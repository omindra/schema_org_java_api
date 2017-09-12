package org.schema.api.model.thing.intangible;

public class Seat extends Intangible
{
	private String seatNumber;
	private String seatRow;
	private String seatSection;
	private String seatingType;//Notes - Allowed types- [QualitativeValue, Text]

	public String getSeatNumber()
	{
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;
	}

	public String getSeatRow()
	{
		return seatRow;
	}

	public void setSeatRow(String seatRow)
	{
		this.seatRow = seatRow;
	}

	public String getSeatSection()
	{
		return seatSection;
	}

	public void setSeatSection(String seatSection)
	{
		this.seatSection = seatSection;
	}

	public String getSeatingType()
	{
		return seatingType;
	}

	public void setSeatingType(String seatingType)
	{
		this.seatingType = seatingType;
	}
}