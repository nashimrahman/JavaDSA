package OOP.inheritance2;

public class Employee {
    String name;
    int age;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }


}
