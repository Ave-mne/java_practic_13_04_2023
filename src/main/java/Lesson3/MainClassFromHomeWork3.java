package Lesson3;

import java.util.*;

public class MainClassFromHomeWork3 {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }


    //1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
//Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    private static void ex1() {
        String[] integerStringArray = {"Яблоко", "11", "Апельсин", "17", "Дыня", "13"};
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("11");
        list.add("Апельсин");
        list.add("17");
        list.add("Дыня");
        list.add("13");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
            } catch (Exception e) {
            }
        }
        System.out.println(list);
    }

    //2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>>
// так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
//Пример:
//"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//"Детектив", "Десять негритят".
//"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
    private static void ex2() {

        Scanner iScanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();

        System.out.printf("Введите количество жанров:  ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.printf("Введите жанр книги: ");
            String genre = iScanner.nextLine();

            ArrayList<String> genreList = new ArrayList<>();
            genreList.add(genre);

            System.out.printf("Введите количество книг в жанре: ");
            int numberBook = Integer.parseInt(iScanner.nextLine());

            for (int j = 0; j < numberBook; j++) {
                System.out.printf("Введите название книги: ");
                String bookName = iScanner.nextLine();
                genreList.add(bookName);
            }


            bookList.add(genreList);
        }
        bookList.forEach(System.out::println);

    }
}


