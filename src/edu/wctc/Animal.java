package edu.wctc;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();
}
