package Lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainClassFromHomeWork5 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }



    // 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    private static void ex1() {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<>();
        Map<Integer, String> nameBook = new HashMap<>();
        nameBook.put(0, "Иванов А.А.");
        nameBook.put(1, "Петров С.А.");
        nameBook.put(2, "Сидоров А.К.");
        for (int i = 0; i < nameBook.size();i++){
            if (phoneBook.get(i)==null){
                phoneBook.put(i, new ArrayList<>());
                phoneBook.get(i).add("8-965-454-00-"+i+i+";"+"8-920-855-01-"+i+i);
            }
            System.out.println("Телефонные номера абонента"+" "+nameBook.get(i)+" :"+phoneBook.get(i));
        }
    }

// 2.Пусть дан список сотрудников:
// Иван Иванов // Светлана Петрова // Кристина Белова
// Анна Мусина // Анна Крутова // Иван Юрин
// Петр Лыков // Павел Чернов // Петр Чернышов
// Мария Федорова // Марина Светлова // Мария Савина
// Мария Рыкова // Марина Лугова // Анна Владимирова
// Иван Мечников // Петр Петин // Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
    private static void ex2() {
        HashMap<String, Integer> freqMap = new HashMap<>();
        HashMap<String, String> dataMap = new HashMap<>();
        int bubblesBufferForValues;
        String bubblesBufferForKeys;
        dataMap.put("Иванов", "Иван");
        dataMap.put("Петрова", "Светлана");
        dataMap.put("Белова", "Кристина");
        dataMap.put("Мусина", "Анна");
        dataMap.put("Крутова", "Анна");
        dataMap.put("Юрин", "Иван");
        dataMap.put("Лыков", "Петр");
        dataMap.put("Чернов", "Павел");
        dataMap.put("Чернышов", "Петр");
        dataMap.put("Федорова", "Мария");
        dataMap.put("Светлова", "Марина");
        dataMap.put("Савина", "Мария");
        dataMap.put("Рыкова", "Мария");
        dataMap.put("Лугова", "Марина");
        dataMap.put("Владимирова", "Анна");
        dataMap.put("Мечников", "Иван");
        dataMap.put("Петин", "Петр");
        dataMap.put("Ежов", "Иван");
        for (String name : dataMap.values()) {
            if (!freqMap.containsKey(name)) {
                if (Collections.frequency(dataMap.values(), name) > 1) {
                    freqMap.put(name, Collections.frequency(dataMap.values(), name));
                }
            }
        }
        System.out.println(freqMap);
        ArrayList<Integer> sortedListValues = new ArrayList<>(freqMap.values());
        ArrayList<String> sortedListKeys = new ArrayList<>(freqMap.keySet());
        for (int i = 0; i < sortedListValues.size(); i++) {
            for (int j = 1; j < sortedListValues.size(); j++) {
                if (sortedListValues.get(j) > sortedListValues.get(j-1)) {
                    bubblesBufferForValues = sortedListValues.get(j-1);
                    sortedListValues.set((j-1),sortedListValues.get(j));
                    sortedListValues.set((j),bubblesBufferForValues);
                    bubblesBufferForKeys = sortedListKeys.get(j-1);
                    sortedListKeys.set((j-1),sortedListKeys.get(j));
                    sortedListKeys.set((j),bubblesBufferForKeys);
                }
            }
        }
        System.out.println("Популярность имен по убыванию имеет вид:");
        for (int i = 0; i < sortedListValues.size(); i++) {
            System.out.println("Имя "+ sortedListKeys.get(i) + " имеет популярность = "+ sortedListValues.get(i));
        }
    }

// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
    public static void ex3(){
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = arr.length;

    MainClassFromHomeWork5 ob = new MainClassFromHomeWork5();
    ob.sort(arr);

    System.out.println("Отсортированный массив: ");
    printArray(arr);
}
    public void sort (int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

// 4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    private static void ex4() {
        int[] queens = new int[8];
        findPosition(0, queens);

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" o ");
                }
            }
            System.out.println();
        }
    }

    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) {
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col;
                if (findPosition(row + 1, queens)) {
                    return true;
                }
            }
        }
        return false;
    }



}
