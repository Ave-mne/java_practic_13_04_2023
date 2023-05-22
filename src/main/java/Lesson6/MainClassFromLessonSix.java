package Lesson6;

import java.util.*;

public class MainClassFromLessonSix {
    public static void ex1(String[] args) {
        MainClassFromLessonSix task = new MainClassFromLessonSix();
        task.initHashSet();
        task.initLinkedHashSet();
        task.initTreeSet();
    }

// Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
    public void initHashSet() {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(3);
        System.out.println("HashSet: " + num);
    }

// Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
    public void initLinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println("LinkedHashSet: " + set);
    }

// Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
    public void initTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println("TreeSet: " + set);
    }



// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public static void ex2(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter min for random: ");
        int min = input.nextInt();
        System.out.println("Enter max for random: ");
        int max = input.nextInt();
        System.out.println("Enter size for list: ");
        int s = input.nextInt();
        input.close();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers = getRandomArrayList(s, min, max);
        System.out.println(numbers);

        Set <Integer> set = new HashSet<Integer>(numbers);
        System.out.println(set);

        System.out.printf("Процент уникальных чисел: %f%s", procentUnicalNumber(numbers.size(), set.size()), "%");

    }

    static int getRandomNumberInt(int minimum, int maximum) {
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }

    static ArrayList<Integer> getRandomArrayList(int size, int minimum, int maximum) { // создаем рандомный массив
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static Double procentUnicalNumber(int size1, int size2) {
        double res = (double)size2 * 100 / (double)size1;
        return res;
    }
}