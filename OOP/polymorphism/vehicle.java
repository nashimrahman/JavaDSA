package OOP.polymorphism;

public class vehicle {
    private String brand;
    private String model;
    private int nOfTyres;

    public vehicle(){
    }

    public vehicle(String brand, String model, int nOfTyres) {
        this.brand = brand;
        this.model = model;
        this.nOfTyres = nOfTyres;
    }

    public void getInfo(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getNoOfDoors());
    }

    public void drive(){
        System.out.println(brand+ "is driving");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNoOfDoors() {
        return nOfTyres;
    }
}
