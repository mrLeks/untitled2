package com.company;
// Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
public class hw2_less2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }

    }
}
