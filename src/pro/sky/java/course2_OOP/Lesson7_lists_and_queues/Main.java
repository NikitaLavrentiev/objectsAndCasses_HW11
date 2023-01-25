package pro.sky.java.course2_OOP.Lesson7_lists_and_queues;

import pro.sky.java.course2_OOP.Lesson7_lists_and_queues.Driver.*;
import pro.sky.java.course2_OOP.Lesson7_lists_and_queues.Mechanic.Mechanic;
import pro.sky.java.course2_OOP.Lesson7_lists_and_queues.transport.*;

import java.util.ArrayList;
import java.util.List;


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

        /*ladaGranta.startMoving();
        ladaGranta.maxSpeed();
        ladaGranta.bestLapTime();


        mAZ.startMoving();
        belaz.startMoving();
        belaz.pitStop();

        LicenseB mazhoric = new LicenseB("Mazhoric");
        LicenseD pizhon = new LicenseD("Pizhon", true, 5);

        belaz.willParticipate(belaz.getDriver());
        ladaGranta.willParticipate(ladaGranta.getDriver());
        liAZ.willParticipate(liAZ.getDriver());
        kAmAZ.willParticipate(kAmAZ.getDriver());
        volgabus.willParticipate(pizhon);
        volgabus.willParticipate(volgabus.getDriver());*/

    /*    try { //нужно как-то облагородить, для того чтобы не прописывать каждый объект
            ladaGranta.passDiagnostics();
            bMW.passDiagnostics();
            mAZ.passDiagnostics();
            belaz.passDiagnostics();
        } catch (IllegalTypeOfLicense | UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Diagnostic is complete.");
        }*/


        List<Transport<?>> forRace = List.of(ladaGranta, audiA8, bMW, mAZ, volgabus, liAZ, belaz, kAmAZ, jAC); //список машин для гонок
        List<Driver> driverList = new ArrayList<>();
        for (Transport<?> car : forRace) {
            driverList.add(car.getDriver());
        } // идёт по списку и добавляет в список водителей, водителей из конструктора транспорта

        /*System.out.println(driverList);
*/
        Mechanic<Transport<?>> murad = new Mechanic<>("Murad", "Shinkin");
        Mechanic<Transport<?>> michalych = new Mechanic<>("Michalych");
        Mechanic<Transport<?>> semenych = new Mechanic<>("Semenych", "Yedrion Baton");

       /* murad.fixTheCar(ladaGranta, audiA8, bMW);
        michalych.performMaintenance(liAZ);
        belaz.addMechanics(murad, michalych, semenych);
        belaz.printCarTeamInfo();*/

        ServiceStation<Transport<?>> serviceStation = new ServiceStation<>();
        serviceStation.addTransport(forRace);

        System.out.println(serviceStation.gettQueue());
        serviceStation.doServiceInspection();
        System.out.println(serviceStation.gettQueue());



       /* serviceStation.doServiceInspection();*/
    }

}
