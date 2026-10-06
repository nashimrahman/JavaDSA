package collectionFramework.queueInterface;

import java.util.*;

public class queueDataStructure {
    static void main(String[] args) {
        // Queue interface
        Queue<Integer> q= new LinkedList<>();
        q.offer(20);
        q.offer(30);
        q.offer(50);

        System.out.println(q);

        System.out.println("removing: " + q.poll());

        System.out.println(q);

        System.out.println("peeking: " + q.peek());

        System.out.println(q);
        System.out.println();

        //Dequeue
        Deque<Integer> d= new LinkedList<>();
        d.offer(20);
        d.offer(30);
        d.offer(50);


        System.out.println(d);

        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.remove(20);
        System.out.println(d);


    }


}
