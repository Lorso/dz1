public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //hhhhhghhjg
    private static void checkSumSign() {
        int a = 5;
        int b = 10;
        if ((a+b)>=0)
            System.out.println("Summa polozhitelnaya");
        else
            System.out.println("Summa otricatelnaya");
    }

    private static void printColor() {
        int value = 27;
        if (value<=0)
            System.out.println("Красный");
        else if(value>0 && value<=100)
            System.out.println("Жёлтый");
        else
            System.out.println("Зелёный");
    }

    private static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

}
