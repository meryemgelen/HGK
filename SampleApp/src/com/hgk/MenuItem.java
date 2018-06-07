package com.hgk;

import java.util.function.Supplier;

public class MenuItem<T> {
    private int id;
    private int displayOrder;
    private int parentId;
    private String name;
    private Supplier<T> funcRef;

    public MenuItem(int Id, int displayOrder, String name, int parentId,Supplier<T> func){
        this.setId(Id);
        this.setDisplayOrder(displayOrder);
        this.setName(name);
        this.setParentId(parentId);
        this.funcRef=func;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    private void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Supplier<T> Func() {
        return funcRef;
    }
}
