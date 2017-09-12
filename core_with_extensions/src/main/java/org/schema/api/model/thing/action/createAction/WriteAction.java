package org.schema.api.model.thing.action.createAction;

public class WriteAction extends CreateAction
{
	private String inLanguage;//Notes - Allowed types- [Language, Text]

	public String getInLanguage()
	{
		return inLanguage;
	}

	public void setInLanguage(String inLanguage)
	{
		this.inLanguage = inLanguage;
	}
}