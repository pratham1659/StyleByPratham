package com.stylebypratham.backendspring.service;


import com.stylebypratham.backendspring.exception.CartItemException;
import com.stylebypratham.backendspring.exception.UserException;
import com.stylebypratham.backendspring.model.Cart;
import com.stylebypratham.backendspring.model.CartItem;
import com.stylebypratham.backendspring.model.Product;


public interface CartItemService {

    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
