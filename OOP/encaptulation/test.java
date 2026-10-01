package OOP.encaptulation;

public class test {
    static void main(String[] args) {
        student student1 = new student(20,"ASTU", "Muskan", "Nashim");

        System.out.println(student1.name);
        System.out.println(student1.college);
        System.out.println(student1.getAge());

        student1.Chatting();
        student1.sleep();


    }
}
