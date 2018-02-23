package com.design.patterns.observer.bidding.system.base;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by himu on 2/23/2018.
 */
public class Bid implements Observer{

    private String bidderName;
    private int amount;

    public Bid(String name, int amount) {
        super();
        this.bidderName = name;
        this.amount = amount;
    }

    @Override
    public void update(Observable o, Object arg) {
    Project project = (Project) o;
    Bid acceptedBid = (Bid) arg;
        System.out.println("Mail box [" + bidderName + "] : '" +
                acceptedBid.getBidderName() + "' won '" + project.getProjectName() + "' project.");
    }

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
