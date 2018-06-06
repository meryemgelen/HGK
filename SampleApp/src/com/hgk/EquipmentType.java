package com.hgk;

public enum EquipmentType {
    CAR         (1),
    TRUCK       (3),
    HAMMER      (2),
    ELECTRICAL  (1);

    private int dangerLevel;

    EquipmentType(int dangerLevel) {
        this.dangerLevel=dangerLevel;
    }

    public String getDangerLevel() {
        String val=null;
        switch (dangerLevel)
        {
            case 1:
                val= "Low";
            case 2:
                val= "Medium";
            case 3:
                val="High";
        }
        return val;
    }

}