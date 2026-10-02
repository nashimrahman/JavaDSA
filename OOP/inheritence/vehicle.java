package OOP.inheritence;

public class vehicle {

    //attributes
    private String brand;
    private String type;

    //default constructor
    public vehicle() {
    }

    //parameterized constructor
    public vehicle(String type, String brand) {
        this.brand = brand;
        this.type = type;
    }

    //methods
    protected void drive(){
        System.out.println(brand+" is Driving...\n");
    }

    public void getVehicleInfo(){
        System.out.println("Brand: " + getBrand()+"\n");
    }






    //getter and setter
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

}
