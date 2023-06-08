package Seminar1;

import Seminar2.impl.Cat;
import Seminar2.impl.Owner;

public class Main {
    public static void main(String[] args) {
        // Задание №1 Вызываем пконструктор и передаём туда параметры
        Cat cat = new Cat("Barsik","green");
        Owner owner = new Owner("Artem");
        System.out.println("Мяу! Меня зовут- " + cat.getName() + ", Мне - " + cat.getAge() + ", Мой владелец - " + owner.getNameOner());

        // Задание №2 Вызываем пустой конструктор с парметрами
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        // Задание №2 Вызываем конструктор и передаём туда ширину и высоту
        Rectangle rectangle1 = new Rectangle( 5,10);
        System.out.printf("%s площадь прямоугольника (ширина * высота) %n", rectangle1.getWidth()*rectangle1.getHeight());
        System.out.printf("%s периметр прямоугольника (2 * (ширина + высота) %n", 2*(rectangle1.getWidth()+rectangle1.getHeight()));

        // Задание №3

        Book book1 = new Book("Война и мир", "Лев Николаевич Толстой", false);
        Book book2 = new Book("Отцы и дети автор", "Иван Тургенев", false);
        Book book3 = new Book("Идиот", "Достоевский", false);
        book1.displayInfo();



    }
}
