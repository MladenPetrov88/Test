package Task6;

public class Car {
    String carModel;
    String carSpeed;

    public Car (String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.carModel, this.carSpeed);
    }
}
