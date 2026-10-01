package OOP.basics;

public class Creatingobject {
    static void main(String[] args) {
        car bmw= new car("RED","BMW i3","BMW", 980000,120);

        bmw.drive();
        bmw.noOfDoors=4;
        System.out.println(bmw.getColor());

        car audi = new car(bmw);
        System.out.println(audi.color);
        System.out.println(audi.brand);
        System.out.println(audi.name);





    }
}
