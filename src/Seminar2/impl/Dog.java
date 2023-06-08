package Seminar2.impl;

import Seminar2.Animals;
import Seminar2.Bite;

public class Dog extends Animals implements Bite{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("мяу....");

    }

    @Override
    public void hunt() {

    }

}
