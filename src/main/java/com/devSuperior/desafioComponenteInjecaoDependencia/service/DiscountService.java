package com.devSuperior.desafioComponenteInjecaoDependencia.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double calculateDiscount(double basicOrder, double discount) {
        double finalDiscount = discount / 100;
        return basicOrder - (basicOrder * finalDiscount);
    }
}
