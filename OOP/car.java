package OOP;

public class car {
    String color;
    String name;
    String brand;
    int price;
    int speed;
    int noOfDoors=4;

    // default constructor
    public car(){}

    // perameterised constructor
    public car(String color, String name, String brand, int price, int speed) {
        this.color = color;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    // copy constructor
    public car(car copyConstructor){
        System.out.println("Copy constructor is called");
        this.color = copyConstructor.color;
        this.name = copyConstructor.name;
        this.brand = copyConstructor.brand;
        this.price = copyConstructor.price;
        this.speed = copyConstructor.speed;
    }

    public void drive(){
        System.out.println(brand+" is driving at "+ speed +"km/h");
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
