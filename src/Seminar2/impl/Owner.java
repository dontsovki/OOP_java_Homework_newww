package Seminar2.impl;

import Seminar2.Animals;

import java.util.List;

public class Owner{
    private String nameOner;

    private final String people = "Homo sapiens"; // // final константа которую нельзя изменять

    public String getPeople() {
        return people;
    }

    public String getNameOner() {
        return nameOner;
    }

    public void setNameOner(String nameOner) {
        this.nameOner = nameOner;
    }

    public Owner(String nameOner) {
        this.nameOner = nameOner;
    }
    public Owner(){

    }
    //перегрузка методов
    public void sayHello (String nameOner){
        System.out.println("Добрый день- " + getNameOner());
     }

}
