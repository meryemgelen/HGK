package com.hgk;

public class POIItem {
    public POIItem(int id, String name, String desc, double latitude, double longitude) {
        Id = id;
        this.setName(name);
        this.setDesc(desc);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getLatitude() {
        return latitude;
    }

    private void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private int Id;
    private String name;
    private String desc;
    private double latitude;
    private double longitude;
}
