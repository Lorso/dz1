package dz2;

public class HomeWork2 {
    public static void main(String[] args) {
        //1
        System.out.println(diapozon(12, 4));
        //2
        polozh(-10);
        //3
        System.out.println(polozhb(0));
        //4
        cicle("israel", 4);
        //5*
        System.out.println(visokos(700));

    }

    private static boolean visokos(int i) {
        if ((i%4 == 0 && i%100 != 0) || i%400 == 0)
            return true;
        else
            return false;
    }

    private static void cicle(String b, int a) {
        for (int i = 0; i < a; i++)
            System.out.println(b);
    }

    private static boolean polozhb(int i) {
        if (i >= 0)
            return true;
        else
            return false;
    }

    private static void polozh(int i) {
        if (i >= 0)
            System.out.println("Polozh");
        else
            System.out.println("Otric");
    }


    private static boolean diapozon(int a, int b) {
        if (10 <= (a+b) && (a+b) <= 20)
            return true;
        else
            return false;
    }


}
