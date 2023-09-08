package com.stylebypratham.service;

import com.stylebypratham.exception.ProductException;
import com.stylebypratham.modal.Cart;
import com.stylebypratham.modal.User;
import com.stylebypratham.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
