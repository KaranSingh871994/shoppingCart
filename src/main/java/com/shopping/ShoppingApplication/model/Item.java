package com.shopping.ShoppingApplication.model;

import java.util.List;

import lombok.Data;

@Data
public class Item 
{
	private Long itemId;
	private String itemName;
	public Long getItemId()
	{
		return this.itemId;
	}
	public void setItemId(Long itemId)
	{
		this.itemId=itemId;
	}

	public String getItemName()
	{
		return this.itemName;
	}
	public void setitemName(String itemName)
	{
		this.itemName=itemName;
	}
		
}
