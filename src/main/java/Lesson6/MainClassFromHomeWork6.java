package Lesson6;

import java.util.*;


public class MainClassFromHomeWork6 {


//      Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//      Создать множество ноутбуков.
//      Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//      отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//      “Введите цифру, соответствующую необходимому критерию:
//      1 - ОЗУ
//      2 - Объём ЖД
//      3 - Операционная система
//      4 - Цвет …
//      Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно в Map.
//      Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.



    public static void main(String[] args) {
        Laptop laptop = new Laptop ();
        Laptop laptop1 = new Laptop(1,"белый", "windows10", 16, "HDD", 256 );
        laptop.addToBase(laptop1);
        Laptop laptop2 = new Laptop(2,"серый","linux", 32,"SSD",512);
        laptop.addToBase(laptop2);
        Laptop laptop3 = new Laptop();
        laptop3.setId(3);
        laptop3.setColor("черный");
        laptop3.setOs("NoOs");
        laptop3.setRam(8);
        laptop3.setDiscType("HDD");
        laptop3.setDiscVolume(1024);
        laptop.addToBase(laptop3);
        laptop.findInBase(laptop.laptopBase);
        }
    }



    class Laptop {
        private int id;
        private String color;
        private String os;
        private int ram;
        private String discType;
        private int discVolume;
        public Map<Integer, String[]> laptopBase = new HashMap<Integer, String[]>();

        public Laptop(int id, String color, String os, int ram, String discType, int discVolume) {
            this.id = id;
            this.color = color;
            this.os = os;
            this.ram = ram;
            this.discType = discType;
            this.discVolume = discVolume;
        }

        public Laptop() {
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public int getDiscVolume() {
            return discVolume;
        }

        public void setDiscVolume(int discVolume) {
            this.discVolume = discVolume;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }



        public void setOs(String os) {
            this.os = os;
        }
        public String getOs() {
            return os;
        }
        public String getDiscType() {
            return discType;
        }

        public void setDiscType(String discType) {
            this.discType = discType;
        }

        @Override
        public String toString() {
            return color + " " + os + " " + ram + " " + discType + " " + discVolume;
        }

        public Map addToBase(Laptop newLaptop) {
            String [] x = newLaptop.toString().split(" ");
            laptopBase.put(newLaptop.getId(),x);
            return laptopBase;
        }

        public void findInBase(Map<Integer, String[]> laptopBase) {
            int findID;
            String Condition;
            Scanner input = new Scanner(System.in);
            System.out.println("Введите параметр для поиска: 1-цвет, 2-Операционная система, 3 - Объем оперативной памяти, " +
                    "4- Тип жесткого диска, 5-объем жесткого диска");
            findID = input.nextInt();
            System.out.println("Введите условие для поиска");
            Condition = input.next();
            for (int i = 1; i <= laptopBase.size(); i++) {
                if ((Arrays.asList(laptopBase.get(i)).get(findID-1).contains(Condition))) {
                    System.out.println(Arrays.asList(laptopBase.get(i)));
                }
            }
        }
    }