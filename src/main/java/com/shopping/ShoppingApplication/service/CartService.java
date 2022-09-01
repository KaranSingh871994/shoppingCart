package com.shopping.ShoppingApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingApplication.model.Cart;
import com.shopping.ShoppingApplication.model.Item;

@Service
public class CartService 
{
	
	@Autowired
	private Cart cart;	
	
	
	public Cart addItemInCart(Item item)
	{
		cart.getItems().add(item);
		return  cart;
	}
	public  Cart getCart()
	{
		return cart;
	}
	
	public Cart removeItem(Long itemId)
	{
		
		for(Item item:cart.getItems())
		{
			if(item.getItemId()==itemId)
			{
				cart.getItems().remove(item);
				break;
			}
		}
		return  cart;
	}

}
