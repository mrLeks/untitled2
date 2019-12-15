package com.company;
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
public class hw4_less2 {
    public static void main(String[] args) {
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                table[i][j] = table[i][j] - 2;
                counter++;
            }
        }

        for(int i = 0; i < table.length; i++){
            table[i][i] = 1;
        }

        printArr(table);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
