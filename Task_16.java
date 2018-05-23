package com.VDemianenko.Task_16;
/* Значение температуры в градусах цельсия,
вывести в градусах Фарингейта
 */
public class Task_16 {
    public static void main(String[] args) {
        double gradusCelsia, gradusFaringeita;
        gradusCelsia = 15;
        gradusFaringeita = 1.8 * gradusCelsia + 32;
        System.out.println("Температура равная "  + gradusCelsia + " Цельсия "
                + " равна " + gradusFaringeita + " градусам Фарингейта");
    }
}
