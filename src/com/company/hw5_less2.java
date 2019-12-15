package com.company;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public class hw5_less2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 10, 13, -8, -3};
        int max = 0;
        int min = 0;
        for (int i : arr){
            if(i > max){
                max = i;
            } else if (i < min){
                min = i;
            }
        }

        System.out.println("Максимальное значение: " + max + " "+ "Минимальное значение: " + min);
    }
}
