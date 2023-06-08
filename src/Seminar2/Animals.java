package Seminar2;

public abstract class Animals {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animals(String name, String color) { // Конструктор
        this.name = name;
        this.color = color;

    }
    public Animals(){

    }

    public abstract void speak(); //абстрактный класс, обязательно должен быть реализован в наследниках (если они не обстрактны сами)

    public abstract void hunt();
}
