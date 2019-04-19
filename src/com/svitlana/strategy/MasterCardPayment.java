package com.svitlana.strategy;

public class MasterCardPayment implements PaymentMethod {
    @Override
    public boolean pay() {
        System.out.println("MasterCard payment");
        return true;
    }
}
