package com.shopping.ShoppingApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.ShoppingApplication.model.Cart;
import com.shopping.ShoppingApplication.model.Item;
import com.shopping.ShoppingApplication.service.CartService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/cart")
public class RestController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/addItem")
	public ResponseEntity<String>addItem(@RequestBody Item item)
	{
		ResponseEntity<String>response=null;
		Cart cart=cartService.addItemInCart(item);
		if(cart==null)
		{
			response=new ResponseEntity<String>("Failed..try again",HttpStatus.BAD_REQUEST);
		}
		else
		{
			response=new ResponseEntity<String>("Successfully Added",HttpStatus.OK);
		}
		return response;
		
	}
	@GetMapping("/removeItem/itemId")
	public ResponseEntity<String>removeItem(@PathVariable("itemId") Long itemId)
	{
		ResponseEntity<String>response=null;
		Cart cart=cartService.removeItem(itemId);
		if(cart==null)
		{
			response=new ResponseEntity<String>("Failed..try again",HttpStatus.BAD_REQUEST);
		}
		else
		{
			response=new ResponseEntity<String>("Successfully Removed",HttpStatus.OK);
		}
		return response;
		
	}
	@GetMapping("/getCart")
	public ResponseEntity<Cart>getCart()
	{
		ResponseEntity<Cart>response=null;
		Cart cart=cartService.getCart();		
		response=new ResponseEntity<Cart>(cart,HttpStatus.OK);
		
		return response;
	}

}
