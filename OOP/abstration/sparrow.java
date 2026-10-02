package OOP.abstration;

class sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("sparrow eating");
    }

}