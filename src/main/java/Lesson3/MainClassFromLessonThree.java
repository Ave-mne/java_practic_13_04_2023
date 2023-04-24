package Lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClassFromLessonThree {
    public static void main(String [] args){
        //ex1();
        //ex2();
        ex3();
    }




    // Создать список из произвольных чисел и отсортировать его
    private static void ex1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 50; i++){
            list.add(random.nextInt(100));
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }


// Заполнить список названием планет Солнечной сиситемы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
    private static void ex2() {
        String[] planetNamesStringArray = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Neptune","Uranus","Plyto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            list.add(planetNamesStringArray[random.nextInt(0,9)]);
        }
        list.sort(Comparator.naturalOrder());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;  i < planetNamesStringArray.length ; i++) {
            count = 0;
            for (var item:
                    list){
                if (item.equals(planetNamesStringArray[i]))
                    count++;
            }

        sb.append(planetNamesStringArray[i]).append(": ").append(count).append("\n");
        }
        System.out.println(sb);
    }


// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы
    private static void ex3() {
        String[] planetNamesStringArray = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Neptune","Uranus","Plyto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            list.add(planetNamesStringArray[random.nextInt(planetNamesStringArray.length)]);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        List<String> listWithoutDuplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(listWithoutDuplicates);

    }





}
