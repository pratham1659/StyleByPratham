package com.stylebypratham.service;

import com.stylebypratham.exception.CartItemException;
import com.stylebypratham.exception.UserException;
import com.stylebypratham.modal.Cart;
import com.stylebypratham.modal.CartItem;
import com.stylebypratham.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
