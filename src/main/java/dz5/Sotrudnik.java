package dz5;

public class Sotrudnik {
    private String fio;
    private String dolzh;
    private String email;

    public int getAge() {
        return age;
    }

    private String number;
    private int salary;
    private int age;

    public Sotrudnik(String fio, String dolzh, String email, String number, int salary, int age) {
        this.fio = fio;
        this.dolzh = dolzh;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("ФИО: %s, ДОЛЖНОСТЬ: %s, ПОЧТА: %s, НОМЕР ТЕЛЕФОНА: %s, ЗАРПЛАТА: %s, ВОЗРАСТ: %s%n", fio, dolzh, email, number, salary, age);
    }
}
