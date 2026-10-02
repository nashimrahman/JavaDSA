package OOP.inheritence;

public class car extends vehicle{
    //attributes
    private int noOfWheels;
    private int speed;

    //constructor
    car(){};
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

    //runtime polymorphism-> drive method is in both vehicle and car class,
    // so it is decided in the runtime to decide which method should call
    @Override
    protected void drive() {
        System.out.println(getBrand()+" is Driving...\n");
    }

    public void drive(String Greet) {
        System.out.println("Car is Driving... "+Greet);

    }
}
