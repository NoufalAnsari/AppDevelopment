package com.model.online_voting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.online_voting.Model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}