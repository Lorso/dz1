package dz7;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Титуль");
        Plate plate = new Plate(50);
        plate.addFood(20);
        plate.printInfo();
        cat.printInfo();


        cat.eat(plate);
        plate.printInfo();
        cat.printInfo();

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Tama");
        cats[1] = new Cat("Mata");

        Plate plate2 = new Plate(100);
        for (Cat cat1 : cats) {
            cat1.eat(plate2);
            cat1.printInfo();
        }


    }
}
