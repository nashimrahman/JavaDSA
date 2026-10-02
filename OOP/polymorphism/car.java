package OOP.polymorphism;

public class car extends vehicle{
    int noOfseats;

    public car(){};
    public car(String brand, String model, int nOfDoors, int noOfseats) {
        super(brand, model, nOfDoors);
        this.noOfseats = noOfseats;
    }
    @Override
    public void drive(){
        System.out.println(getBrand() + " is driving");

    }




}
