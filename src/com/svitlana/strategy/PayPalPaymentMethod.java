package com.svitlana.strategy;

public class PayPalPaymentMethod implements PaymentMethod {

    @Override
    public boolean pay() {
        System.out.println("PayPal payment");
        return true;
    }
}
