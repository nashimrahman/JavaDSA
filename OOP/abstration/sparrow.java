package OOP.abstration;

class sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("sparrow flying");
    }

    @Override
    void eat() {
        System.out.println("sparrow eating");
    }

}