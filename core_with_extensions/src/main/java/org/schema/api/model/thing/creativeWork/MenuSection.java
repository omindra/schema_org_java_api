package org.schema.api.model.thing.creativeWork;

import org.schema.api.model.thing.intangible.MenuItem;

public class MenuSection extends CreativeWork
{
	private MenuItem hasMenuItem;
	private MenuSection hasMenuSection;

	public MenuItem getHasMenuItem()
	{
		return hasMenuItem;
	}

	public void setHasMenuItem(MenuItem hasMenuItem)
	{
		this.hasMenuItem = hasMenuItem;
	}

	public MenuSection getHasMenuSection()
	{
		return hasMenuSection;
	}

	public void setHasMenuSection(MenuSection hasMenuSection)
	{
		this.hasMenuSection = hasMenuSection;
	}
}