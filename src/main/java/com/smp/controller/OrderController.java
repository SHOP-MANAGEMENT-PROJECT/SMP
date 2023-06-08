package com.smp.controller;

import static com.smp.constants.ApiUrls.*;
import com.smp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(ORDER)
public class OrderController {
    private final OrderService orderService;
}
