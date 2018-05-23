package com.VDemianenko.Task_15;
/* Даны катеты прямоугольного треугольник.
Найти площадь, периметр, гепотенузу треугольника.
 */

public class Task_15 {
    public static void main(String[] args) {
        double katet_1, katet_2, square,gipotinuza, perimetr;
        katet_1 = 3;
        katet_2 = 4;
        square = (0.5 * katet_1 * katet_2);
        gipotinuza = Math.sqrt(katet_1 * katet_1 + katet_2 * katet_2);
        perimetr = katet_1 + katet_2 + Math.sqrt(katet_1*katet_1 + katet_2*katet_2);
        System.out.println("Если 1 катет равен " + katet_1 + " а втророй катет равен " + katet_2
                                                + " то площадь треугольника равна " + square
                                                + " гипотенуза треугольника равна " + gipotinuza
                                                + " периметр треугольника равен " + perimetr);
    }
}
