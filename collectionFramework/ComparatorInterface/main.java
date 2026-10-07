package collectionFramework.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(20, "Nashim", 52));
        list.add(new Student(22, "Dron", 60));
        list.add(new Student(19, "Aryan", 55));
        list.add(new Student(17, "Akash", 47));
        list.add(new Student(20, "Bhondu", 40));


        System.out.println(list);
        System.out.println();

        // we have to define our own sorting logic using comparable interface
//        Collections.sort(list);  // sorting by comparable
//        System.out.println();

        // or we can use comparator
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight- o2.weight;
//            }
//        });



        // it is recommended to define logic by creating different class
        System.out.println();
        Collections.sort(list, new weightComparator());







        System.out.println(list);
    }
}
