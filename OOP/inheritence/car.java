package OOP.inheritence;

public class car extends vehicle{
    private int noOfWheels;
    private int speed;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public car(String type, String brand, int noOfWheels, int speed) {
        super(type, brand);
        this.noOfWheels = noOfWheels;
        this.speed = speed;
    }

    @Override
    public void getVehicleInfo() {
        System.out.println(getBrand()+" "+getType());
    }

    @Override
    public void drive() {
        System.out.println("Car is Driving...\n");
    }

    public void drive(String Greet) {
        System.out.println("Car is Driving... "+Greet);

    }
}
