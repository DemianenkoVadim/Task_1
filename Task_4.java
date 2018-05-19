package com.VDemianenko.Task_4;

public class Task_4 {
    public static void main (String[]args) {
        int n = 243;
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int za = z % 10;
        int na = x + y + za;
        System.out.println("Сумма цифр числа " +n + " равна " + na);
    }
}

