package com.stylebypratham.backendspring.repository;

import com.stylebypratham.backendspring.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
