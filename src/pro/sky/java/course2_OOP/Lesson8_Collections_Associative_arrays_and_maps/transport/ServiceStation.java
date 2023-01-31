package pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.transport;


import pro.sky.java.course2_OOP.Lesson8_Collections_Associative_arrays_and_maps.Driver.IllegalTypeOfLicense;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation<T extends Transport<?>> {
    private final Queue<T> tQueue = new LinkedList<>();
    private final List<T> x = new ArrayList<>();

    public ServiceStation() {
    }

    public void addTransport(List<T> x) {
        int i = 0;
        for (T transport : x
        ) {
            if (x.get(i) != null) {

                tQueue.offer(x.get(i));
            } else {
                System.out.println("List is empty");
            }
        }
    }

    public void doServiceInspection() throws UnsupportedOperationException, IllegalTypeOfLicense {
        T auto = gettQueue().poll();
        if (auto != null) {

            auto.passDiagnostics();
            System.out.println(auto.getMechanicsList() + " carry out a technical inspection of the car " + auto.getModel() + " " + auto.getBrand());
            System.out.println(auto.getBrand() + " " + auto.getModel() + " completed diagnostics.");
            doServiceInspection();
        } else {
            System.out.println("No cars found.");
        }
    }

    public Queue<T> gettQueue() {
        return tQueue;
    }
}
