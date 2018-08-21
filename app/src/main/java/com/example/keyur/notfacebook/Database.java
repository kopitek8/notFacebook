package com.example.keyur.notfacebook;

/**
 * Created by MF Jones on 8/2/2017.
 */

public class Database {

    private int id;
    private String name;
    private String desc;

    public Database(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Database () {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
