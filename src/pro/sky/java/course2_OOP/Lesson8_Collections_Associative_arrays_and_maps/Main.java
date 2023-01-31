package pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps;

import pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.Driver.*;
import pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.Mechanic.Mechanic;
import pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.transport.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws IllegalTypeOfLicense {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN, new LicenseB("Vin Drosel", true, 12));
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN, new LicenseB("Ashot Catapetyan", true, 18));
        Car bMW = new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN, new LicenseB("Mazhoric"));


        Bus mAZ = new Bus("MAZ", "206015", 177.0, Bus.Size.LARGE, new LicenseD("Fabio Capelllo", true, 3));
        Bus volgabus = new Bus("Volgabus", "4298", 150.0, Bus.Size.SMALL, new LicenseD("Tutta Qanti", true, 3));
        Bus liAZ = new Bus("LiAZ", "4292 cursor", 210.0, Bus.Size.LARGE, new LicenseD("Pizhon"));

        Truck belaz = new Truck("Belaz", "75710", 3000.0, Truck.LoadCapacity.N3, new LicenseC("Night Raidovich"));
        Truck kAmAZ = new Truck("Kamaz", "6520", 400.0, Truck.LoadCapacity.N2, new LicenseC("Igor Petrovich", true, 10));
        Truck jAC = new Truck("JAC", "N120", 166.0, Truck.LoadCapacity.N1, new LicenseC("Jan Jack", true, 7));


        Mechanic<Transport<?>> murad = new Mechanic<>("Murad", "Shinkin");
        Mechanic<Transport<?>> michalych = new Mechanic<>("Michalych");
        Mechanic<Transport<?>> semenych = new Mechanic<>("Semenych", "Yedrion Baton");

        List<Transport<?>> forRace = List.of(ladaGranta, audiA8, bMW, mAZ, volgabus, liAZ, belaz, kAmAZ, jAC); //список машин для гонок
        Set<Driver> driverList = new HashSet<>();

        for (Transport<?> transport : forRace) {
            if (transport.getDriver() != null) {
                driverList.add(transport.getDriver());
            } else {
                System.out.println("Drivers not found");
            }
        }
        System.out.println(driverList.size());
        for (Driver driver : driverList) {
            if (driver != null) {
                System.out.println(driver.getFullName());
            }
        }
    }
}




       /* ServiceStation<Transport<?>> serviceStation = new ServiceStation<>();
        serviceStation.addTransport(forRace);

        System.out.println(serviceStation.gettQueue());
        serviceStation.doServiceInspection();
        System.out.println(serviceStation.gettQueue());*/






