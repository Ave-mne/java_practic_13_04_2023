package Lesson2;

public class MainClassFromHomeWork2 {
    public static void main(String[] args) {
        ex1();
        //ex2();
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
}
