package com.company;
// ax2 + bx + c = 0, a!=0
// D = b^2 -4ac
// Если D < 0, корней нет;
// Если D = 0, есть ровно один корень;
// Если D > 0, корней будет два.
// x1 = -b+(D)/2a
// x2 = -b-(D)/2a
public class Main {
    public static void main(String[] args) {
        getRoots(0,0,0);
    }
    //ищем дискриминант
    public static double discrimenant(double a, double b, double c){
        double d = b * b - 4 * a * c;
        return d;
    }
    //ищем корни
    public static void getRoots(double a, double b, double c){
        double d = discrimenant(a,b,c);
        double x1,x2;
        if(a != 0){
            if(d < 0){
                System.out.println("Уровнение корней не имеет");
            }
            else if(d == 0){
                x1 = ((-b) + Math.sqrt(d)) / (2 * a);
                System.out.println("Уровнение имеет один корень, x = " + x1);
            }
            else if(d > 0){
                x1 = ((-b) + Math.sqrt(d)) / (2 * a);
                x2 = ((-b) - Math.sqrt(d)) / (2 * a);
                System.out.println("Уровнение имеет два корня, x1 = " + x1 + ", х2 = " + x2);
            }
            else{
                System.out.println("Err.. (Что-то пошло не так)");
            }
        }
        else{
            System.out.println("Err.. (Деление на 0)");
        }

    }
}
