package com.VDemianenko.Task_10;
// Программа, которая просит ввести Ваше имя, а потом выведет его на консоль
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String yourName = in.nextLine();
        System.out.println("Ваше имя - " + yourName);
    }
}
