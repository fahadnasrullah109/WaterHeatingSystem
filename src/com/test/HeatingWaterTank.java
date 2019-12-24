package com.test;

public class HeatingWaterTank {
    private float mMinimumWaterCapacityInGalen = 500;
    private Boiler mBoiler;
    private Thermostat mThermostat;
    private Pump mPump;

    public void setWaterOutletCapacity(int capacity) {
        this.mMinimumWaterCapacityInGalen = capacity;
    }

    public float getWaterOutletCapacity() {
        return mMinimumWaterCapacityInGalen;
    }

    public Boiler getBoiler() {
        return mBoiler;
    }

    public void setBoiler(Boiler mBoiler) {
        this.mBoiler = mBoiler;
    }

    public Thermostat getThermostat() {
        return mThermostat;
    }

    public void setThermostat(Thermostat mThermostat) {
        this.mThermostat = mThermostat;
    }

    public Pump getPump() {
        return mPump;
    }

    public void setPump(Pump mPump) {
        this.mPump = mPump;
    }
}
