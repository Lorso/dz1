package dz5;

public class HomeWork5 {
    public static void main(String[] args) {

        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = new Sotrudnik("Иванов Как Каыч", "работяг", "фыфыф.ру", "+78282882", 25003, 45);
        sotrArray[1] = new Sotrudnik("asasв Как Каыч", "работяг", "фыфыф.ру", "+78282882", 2232303, 35);
        sotrArray[2] = new Sotrudnik("asasв Как Каыч", "работяг", "фыфыф.ру", "+78282882", 25303, 65);
        sotrArray[3] = new Sotrudnik("asasв Как Каыч", "работяг", "фыфыф.ру", "+78282882", 1303, 12);
        sotrArray[4] = new Sotrudnik("asasв Как Каыч", "работяг", "фыфыф.ру", "+78282882", 9932303, 76);

        for (Sotrudnik sotrudnik : sotrArray) {
            if (sotrudnik.getAge()>40) {
                sotrudnik.printInfo();
            }

        }

    }
}
