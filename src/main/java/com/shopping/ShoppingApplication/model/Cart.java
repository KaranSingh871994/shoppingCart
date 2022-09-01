package com.shopping.ShoppingApplication.model;

import java.util.List;

import lombok.Data;

@Data
public class Cart 
{
	private Long cartId;
	private List<Item>items;
	
	public Long getCartId()
	{
		return this.cartId;
	}
	public void setCartId(Long cartId)
	{
		this.cartId=cartId;
	}

	public List<Item> getItems()
	{
		return this.items;
	}
	public void setItems(List<Item>items)
	{
		this.items=items;
	}
	
}
