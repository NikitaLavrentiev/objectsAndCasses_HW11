package pro.sky.java.course2.Lesson3_inheritanceOOP;

import pro.sky.java.course2.Lesson3_inheritanceOOP.transport.Car;
import pro.sky.java.course2.Lesson3_inheritanceOOP.transport.Transport;

public class Main {

    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta", 2015, "Russia" , "yellow", 0, 1.7, "auto","",0, 5,false, new Car.Key(false, true));
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "black", 0, 3.0, "auto","",0, 5,false, new Car.Key(true,false));
        Car bMW = new Car("BMW", "Z8", 2021, "Germany", "black",0 , 3.0,"auto","",0, 5,true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4th gen", 2018, "South Korea", "red", 0, 2.4,"auto","",0, 5,true, new Car.Key(false, false));
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "South Korea", "orange",0, 1.6,"auto","",0, 5,false, new Car.Key(false, true));
        Car empty = new Car("","",-1000,"","",0,0,"auto","",0, 5,false, new Car.Key());

        System.out.println(ladaGranta.toString());
        ladaGranta.changeTiresForSeason();
        System.out.println(ladaGranta);


        System.out.println(empty);
        System.out.println(empty.getBrand());

    }
}
