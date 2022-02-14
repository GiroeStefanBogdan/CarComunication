public class EncounteredEvent extends Coordonable{
    public String name;
    public EncounteredEvent(String name, float x, float y){
        this.name = name;
        this.coords = new Coords(x, y);
    }
}
