package com.hgk;

import com.sun.istack.internal.Nullable;

public class MenuItem {
    private int id;
    private int displayOrder;
    private int parentId;
    private String name;

    public MenuItem(int Id, int displayOrder, String name, int parentId){
        this.setId(Id);
        this.setDisplayOrder(displayOrder);
        this.setName(name);
        this.setParentId(parentId   );
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
}
