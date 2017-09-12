package org.schema.api.model.thing.intangible;

import org.schema.api.model.thing.organization.Organization;

import java.util.Date;

public class Ticket extends Intangible
{
	private Date dateIssued;
	private Organization issuedBy;
	private String priceCurrency;//Notes - Allowed types- [Text, PriceSpecification]
	private String ticketNumber;
	private String ticketToken;//Notes - Allowed types- [Text, URL]
	private Seat ticketedSeat;
	private Number totalPrice;//Notes - Allowed types- [Number, PriceSpecification, Text]
	private Organization underName;//Notes - Allowed types- [Organization, Person]

	public Date getDateIssued()
	{
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued)
	{
		this.dateIssued = dateIssued;
	}

	public Organization getIssuedBy()
	{
		return issuedBy;
	}

	public void setIssuedBy(Organization issuedBy)
	{
		this.issuedBy = issuedBy;
	}

	public String getPriceCurrency()
	{
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency)
	{
		this.priceCurrency = priceCurrency;
	}

	public String getTicketNumber()
	{
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber)
	{
		this.ticketNumber = ticketNumber;
	}

	public String getTicketToken()
	{
		return ticketToken;
	}

	public void setTicketToken(String ticketToken)
	{
		this.ticketToken = ticketToken;
	}

	public Seat getTicketedSeat()
	{
		return ticketedSeat;
	}

	public void setTicketedSeat(Seat ticketedSeat)
	{
		this.ticketedSeat = ticketedSeat;
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