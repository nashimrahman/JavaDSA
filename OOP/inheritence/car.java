package OOP.inheritence;

public class car extends vehicle{
    //attributes
    private int noOfWheels;
    private int speed;

    //constructor
    public car(String type, String brand, int noOfWheels, int speed) {
        super(type, brand);
        this.noOfWheels = noOfWheels;
        this.speed = speed;
    }

    //getter and setter
    public int getNoOfWheels() {
        return noOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //methods
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
