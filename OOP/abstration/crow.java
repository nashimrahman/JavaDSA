package OOP.abstration;

public class crow implements Bird{
    @Override
    public void fly() {
        System.out.println("crow flying");
    }

    @Override
    public void eat() {
        System.out.println("crow eating");
    }
}
