package com.smp.service;

import com.smp.dto.request.NewCreateOrderRequest;
import com.smp.dto.request.UpdateOrderRequestDto;
import com.smp.exception.ErrorType;
import com.smp.exception.SmpServiceException;
import com.smp.mapper.IOrderMapper;
import com.smp.repository.IContentRepository;
import com.smp.repository.IOrderRepository;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.Order;
import com.smp.repository.entity.enums.EOrderStatus;
import com.smp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final IOrderRepository orderRepository;
    private final IContentRepository contentRepository;
    public OrderService(IOrderRepository orderRepository, IContentRepository contentRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.contentRepository = contentRepository;
    }

    public Boolean createOrder(NewCreateOrderRequest dto) {
        // desk serviceden masa active mi if check yapılacak.
        Order order = IOrderMapper.INSTANCE.toOrder(dto);
        order.setTotalPrice(order.getContentId().stream().map(x->{
            Optional<Content> content = contentRepository.findById(x);
            return content.get().getPrice();
        }).mapToDouble(Double::doubleValue).sum());
        save(order);
        return true;
    }

    public Boolean setStatusClosed(Long id){
        Optional<Order> order = findById(id);
        if (order.isPresent())
            throw new SmpServiceException(ErrorType.ORDER_NOT_FOUND);
        order.get().setOrderStatus(EOrderStatus.CLOSED);
        return true;
    }

    public Boolean setStatusChecked(Long id) {
        Optional<Order> order = findById(id);
        if (order.isPresent())
            throw new SmpServiceException(ErrorType.ORDER_NOT_FOUND);
        order.get().setOrderStatus(EOrderStatus.CHECKED);
        return true;
    }

    public Order updateOrder(UpdateOrderRequestDto dto) {
        Optional<Order> order = orderRepository.findById(dto.getId());
        if (order.isEmpty())
            throw new SmpServiceException(ErrorType.ORDER_NOT_FOUND);
        order.get().setTableId(dto.getId());
        order.get().setContentId(dto.getContentId());
        order.get().setUserId(dto.getUserId());
        update(order.get());
        return order.get();
    }
}
