package pro.sky.java.course2_OOP.Lesson6_exceptions;

import pro.sky.java.course2_OOP.Lesson6_exceptions.Driver.*;
import pro.sky.java.course2_OOP.Lesson6_exceptions.transport.Bus;
import pro.sky.java.course2_OOP.Lesson6_exceptions.transport.Car;
import pro.sky.java.course2_OOP.Lesson6_exceptions.transport.Transport;
import pro.sky.java.course2_OOP.Lesson6_exceptions.transport.Truck;


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


        try { //нужно как-то облагородить, для того чтобы не прописывать каждый объект
            ladaGranta.passDiagnostics();
            bMW.passDiagnostics();
            mAZ.passDiagnostics();
            belaz.passDiagnostics();
        } catch (IllegalTypeOfLicense | UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Diagnostic is complete.");
        }
    }

}
