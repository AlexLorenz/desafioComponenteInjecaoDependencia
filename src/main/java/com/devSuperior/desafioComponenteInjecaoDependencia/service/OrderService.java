package com.devSuperior.desafioComponenteInjecaoDependencia.service;

import com.devSuperior.desafioComponenteInjecaoDependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    @Autowired
    private DiscountService discountService;

    public double calcularValorFinal(Order order) {
        return discountService.calculateDiscount(order.getBasic(), order.getDiscount()) + shippingService.calculateShipping(order.getBasic());
    }
}
