package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

public class MainClassFromHomeWork2 {
    public static void main(String[] args) {
        //ex1();
        ex2();
}



// 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример 1:
// Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"
// Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
// Пример 2:
// Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
// Результат: SELECT * FROM USER;

    private static void ex1() {
        StringBuilder initialRequest = new StringBuilder("SELECT * FROM students WHERE ");
        String newRequest = "{\"name:Ivanov\", \"country:Russia\", \"city:Moscow\", \"age:null\"}";
        newRequest.replace(":", "=");
        char[] strToArray = newRequest.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] != '\"' && strToArray[i] != '{' && strToArray[i] != '}') {
                temp.append(strToArray[i]);
            }
        }
        String tempStr = temp.toString();

        char[] transform = newRequest.toCharArray();
        StringBuilder res = new StringBuilder();
        String[] subStr;
        subStr = tempStr.split(",");
        for(String line : subStr){
            if(!(line.contains("null"))){
                res.append(line.replace(":", " = '") + "' AND ");
            }
        }
        if (res.length()>4){
            res.delete(res.length()-4, res.length()-1);
        }
        System.out.println(initialRequest + res.toString());
    }


// 2.Напишите метод, который определит тип (расширение) файлов из текущей папки и
// выведет в консоль результат вида:
//    1 Расширение файла: txt
//    2 Расширение файла: pdf
//    3 Расширение файла:
//    4 Расширение файла: jpg

    private static void ex2() {
        File file = new File("C:\\Users\\Андрей\\IdeaProjects\\java_practic_13_04_2023\\Example");
        for (String fileName : Objects.requireNonNull(file.list())){
            String str = fileName;
            String extension = "";

            if (str.contains("."))
                extension = str.substring(str.lastIndexOf(".") + 1);
            System.out.println("Расширение файла: " + extension);

            }
        }
}








