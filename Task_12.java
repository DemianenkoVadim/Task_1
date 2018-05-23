package com.VDemianenko.Task_12;
/* Пользователь задает расстояние до места назначения и время,
за которое нужно доехать. Программа вычисляет скорость, с которой нужно ехать.
 */
        import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние (в километрах) до места назначения нажмите Enter");
        double distance = in.nextDouble();
        System.out.println("Введите время (в часах) за которое нужно предодолеть вышеуказанное расстоянее");
        double timeDistance = in.nextDouble();
        double  Time = distance/timeDistance;
        System.out.println("Необходимая скорость передвижения " + Time  + " км/ч");
    }
}