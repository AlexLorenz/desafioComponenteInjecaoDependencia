package com.devSuperior.desafioComponenteInjecaoDependencia.entities;

public class Order {
    private final int code;
    private final double basic;
    private final double discount;

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public double getBasic() {
        return basic;
    }

    public int getCode() {
        return code;
    }

    public double getDiscount() {
        return discount;
    }
}
