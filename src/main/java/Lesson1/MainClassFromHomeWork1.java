package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class MainClassFromHomeWork1 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
    }




    // 1. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
private static void ex1() {
    Scanner f = new Scanner(System.in);

    System.out.printf("Введите длину массива: ");

    Integer len = f.nextInt();

    System.out.printf("Введите число для массива: ");

    Integer initialValue = f.nextInt();

    int[] result = ArrayLen(len, initialValue);

    System.out.println(Arrays.toString(result));

    f.close();
}

    private static int[] ArrayLen(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;

    }
// 2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void ex2()
    {
        int[] arr = {4, 2, 8, 1, 5, 6, 7, 3, 8, 9, 0};
        int min = arr[0], max = arr[0], i;
        for(i = 0; i != arr.length; i++)
        {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max = "+max+" min = "+min);
    }

// 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
// диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
// принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    private static void ex3(int[][] arr)
    {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }


}
