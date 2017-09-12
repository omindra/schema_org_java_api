package org.schema.api.model.thing.organization;

public class Corporation extends Organization
{
	private String tickerSymbol;

	public String getTickerSymbol()
	{
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol)
	{
		this.tickerSymbol = tickerSymbol;
	}
}