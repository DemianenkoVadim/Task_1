package com.VDemianenko.Task_14;
/* Метод переводящий гривны в доллары по заданому курсу.
В качестве аргументов - кол-во гривен и курс
 */
import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс гривны и нажмите Enter: ");

        double grnCourse = scanner.nextDouble();
        System.out.print("Введите кол-во гривен необходимых для обмена в доллары и нажмите Enter: ");

        double grnCount = scanner.nextDouble();
        System.out.println(grnCount + " гривен составляет " + convert(grnCourse,grnCount)+" долларов.");
    }
    static double convert(double grnCourse, double count) {
        return count / grnCourse;


    }
}