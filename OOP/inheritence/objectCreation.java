package OOP.inheritence;

public class objectCreation {
    static void main(String[] args) {
        vehicle v1 = new vehicle("vehicle", "brand");
        v1.drive();

        car c1 = new car("CAR", "BMW", 4, 120);
        c1.drive();
        c1.getVehicleInfo();

        bike b1 = new bike("BIKE", "RoyalEnfield", 4, 120);
        b1.drive();
        b1.getVehicleInfo();

        vehicle v3 = new car("CAR", "Audi", 5, 180);
        //method overriding (runtime polymorphism)
        v3.drive();

        //method overloading (compile time polymorphism)
        c1.drive("hello");


    }
}
