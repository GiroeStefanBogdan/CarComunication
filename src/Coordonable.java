abstract class Coordonable {
    protected Coords coords = null;
    public Coords getCoords(){
        return this.coords;
    }
    public double calculateDistance(Coordonable object1, Coordonable object2){
        return (Math.sqrt(Math.pow(object1.getCoords().x - object2.getCoords().x,2) + Math.pow(object1.getCoords().y - object2.getCoords().y,2)));
    }
}
