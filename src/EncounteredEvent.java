public class EncounteredEvent {
    public String name;
    public Coords coords;
    public EncounteredEvent(String name, float x, float y){
        this.name = name;
        this.coords = new Coords(x, y);
    }
}
