package Seminar3;

import Seminar3.impl.Cat;
import Seminar3.impl.Companent;
import Seminar3.impl.Dog;
import Seminar3.impl.companets.Beef;
import Seminar3.impl.companets.Carrot;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Companent> companentCat = List.of(new Beef("Мясо", 50, 100));
        List<Companent> companentDog = List.of(new Carrot("Морковь", 20, 20));
        Cat food1 = new Cat(companentCat, "Murka");
        Dog food2 = new Dog(companentDog, "Boni");
        for (Cat it = food1; it.hasNext(); ) {
            System.out.println(food1.getName() + " Кушает один раз в день еду состающую из:" + it.next());
        }
        for (Dog it = food2; it.hasNext(); ) {
            System.out.println(food2.getName() + " Кушает один раз в день еду состающую из:" + it.next());
        }
    }
}

