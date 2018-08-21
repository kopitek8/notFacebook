package com.example.keyur.notfacebook;

/**
 * Created by MF Jones on 7/26/2017.
 */

public class Name {
    private String name;
    private String desc;

    private Name(String name, String desc) {
        this.name = name;
        this.desc = desc;
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
