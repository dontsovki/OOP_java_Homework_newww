package Seminar4;

public class Main {
    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();

        for (int i = 0; i < 10; i++) {
            apples.addFruit(new Apple());
            oranges.addFruit(new Orange());
        }

        apples.showBox();
        oranges.showBox();

        System.out.printf("The weight of %s: %.2f kg\n", apples.toString(), apples.getWeight());
        System.out.printf("The weight of %s: %.2f kg\n", oranges.toString(), oranges.getWeight());

        apples.compare(oranges);

        System.out.println("------------------");
        Box<Orange> box = new Box<>();
        for (int i = 0; i < 20; i++) {
            box.addFruit(new Orange());
        }
        box.showBox();
        box.sprinkleFruits(oranges);
        box.showBox();
        oranges.showBox();
        System.out.printf("The weight of %s: %.2f kg\n", box.toString(), box.getWeight());
//        apples.addFruit(new Orange());

    }
}
