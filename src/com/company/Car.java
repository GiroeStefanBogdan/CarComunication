package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Car extends Coordonable {

    private UUID ID;
    public String manufacturer;
    public String model;
    private double currentSpeed;
    private ArrayList<EncounteredEvent> events = new ArrayList<EncounteredEvent>();
    private ArrayList<CarCommunicationData>  receiveData = new ArrayList<CarCommunicationData>();
    public Car(String manufacturer, String model, double x, double y, ArrayList<EncounteredEvent> events){
        this.ID = UUID.randomUUID();
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentSpeed = 0;
        this.coords = new Coords(x,y);
        this.events = CloseEventsProvider.check(this,events, 100);

    }

    public void setCurrentSpeed(double speed){
        this.currentSpeed = speed;
    }

    public Car closestCar(Car[] cars){
        Car closestCar = null;
        for (Car car: cars) {
            if(car != this){
                if(closestCar == null){
                    closestCar = car;
                }
                if(this.calculateDistance(closestCar)>this.calculateDistance(car)){
                    closestCar = car;
                }
            }
        }
        return closestCar;
    }

    public void receiveData(CarCommunicationData data){
        if(data.ID == this.ID){
            return;
        }
        this.receiveData.add(data);
    }

    public void sendData(Car car){
        CarCommunicationData data = new CarCommunicationData(
                this.ID,
                this.manufacturer,
                this.model,
                this.currentSpeed,
                this.coords,
                this.events
        );
        car.receiveData(data);
    }

    public UUID getID() {
        return ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public ArrayList<EncounteredEvent> getEvents() {
        return events;
    }

    public ArrayList<CarCommunicationData> getReceiveData() {
        return receiveData;
    }
}
