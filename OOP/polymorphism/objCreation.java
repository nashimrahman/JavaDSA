package OOP.polymorphism;

public class objCreation {
    static void main(String[] args) {
        car car1 = new car("BMW", "M-series",4,2);
        bike bike1 = new bike("RoyalEnfield", "classic",2);
//        car1.drive();
//        car1.getInfo();

        car car3 = new car();
        //polymorphism runtime
        drive(car1);
        drive(bike1);
        drive(car3);

    }

    public static void drive(vehicle v){
        v.drive();
    }


}
