package com.company;

import java.util.ArrayList;

public class CloseEventsProvider {
    public static ArrayList<EncounteredEvent> check(Car car, ArrayList<EncounteredEvent>  events, double distance){
        ArrayList<EncounteredEvent> closeEvents = new ArrayList<EncounteredEvent>();
        for (EncounteredEvent event: events) {
            if(car.calculateDistance(event)<=distance){
                  closeEvents.add(event);
            }
            
        }
        return closeEvents;
    }
}
