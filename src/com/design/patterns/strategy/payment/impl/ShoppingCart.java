package com.design.patterns.strategy.payment.impl;

import com.design.patterns.strategy.payment.base.PaymentUtil;

import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public class ShoppingCart {

    private List<String > items;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void makePayment(PaymentUtil paymentUtil){
        double amount = 100.00;
        paymentUtil.makePayment(amount);
    }
}
