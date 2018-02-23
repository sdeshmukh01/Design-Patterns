package com.design.patterns.strategy.payment.impl;

import com.design.patterns.strategy.payment.base.CreditCardGateway;
import com.design.patterns.strategy.payment.base.PaymentUtil;

import java.util.Date;

/**
 * Created by himu on 2/23/2018.
 */
public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PaymentUtil paymentUtil = new PaymentUtil();
        paymentUtil.setPaymentGateway(new CreditCardGateway("", "", "", new Date()));
        cart.makePayment(paymentUtil);
    }
}
