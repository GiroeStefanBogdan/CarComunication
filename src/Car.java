import java.util.UUID;

public class Car {
    private UUID ID;
    public String manufacturer;
    public String model;
    private float currentSpeed;
    private Coords coords;
    public Car(String manufacturer, String model, float x, float y){
        this.ID = UUID.randomUUID();
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentSpeed = 0;
        this.coords = new Coords(x,y);
    }
}
