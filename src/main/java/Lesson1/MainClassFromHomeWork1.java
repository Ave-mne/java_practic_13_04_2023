package Lesson1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainClassFromHomeWork1 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
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

    private static void ex3(int [][] arr)
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

// 4.В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//  "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//  "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//  "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//  "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static void ex4() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        iScanner.close();

        Date date = new Date();
        int hours = date.getHours();
        if (hours > 23 && hours < 5){
            System.out.printf("Доброй ночи, %s!", name);
        }
        if (hours < 23 && hours > 18){
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (hours > 12 && hours < 18){
            System.out.printf("Добрый день, %s!", name);
        }
        if (hours > 5 && hours < 12){
            System.out.printf("Доброе утро, %s!", name);
        }
    }

// 5.** Написать метод, которому на вход подается одномерный массив и число n (может быть
// положительным, или отрицательным), при этом метод должен сместить все элементы массива
// на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
// вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.
    private static void ex5()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int num = in.nextInt();
        in.close();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Массив до сдвига:\t\t" + Arrays.toString(arr));
        int length = arr.length;

        if (num < 0)
        {
            for (int i = 0; i < -num; i++)
            {
                int buffer = arr[length - 1];
                System.arraycopy(arr, 0, arr, 1, length - 1);
                arr[0] = buffer;
            }
        }
        else if (num > 0)
        {
            for (int i = 0; i < num; i++)
            {
                int buffer = arr[0];
                System.arraycopy(arr, 1, arr, 0, length - 1);
                arr[length - 1] = buffer;
            }
        }

        System.out.println("Значение N = " + num);
        System.out.print("Массив после сдвига:\t" + Arrays.toString(arr) + "\n\n");
    }






}