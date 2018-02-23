package com.design.patterns.strategy.payment.base;

/**
 * Created by himu on 2/23/2018.
 */
public interface PaymentGateway {

    public boolean pay(double amount);
}
