package com.design.patterns.strategy.payment.base;

/**
 * Created by himu on 2/23/2018.
 */
public class PaymentUtil {

    private PaymentGateway paymentGateway;

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        return paymentGateway.pay(amount);
    }

}
