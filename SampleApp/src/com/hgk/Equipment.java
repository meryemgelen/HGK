package com.hgk;

public class Equipment {

    private int Id;
    private String name;
    private EquipmentType equipmentType;

    public Equipment(int id, String name, EquipmentType equipmentType) {
        Id = id;
        this.name = name;
        this.equipmentType = equipmentType;
    }
}
