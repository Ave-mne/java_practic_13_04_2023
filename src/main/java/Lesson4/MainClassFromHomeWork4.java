package Lesson4;

import java.util.LinkedList;
import java.util.Random;

public class MainClassFromHomeWork4 {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }


//  1. Реализовать консольное приложение, которое:
//  Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
    }


//  2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static void ex2() {
        LinkedList<Integer> ll = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ll.add(random.nextInt(20));
        }
        System.out.println(ll);

        for (int i = 0; i < 10; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }



}
