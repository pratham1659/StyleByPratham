package com.stylebypratham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stylebypratham.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
