package dz7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.printf("В миске осталось %s еды%n", foodCount);
    }

    public int getFoodCount() {
        return foodCount;
    }


    public boolean decreaseFood(int carEatFoodCount) {
        if (foodCount < carEatFoodCount) {
            System.out.println("В миске еды меньше, чем котик хочет съесть");
            return false;
        } else {
            foodCount -= carEatFoodCount;

            System.out.println("Объем миски уменьшился на " + carEatFoodCount);
            return true;
        }

    }

    public void addFood(int plusFood) {
        foodCount += plusFood;
    }
}
