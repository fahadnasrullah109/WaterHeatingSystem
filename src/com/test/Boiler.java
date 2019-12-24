package com.test;

public class Boiler {
    private float mMinimumColdWaterInGallen;
    private float mOutHotWaterInGallen;
    private Valve mValve;

    public Boiler(float minColWaterInGalen, float hotWaterOutInGalen) {
        this.mValve = new Valve();
        this.mMinimumColdWaterInGallen = minColWaterInGalen;
        this.mOutHotWaterInGallen = hotWaterOutInGalen;
    }

    public float getColdWaterCapacity() {
        return mMinimumColdWaterInGallen;
    }

    public void setColdWaterCapacity(float capacity) {
        this.mMinimumColdWaterInGallen = capacity;
    }

    public float getOutHotWaterCapacity() {
        return mOutHotWaterInGallen;
    }

    public void setOutHotWaterCapacity(float capacity) {
        this.mOutHotWaterInGallen = capacity;
    }

    public Valve getValve() {
        return mValve;
    }

    public void startBoilWater() {
        System.out.println("Boiling Water ...");
    }

    public void stopBoilWater() {
        System.out.println("Stopping Boiling Water ...");
    }

}
