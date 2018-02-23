package com.design.patterns.observer.bidding.system.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by himu on 2/23/2018.
 */
public class Project extends Observable {

    private String projectName;
    private List<Bid> submittedBids = new ArrayList<Bid>();
    private Bid acceptedBid;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Bid> getSubmittedBids() {
        return submittedBids;
    }

    public void setSubmittedBids(List<Bid> submittedBids) {
        this.submittedBids = submittedBids;
    }

    public Bid getAcceptedBid() {
        return acceptedBid;
    }

    public void setAcceptedBid(Bid acceptedBid) {
        this.acceptedBid = acceptedBid;
    }

    public void submitBid(Bid bid) {
        submittedBids.add(bid);
        this.addObserver(bid);
    }

    public void acceptBid() {
        int max = 0;
        Bid maxBid = null;

        for (int i = 0; i < submittedBids.size(); i++) {
            if (max < submittedBids.get(i).getAmount()) {
                max = submittedBids.get(i).getAmount();
                maxBid = submittedBids.get(i);
            }
        }

        if (maxBid != null) {
            this.acceptedBid = maxBid;
            this.setChanged();
            this.notifyObservers(this.acceptedBid);
        }
    }
}
