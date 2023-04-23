package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClassFromLessonTwo {
    public static void main(String[] args) {
//        task17042("aaaabbbcdd");
        ex5("X:\\Ya.Disk\\work\\Lessons\\java-practic20230413");
    }

    private static void ex5(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/filesNames.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ex1() {
        char firstSymbol = 'A';
        char secondSymbol = '_';
        StringBuilder sb = new StringBuilder();
        int n = 7;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(firstSymbol);
            } else {
                sb.append(secondSymbol);
            }
        }
        System.out.println(sb);
    }

    private static void ex2() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char prev = longString.charAt(0);
        char curr = prev;
        int counter = 1;

        for (int i = 1; i < longString.length(); i++) {
            prev = longString.charAt(i - 1);
            curr = longString.charAt(i);
            if (prev != curr) {
                shortStringSB.append(prev);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        shortStringSB.append(curr);
        shortStringSB.append((counter > 1) ? counter : "");

        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }

    public static void task17042(String input) {
        //Напишите метод, который сжимает строку.
        //Пример: вход aaaabbbcdd.
        input += " ";

        char[] array = input.toCharArray();
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            char check = array[i];

            if (check != array[i + 1]) {
                result.append(check);
                if (count != 1) {
                    result.append(count);
                }
                count = 0;
            }
            count++;

        }
        System.out.println(result);
    }

    public static boolean isPolindrome(String inputStr) {
        inputStr = inputStr.toLowerCase()
                .replace(" ", "")
                .replace("-","");
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != (inputStr.charAt(inputStr.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

}
