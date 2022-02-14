package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ArrayList<EncounteredEvent> events = new ArrayList<EncounteredEvent>(Arrays.asList(
                new EncounteredEvent("Accident", 768.4, 1235.6),
                new EncounteredEvent("Accident", 457.09, 576.8),
                new EncounteredEvent("Police Check", 345.67, 785.6),
                new EncounteredEvent("Police Check", 234.9, 895.3),
                new EncounteredEvent("Closed road", 895.53, 235),
                new EncounteredEvent("Closed road", 324.67, 789.7)
        ));


        Car[] cars = {
                new Car("Audi", "A4", 765.34, 454.45, events),
                new Car("BMW", "X5", 100.6, 700, events),
                new Car("Opel", "Astra G", 400, 500.76,events),
                new Car("Opel", "Zafira", 67.54, 4.5, events),
                new Car("Tesla", "Model X", 99.2, 799.54, events)
        };
        //Prima masina trimite datele ei catre toate masinile
        for (Car car: cars) {
            cars[0].sendData(car);
        }
        for (Car car: cars) {
            System.out.println("ID: " + car.getID());
            System.out.println("Manufacturer: " + car.getManufacturer());
            System.out.println("Model: " + car.getModel());
            System.out.println("currentSpeed: " + car.getCurrentSpeed());
            System.out.println("Coords: x = " + car.getCoords().x + " y = " + car.getCoords().y);
            System.out.println("================================= CLOSE EVENTS ======================================");
            for (EncounteredEvent event : car.getEvents()) {
                System.out.println(event.name + " x = " + event.coords.x + " y = " + event.coords.y + "(distance: " + car.calculateDistance(event) + ")");
            }
            System.out.println("=================================== RECEIVED DATA  ==================================");
            for(CarCommunicationData data: car.getReceiveData()){
                System.out.println("Car ID: " + data.ID + " x = " + data.coords.x + " y = " + data.coords.y + " | " + new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(data.timestamp));
            }
            System.out.println("======================================================================================");
        }
    }
}
