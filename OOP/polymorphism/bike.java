package OOP.polymorphism;

public class bike extends vehicle{
    public bike(){};
    public bike(String brand, String model, int nOfTyres) {
        super(brand, model, nOfTyres);
    }

    @Override
    public void drive(){
        System.out.println(getBrand()+" is driving...");
    }
}
