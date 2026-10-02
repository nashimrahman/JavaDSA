package OOP.polymorphism;

public class objCreation {
    static void main(String[] args) {
        car car1 = new car("BMW", "M-series",2,2);
        car1.drive();
        car1.getInfo();

        //polymorphism runtime
        car car2 = new car();
        drive(car2);

    }

    public static void drive(vehicle v){
        System.out.println("driving");
    }


}
