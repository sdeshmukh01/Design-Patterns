package com.design.patterns.strategy.payment.base;

import java.util.Date;

/**
 * Created by himu on 2/23/2018.
 */
public class CreditCardGateway implements PaymentGateway{


    private String cardNumber;
    private String name;
    private String cvv;
    private Date dateOfExpiry;

    public CreditCardGateway(String cardNumber, String name, String cvv, Date dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public boolean pay(double amount) {

        System.out.println("Amount: "+amount + "paid with credit card");
        return true;
    }
}
