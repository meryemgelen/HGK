package com.hgk;

import java.util.List;
import java.util.stream.Collectors;

public class DataManager<T> {
    private List<T> data;
    public DataManager(List<T> items)
    {
        this.data=items;
    }
    public List<T> getAll(){
        return this.data;
    }

    public List<T> getById(int Id){
        return this.data.parallelStream().filter(p->((DataItem<Integer>)p).getId()==Id).collect(Collectors.toList());
    }

    public List<T> searchByKeyword(String keyword){
        return this.data.parallelStream().filter(p->p.toString().contains(keyword)).collect(Collectors.toList());
    }
}
