package com.hgk;

public class Personal implements DataItem<Integer>{

    public Personal(int id, String name, String surName) {
        this.setId(id);
        this.setName(name);
        this.setSurName(surName);
    }

    @Override
    public Integer getId() {
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

    public String toString(){
       return this.getId() +"-"+ this.getName() + " " + this.getSurName();
    }

    private int Id;
    private String name;
    private String surName;
}
