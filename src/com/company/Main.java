package com.company;

public class Main {
    public static void main(String[] args) {
        getRoots(0, 45, 5454);
    }

    //ищем дискриминант
    public static int discrimenant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    //ищем корни
    public static void getRoots(int a, int b, int c) {
        int d = discrimenant(a, b, c);
        double x1;
        if (a != 0) {
            if (d < 0) {
                System.out.println("Уровнение корней не имеет");
            } else if (d == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("Уровнение имеет один корень, x = " + x1);
            } else {
                double dsqrt = Math.sqrt(d);
                x1 = ((-b) + dsqrt) / (2 * a);
                double x2 = ((-b) - dsqrt) / (2 * a);
                System.out.println("Уровнение имеет два корня, x1 = " + x1 + ", х2 = " + x2);
            }
        } else {
            x1 = -c / b;
            System.out.println("Уровнение имеет один корень, x = " + x1);
        }

    }
}
