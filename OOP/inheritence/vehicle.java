package OOP.inheritence;

public class vehicle {

    private String brand;
    private String type;

    public vehicle() {
    }

    public vehicle(String type, String brand) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.type = model;
    }

    public void drive(){
        System.out.println("Vehicle is Driving...\n");
    }

    public void getVehicleInfo(){
        System.out.println("Brand: " + getBrand()+"\n");
    }

}
