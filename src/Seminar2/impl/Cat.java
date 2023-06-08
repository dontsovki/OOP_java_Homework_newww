package Seminar2.impl;

import Seminar2.Animals;
import Seminar2.Bite;
import Seminar2.Jump;

public class Cat extends Animals implements Jump, Bite {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color) {
        super(name, color);
    }
    public Cat (int age){
        this.age = age;
    }

    public static void greet(){

    }

    @Override //Полиморфизм переопределение метода speak()
    public void speak() {
        System.out.println("Мяу");

    }

    @Override
    public void hunt(){wekUp();eat();toPlay();} // инкапсуляция, сокрытие методов методов wekUp(), eat(), toPlay()

        private   void wekUp(){System.out.println("Cat woke up....");}
        private   void eat(){
        System.out.println("Cat eat...");
    }
        private void toPlay(){
        System.out.println("Cat play....");
    }

}
