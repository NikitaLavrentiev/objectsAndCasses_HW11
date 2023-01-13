package pro.sky.java.course2.Lesson2_encapsulationOOP;

import pro.sky.java.course2.Lesson2_encapsulationOOP.transport.Car;

public class Main {

    public static void main(String[] args) {
        //Создайте объекты для следующих автомобилей:
        //
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        //Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики.
        Car ladaGranta = new Car("Lada","Granta", 2015, "Россия" , "желтый",  1.7, "auto","",0, 5,true);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "чёрный", 3.0, "auto","",0, 5,true);
        Car bMW = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0,"auto","",0, 5,true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная корея", "красный", 2.4,"auto","",0, 5,true);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная корея", "орнжевый", 1.6,"auto","",0, 5,true);
        Car empty = new Car("","",-1000,"","",0,"auto","",0, 5,true);

        System.out.println(ladaGranta.toString());
        System.out.println(empty);
        System.out.println(empty.getBrand());


    }
}
