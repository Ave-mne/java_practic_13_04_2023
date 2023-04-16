package Lesson1;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;



public class MainClassFromLessionOne {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6("Kate\tSmith\t20\nLena\tTyrina\t34");
    }



    private static void ex1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }

    private static void ex2() {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
        int maxLength = 0;
        int currentLength = 0;
        for (int num : arr) {
            if (num == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }
        System.out.printf("Max length 1: %s%n", Math.max(currentLength, maxLength));
    }

    private static void ex3() {
        int[] arr = new int[]{3, 2, 3, 2, 3};
        int VAL = 3;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[right] == VAL) {
                right--;
            } else if (arr[left] != VAL) {
                left++;
            } else {
                arr[left] = arr[right];
                arr[right] = VAL;

                right--;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex4() {
        String str = "Добро пожаловать на курс Java";
        String[] words = str.split(" ");
        String temp = "";
        for (int i = 0; i < words.length / 2; i++) {
            temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        for (String j : words) {
            System.out.print(j + " ");
        }
    }

    private static void ex5() {
        int a = 3;
        int b = 2;
        System.out.println(Math.pow(a,b));
    }

    private static void ex6(String str) {
        try (FileWriter fw = new FileWriter("Java_l1.txt", Charset.forName("UTF-8"), false)) {
            fw.write("Name\tSurname\tAge\n");
            fw.append(str);
            fw.flush();
        }
        catch (Exception ex){
            System.out.println("Some error" + ex.getMessage());

        }
    }



}