package com.smp.controller;

import static com.smp.constants.ApiUrls.*;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.dto.request.NewCreateOrderRequest;
import com.smp.dto.request.UpdateOrderRequestDto;
import com.smp.repository.entity.Order;
import com.smp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(ORDER)
public class OrderController {
    private final OrderService orderService;

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> createContent(@RequestBody NewCreateOrderRequest dto) {
        return ResponseEntity.ok(orderService.createOrder(dto));
    }

    @PostMapping(SETSTATUSCLOSED)
    public ResponseEntity<Boolean> setStatusClosed(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.setStatusClosed(id));
    }

    @PostMapping(SETSTATUSCHECKED)
    public ResponseEntity<Boolean> setStatusChecked(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.setStatusChecked(id));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Order>> getAllOrder() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @PutMapping(UPDATE)
    public ResponseEntity<Order> updateOrder(@RequestBody UpdateOrderRequestDto dto) {
        return ResponseEntity.ok(orderService.updateOrder(dto));
    }

}
