package com.hgk;

public class Equipment implements DataItem<Integer> {

    private int Id;
    private String name;
    private EquipmentType equipmentType;

    public Equipment(int id, String name, EquipmentType equipmentType) {
        Id = id;
        this.name = name;
        this.equipmentType = equipmentType;
    }

    public String toString(){
        return this.getId() +"-"+ this.name + " " + this.equipmentType.getDangerLevel();
    }

    @Override
    public Integer getId() {
        return this.Id;
    }
}
