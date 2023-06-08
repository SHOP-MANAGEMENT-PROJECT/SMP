package com.smp.service;

import com.smp.repository.IContentRepository;
import com.smp.repository.IOrderRepository;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.Order;
import com.smp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final IOrderRepository orderRepository;
    public OrderService(IOrderRepository orderRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }
}
