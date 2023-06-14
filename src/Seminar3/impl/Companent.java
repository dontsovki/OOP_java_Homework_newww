package Seminar3.impl;

public class Companent {
    private String name;
    private int welght;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWelght() {
        return welght;
    }

    public void setWelght(int welght) {
        this.welght = welght;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Companent(String name, int welght, int calories) {
        this.name = name;
        this.welght = welght;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Companent{" +
                "name='" + name + '\'' +
                ", welght=" + welght +
                ", calories=" + calories +
                '}';
    }
}
