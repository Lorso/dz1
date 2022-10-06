package dz3;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;


public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("#1");
        refak();

        System.out.println("#2");
        arrinc();

        System.out.println("#3");
        minusSix();

        System.out.println("#4");
        diag();

        System.out.println("#5");
        input();

        System.out.println("#6");
        minmax();

        System.out.println("#7");
        int[] array = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(array));

        //потел-потел, так и не выходит
        System.out.println("#8");
        int[] array2 = new int[]{3, 5, 6, 1};
        int n = -2;
        sdvig(array2, n);
    }

    private static void sdvig(int[] array, int n) {
        int sas;
        for (int i = 0; i < array.length-1; i++) {
            sas = array[i];
            array[i] = array[(array.length-n)%array.length];
            array[(array.length-n)%array.length] = sas;
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean checkBalance(int[] array) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length-1; i++) {
            sum1+=array[i];
            for (int j = array.length-1; j > i ; j--) {
                sum2+=array[j];
            }
            if (sum1 == sum2) {
                return true;
            }
            else {
                sum2 = 0;
            }
        }
        return false;

    }

    private static void minmax() {
        int[] array = new int[]{1, 3, 6, 3};
        System.out.println(Arrays.toString(array));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }


    private static void input() {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int initialValue = in.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));


    }

    private static void diag() {
        int[][] array2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    array2[i][j] = 1;
                }
                if ((i + j) == array2.length - 1) {
                    array2[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

    }

    private static void minusSix() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i]*=2;
            }

        }
        System.out.println("Массив после: " + Arrays.toString(array));
    }

    private static void arrinc() {
        int[] array = new int[100];
        //array[0] = 1;
        for (int i = 0; i < array.length; i++) {
            array[i]+=1+i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void refak() {
        int[] array = new int[]{1, 1, 0, 0, 1, 1, 0};
        System.out.println("Массив до: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else {
                array[i] = 0;
            }
        }
        System.out.println("Массив после: " + Arrays.toString(array));
    }

}
