package Interface.Interface_Screencast;

public class Car implements Vehicle {

    public String transportType = "terrestrial";
    public int wheels;

    public Car(int _wheels) {
        this.wheels = _wheels;
    }

    @Override
    public String getTransportType() {
        return this.transportType;
    }

    @Override
    public boolean hasWheels() {
        return this.wheels > 0;
    }

    public int getNumberOfWheels() {
        return this.wheels;
    }
}
