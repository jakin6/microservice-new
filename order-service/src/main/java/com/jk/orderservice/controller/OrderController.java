package com.jk.orderservice.controller;

import com.jk.orderservice.dto.OrderRequest;
import com.jk.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String PlaceOrder(@RequestBody OrderRequest orderRequest){
            orderService.placeOrder(orderRequest);
            return "Order placed successfully";
    }
}
