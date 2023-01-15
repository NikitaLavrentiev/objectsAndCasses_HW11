package pro.sky.java.course2.Lesson2_encapsulationOOP;

import pro.sky.java.course2.Lesson2_encapsulationOOP.transport.Car;

public class Main {

    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta", 2015, "Россия" , "желтый",  1.7, "auto","",0, 5,true, new Car.Key(false, true));
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "чёрный", 3.0, "auto","",0, 5,true, new Car.Key(true,false));
        Car bMW = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0,"auto","",0, 5,true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная корея", "красный", 2.4,"auto","",0, 5,true, new Car.Key(false, false));
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная корея", "орнжевый", 1.6,"auto","",0, 5,true,new Car.Key(false, true));
        Car empty = new Car("","",-1000,"","",0,"auto","",0, 5,true,new Car.Key());
        Car test = new Car("test", "", 0, 2000);
        System.out.println(test);

        System.out.println(ladaGranta.toString());


        System.out.println(empty);
        System.out.println(empty.getBrand());

    }
}
