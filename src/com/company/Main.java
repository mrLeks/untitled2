package com.company;
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
// [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i : arr) {
            if (i == 1) i = 0;
            else i = 1;
            System.out.print(i + " ");
        }
    }
}
