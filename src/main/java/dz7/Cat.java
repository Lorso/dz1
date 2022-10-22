package dz7;

import java.util.Random;

public class Cat {
    private String name;

    private boolean satiety = false;

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        int carEatFoodCount = new Random().nextInt(45, 56);

        if (plate.decreaseFood(carEatFoodCount)) {
            System.out.printf("Котик %s съел %s корма%n", name, carEatFoodCount);
            satiety = true;
        };


    }

    public void printInfo() {
        if (satiety) {
            System.out.printf("Котик %s сыт%n", name);
        }
        else {
            System.out.printf("Котик %s голоден%n", name);
        }
    }
}
