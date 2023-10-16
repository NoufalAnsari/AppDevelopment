package com.model.online_voting.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.online_voting.Model.CartItem;
import com.model.online_voting.Repository.CartItemRepository;

@Service
public class CartItemService {

	 private final CartItemRepository cartItemRepository;

	    @Autowired
	    public CartItemService(CartItemRepository cartItemRepository) {
	        this.cartItemRepository = cartItemRepository;
	    }

	    public List<CartItem> getAllItems() {
	        return cartItemRepository.findAll();
	    }

	    public CartItem addItem(CartItem cartItem) {
	        return cartItemRepository.save(cartItem);
	    }

	    public CartItem updateItem(Long itemId, CartItem cartItem) {
	        if (cartItemRepository.existsById(itemId)) {
	            cartItem.setId(itemId);
	            return cartItemRepository.save(cartItem);
	        }
	        return null; // Item not found
	    }

	    public void removeItem(Long itemId) {
	        cartItemRepository.deleteById(itemId);
	    }

	    public void clearCart() {
	        cartItemRepository.deleteAll();
	    }
}
