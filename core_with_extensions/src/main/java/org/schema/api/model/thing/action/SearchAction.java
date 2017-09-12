package org.schema.api.model.thing.action;

public class SearchAction extends Action
{
	private String query;

	public String getQuery()
	{
		return query;
	}

	public void setQuery(String query)
	{
		this.query = query;
	}
}