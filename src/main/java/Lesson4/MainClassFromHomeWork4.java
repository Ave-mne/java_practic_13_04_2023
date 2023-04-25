package Lesson4;

import java.util.*;

public class MainClassFromHomeWork4 {
    public static void main(String[] args) {
        ex1();
        //ex2();
    }


//  1. Реализовать консольное приложение, которое:
//  Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
        List<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        while (!temp.toLowerCase().equals("quit")) {
            System.out.println("Введите строку:");
            temp = scanner.nextLine();
            if (temp.toLowerCase().equals("print")) {
                Collections.reverse(linkedList);
                System.out.println(linkedList);
                Collections.reverse(linkedList);
            } else if (temp.toLowerCase().equals("revert")) {
                if (!linkedList.isEmpty()) {
                    linkedList.remove(linkedList.size() - 1);
                    System.out.println(linkedList);
                } else {
                    System.out.println("Список пуст!!!");
                }
            } else {
                linkedList.add(temp);
            }
        }
        scanner.close();
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
