package Seminar3.impl;

import java.util.List;

public class Cat extends Food{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(List<Companent> component) {
        super(component);
    }

    public Cat(List<Companent> component, String name) {
        super(component);
        this.name = name;
    }
}
