package com.stylebypratham.service;

import org.springframework.stereotype.Service;

import com.stylebypratham.modal.OrderItem;
import com.stylebypratham.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService {

    private OrderItemRepository orderItemRepository;

    public OrderItemServiceImplementation(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {

        return orderItemRepository.save(orderItem);
    }

}
