package collectionFramework.ListInterface;
import java.util.*;

public class arrayList {
    static void main(String[] args) {

        //List or Collection -> interface
        Collection<Integer> c1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        System.out.println("List1: "+c1);
        System.out.println(c1.size());


        list.add(24);
        list.add(60);
        list.add(33);
        list.add(12);
        System.out.println("List2: "+list);

        // set() -> to change the element
        list.set(0,100);

        // adding all elements of list to list2
        list2.addAll(list);
        System.out.println("List3: "+list2);

        // remove elements at index
        list2.remove(1);
        System.out.println("List3: "+list2);

        // contains()
        System.out.println(list2.contains(24));

        // accessing elements using index
        System.out.println(list2.get(2));

        // printing using lambda
        list2.forEach(System.out::println);

        // removing all elements of list2
        list2.clear();
        System.out.println("List3: "+list2);

        // traversing using Iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // toArray() ->
        Object[] arr = list.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

        // contains() -> check if it contains this element
        System.out.println(list.contains(1000));

        // sort() -> sorting
        Collections.sort(list);
        System.out.println(list);


        // clone() -> to clone a list
        ArrayList<Integer> newList =(ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println("New List: "+newList);

        // ensureCapacity() -> to set the limit
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.ensureCapacity(100);







    }
}
