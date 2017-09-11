package org.schema.api.model.thing.intangible.itemList;

import org.schema.api.model.thing.intangible.itemList.ItemList;

public class BreadcrumbList extends ItemList
{
	private String itemListElement;//Notes - Allowed types- [ListItem, Text, Thing]
	private String itemListOrder;//Notes - Allowed types- [ItemListOrderType, Text]
	private Integer numberOfItems;

	public String getItemListElement()
	{
		return itemListElement;
	}

	public void setItemListElement(String itemListElement)
	{
		this.itemListElement = itemListElement;
	}

	public String getItemListOrder()
	{
		return itemListOrder;
	}

	public void setItemListOrder(String itemListOrder)
	{
		this.itemListOrder = itemListOrder;
	}

	public Integer getNumberOfItems()
	{
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems)
	{
		this.numberOfItems = numberOfItems;
	}
}