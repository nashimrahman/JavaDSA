package OOP.abstration;

public class Main {

    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
        b.sleep();

    }
    public static void main(String[] args) {
        doBirdStuff(new crow());
        doBirdStuff(new sparrow());




/*

        Bird b = new Bird(); -> can't create object
        Bird b = new sparrow();
        b.eat();
        b.fly();

        b = new crow();
        b.fly();
        b.eat();
*/


    }
}
