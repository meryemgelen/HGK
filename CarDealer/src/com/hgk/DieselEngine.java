package com.hgk;

public class DieselEngine extends Engine implements Diesel,StandartEngine {
    public DieselEngine(){
        this.setFuelType("Diesel");
        this.setTorque(430);
        this.setHasTurbo(true);
        this.setCylinderCount((short)8);
    }

    @Override
    public String toString() {
        return "Diesel Engine instance.";
    }

    @Override
    public void HeatUpInjectors()
    {
        System.out.println("Injectors is getting hotter!");
    }

    @Override
    public void StartEngine(){
        if (isEngineRunning()) {
            System.out.println("Engine is already running.");
        } else {
            setEngineRunning(!isEngineRunning());
            HeatUpInjectors();
            System.out.println("Engine has been started.");
        }
    }

    @Override
    public void StopEngine() {

    }
}
