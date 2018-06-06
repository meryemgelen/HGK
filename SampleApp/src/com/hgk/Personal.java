package com.hgk;

public class Personal {

    public Personal(int id, String name, String surName) {
        this.Id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return this.Id;
    }

    private void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    private void setSurName(String surName) {
        this.surName = surName;
    }

    private int Id;
    private String name;
    private String surName;
}
