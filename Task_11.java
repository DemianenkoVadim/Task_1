package com.VDemianenko.Task_11;
/* Программа, которая будет выводить таблицу умножения
введенного пользователем числа с клавиатуры
 */
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter");
        int yourNumber = in.nextInt();

        System.out.println("Таблица умножения на " + (yourNumber));

        int count, result;
            for (count = 1; count <= 10; count++) {
                result = yourNumber * count;
                System.out.println(yourNumber + " * " + count + " = " + result);
            }
    }
}
