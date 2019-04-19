package com.svitlana.strategy;

public class PaymentServiceImpl implements PaymentService {

    private PaymentMethod method;

    // Default strategy can be used here
    public void setMethod(final PaymentMethod method) {
        this.method = method;
    }

    @Override
    public String pay() {
        System.out.println("Successfully starting ");
        method.pay();
        System.out.println("Successfully paid");
        return "it was ok";
    }
}
