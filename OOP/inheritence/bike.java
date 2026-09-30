package OOP.inheritence;

public class bike extends vehicle{
    private int noOfWheels;
    private int speed;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public bike(String type, String brand, int noOfWheels, int speed) {
        super(type, brand);
        this.noOfWheels = noOfWheels;
        this.speed = speed;
        
    }
}
