package Lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClassFromLessonFive {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }



    private static void ex1() {
        Map<String, String> employeeMAp = new HashMap<>(20);
        employeeMAp.put("1234", "Иванов");
        employeeMAp.put("1434", "Петров");
        employeeMAp.put("3434", "Романцев");

        // Вариант вывода 1
        //for (Map.Entry<String, String> entry: employeeMAp.entrySet()){
            //System.out.printf("%s\t->\t%s%n",entry.getKey(),entry.getValue());
        //}

        // Вариант вывода 2
        //for (String key: employeeMAp.keySet()){
            //System.out.printf("%s\t->\t%s%n",key ,employeeMAp.get(key));
       // }

        // Вариант вывода 3
        employeeMAp.forEach((key,value) -> {
            System.out.printf("%s\t->\t%s%n",key ,value);
        });

    }

    // 3. Написать метод, который переведет число из римского формата записи в арабский.
    // Например: MMXXII = 2022
    private static void ex2() {
        HashMap<Character, Integer> mapChars = new HashMap<>(7);
        mapChars.put('I',1);
        mapChars.put('V',5);
        mapChars.put('X',10);
        mapChars.put('L',50);
        mapChars.put('C',100);
        mapChars.put('D',500);
        mapChars.put('M',1000);
        System.out.print("Введите число в Римском формате: ");
        Scanner scanner = new Scanner(System.in);
        String romanNumber = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int currentRoman = mapChars.get(romanNumber.charAt(i));
            int prevRoman = i == 0 ? 0 : mapChars.get(romanNumber.charAt(i -1));
            if (i > 0 && currentRoman > prevRoman){
                result -= prevRoman;
                result += currentRoman - prevRoman;
            }
            else {
                result += currentRoman;
            }
        }
    System.out.printf("Арабское число: %s",result);

    }

}
