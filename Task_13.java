package com.VDemianenko.Task_13;
/* Программа считывающая количество часов, минут, секунд
в n-ном количестве суток.
 */
import java.util.Scanner;
public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество суток и нажмите Enter");
        double  day = in.nextDouble();
        double hours = day * 24;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.println("В " + day + " сутках " + hours + " часа "
                                + minutes + " минут " + seconds + " секунды");
    }
}
