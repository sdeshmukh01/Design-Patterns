package com.design.patterns.observer.bidding.system.base;

/**
 * Created by himu on 2/23/2018.
 */
public class Test {

    public static void main(String[] args) {
        Project project = new Project("Romainain Highway");
        Bid bid1 = new Bid("A Construction", 150000);
        Bid bid2 = new Bid("B Construction", 250000);
        Bid bid3 = new Bid("X Construction", 120000);
        Bid bid4 = new Bid("Y Construction", 160000);
        project.submitBid(bid1);
        project.submitBid(bid2);
        project.submitBid(bid3);
        project.submitBid(bid4);
        project.acceptBid();
    }
}
