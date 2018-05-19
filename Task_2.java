package com.VDemianenko.Task_2;

public class Task_2 {
    public static void main (String[]args){
        int x = 23;
        int y = x % 10;
        int z = (x/10)%10;
        System.out.println("Сумма цифр числа " +x +" равна "+(y+z));
    }
}
