package OOP.encaptulation;

public class student {
    public String name;
    private int age;
    private String gfName;
    public String college;

    public student(int age, String college, String gfName, String name) {
        this.age = age;
        this.college = college;
        this.gfName = gfName;
        this.name = name;
    }

    public void Chatting(){
        System.out.println(name +"is chatting");
    }

    public void sleep(){
        System.out.println("sleeping");
    }

    //get and set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGfName() {
        return gfName;
    }

    public void setGfName(String gfName) {
        this.gfName = gfName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }









}
