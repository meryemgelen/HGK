package com.hgk;

public abstract class Engine {
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public short getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(short cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean getHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    private double power;
    private double volume;
    private double torque;
    private short cylinderCount;
    private double fuelConsumption;
    private String fuelType;
    private boolean hasTurbo;
    private boolean isEngineRunning;

    protected boolean isEngineRunning() {
        return isEngineRunning;
    }

    protected void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }
}
