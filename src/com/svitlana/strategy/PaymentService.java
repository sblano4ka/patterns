package com.svitlana.strategy;

public interface PaymentService {

    void setMethod(final PaymentMethod method);

    String pay();
}
