package com.hgk;

public class GasolineEngine extends Engine implements StandartEngine{
    public GasolineEngine() {
        this.setFuelType("Gasoline");
        this.setCylinderCount((short) 4);
        this.setTorque(140);
    }


    @Override
    public String toString() {
        return "Gasoline Engine instance.";
    }

    @Override
    public void StartEngine() {
        if (isEngineRunning()) {
            System.out.println("Engine is already running.");
        } else {
            setEngineRunning(!isEngineRunning());
            System.out.println("Engine has been started.");
        }
    }

    @Override
    public void StopEngine() {

    }
}
