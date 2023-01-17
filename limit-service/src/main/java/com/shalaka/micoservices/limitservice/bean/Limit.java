package com.shalaka.micoservices.limitservice.bean;

public class Limit {

    private int miminum;
    private int maximum;

    public Limit(int miminum, int maximum) {
        this.miminum = miminum;
        this.maximum = maximum;
    }

    public Limit() {

    }

    public int getMiminum() {
        return miminum;
    }

    public void setMiminum(int miminum) {
        this.miminum = miminum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
