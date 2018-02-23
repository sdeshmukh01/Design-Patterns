package com.design.patterns.strategy.payment.base;

/**
 * Created by himu on 2/23/2018.
 */
public class PaypalGateway implements PaymentGateway{

   private String loginName;
   private String password;

    public PaypalGateway(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Amount: "+amount + " paid via Paypal");
        return true;
    }
}
