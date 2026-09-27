package com.devSuperior.desafioComponenteInjecaoDependencia.service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double calculateShipping(double basicOrder) {
        if(basicOrder < 100) {
            return 20;
        }  else if(basicOrder >= 100 && basicOrder < 200) {
            return 12;
        } else {
            return 0;
        }
    }
}
