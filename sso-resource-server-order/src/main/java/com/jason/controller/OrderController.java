package com.jason.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @GetMapping("/order/list")
    @PreAuthorize("hasRole('ORDER')")
    public String orderList() {
        return "订单列表";
    }

}
