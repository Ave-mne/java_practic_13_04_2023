package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClassFromHomeWork3 {
    public static void main(String [] args){
        ex1();
        //ex2();
    }



//1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
//Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    private static void ex1() {
        String[] integerStringArray = {"Яблоко","11","Апельсин","17","Дыня","13"};
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
            } catch (Exception e) {}
        }
        System.out.println(list);
    }



}
