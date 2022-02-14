package com.company;

import com.company.Coordonable;

public class EncounteredEvent extends Coordonable {
    public String name;
    public EncounteredEvent(String name, double x, double y){
        this.name = name;
        this.coords = new Coords(x, y);
    }
}
