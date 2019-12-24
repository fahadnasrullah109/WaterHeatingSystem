package com.test;

public class Pump {
    private Valve mWaterOutValve;

    public Valve getWaterOutValve() {
        return mWaterOutValve;
    }

    public void setWaterOutValve(Valve mWaterOutValve) {
        this.mWaterOutValve = mWaterOutValve;
    }

    public void releaseWater(){
        mWaterOutValve.open();
    }
}
