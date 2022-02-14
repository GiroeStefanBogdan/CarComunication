package com.company;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

public class CarCommunicationData {
    public UUID ID;
    public String manufacturer;
    public String model;
    public double currentSpeed;
    public Coords coords;
    public ArrayList<EncounteredEvent> events;
    public Timestamp timestamp;

    public CarCommunicationData(UUID ID, String manufacturer, String model, double currentSpeed, Coords coords, ArrayList<EncounteredEvent> events){
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.coords = coords;
        this.events = events;
        this.timestamp = new Timestamp(System.currentTimeMillis());//Momentul in care au fost trimise datele
    }
}
