package com.test;

public class TemperatureController {
    private HeatingWaterTank mWaterTank;
    private boolean mShutDown;

    public TemperatureController() {
        mWaterTank = new HeatingWaterTank();
        mWaterTank.setBoiler(new Boiler(200, 200));
        mWaterTank.setThermostat(new Thermostat());
        mWaterTank.setPump(new Pump());
    }

    public void shutDown() {
        this.mShutDown = true;
    }

    public void controlTemperature(float definedTemp) {
        System.out.println("Controling Temperature ...");
        while (!mShutDown) {
            if (mWaterTank.getThermostat().getWaterTemperature() < definedTemp) {
                mWaterTank.getBoiler().startBoilWater();
                mWaterTank.getBoiler().getValve().open();
            } else if (mWaterTank.getThermostat().getWaterTemperature() > definedTemp) {
                mWaterTank.getBoiler().stopBoilWater();
                mWaterTank.getBoiler().getValve().close();
                mWaterTank.getPump().releaseWater();
            } else {
                // Temperature Maintained
                mWaterTank.getBoiler().stopBoilWater();
                System.out.println("... SHUT DOWN ...");
            }
        }
        System.out.println("... SHUT DOWN ...");
    }

}
