package com.VDemianenko.Task_9;
// Программа, провереяющая является ли число типа double целым
public class Task_9 {
    public static void main(String[] args) {
        double Number_1 = 234.3324234;

        if ((Number_1 % 1) == 0) {
            System.out.println("Число " + Number_1 + " является целым");
        } else {
            System.out.println("Число " + Number_1 + " является дробным");
        }
    }
}

