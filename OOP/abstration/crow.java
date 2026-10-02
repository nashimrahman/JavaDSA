package OOP.abstration;

public class crow extends Bird{
    @Override
    void fly() {
        System.out.println("crow flying");
    }

    @Override
    void eat() {
        System.out.println("crow eating");
    }
}
