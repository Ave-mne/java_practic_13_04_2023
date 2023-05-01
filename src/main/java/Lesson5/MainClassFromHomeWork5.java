package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassFromHomeWork5 {
    public static void main(String[] args) {
        ex1();
        //ex2();
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
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
    private static void ex2() {
    }

}
