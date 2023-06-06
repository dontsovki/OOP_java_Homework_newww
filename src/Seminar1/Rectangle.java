package Seminar1;

public class Rectangle {
    private int width;
    private  int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public Rectangle(){
        this.height = 10;
        this.width = 20;
    }

    public Rectangle(int width1, int height1) {
        this.width = width1;
        this.height = height1;
    }
    public void calculateArea(){
        System.out.printf("%s площадь прямоугольника (ширина * высота) %n", this.height*this.width);

    }
    public void calculatePerimeter(){
        System.out.printf("%s периметр прямоугольника (2 * (ширина + высота) %n", 2*(this.height+this.width));

    }

}
