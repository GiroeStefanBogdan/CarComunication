package com.company;

abstract class Coordonable {
    protected Coords coords = null;
    public Coords getCoords(){
        return this.coords;
    }
    public double calculateDistance(Coordonable object){
        return (Math.sqrt(Math.pow(this.getCoords().x - object.getCoords().x,2) + Math.pow(this.getCoords().y - object.getCoords().y,2)));
    }
}
