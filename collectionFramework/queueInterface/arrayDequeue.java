package collectionFramework.queueInterface;

import java.util.*;

public class arrayDequeue {
    static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
        System.out.println(q.size());

//        q.getFirst() -> this method is for Dequeue
        Deque<Integer> d = new ArrayDeque<>();
        d.offer(20);
        d.offerFirst(30);
        d.offerLast(50);

        System.out.println(d);

        System.out.println("Removing: "+d.pollLast());
        System.out.println(d);

        System.out.println(d.size());

        System.out.println("Peeking: "+d.peekFirst());
        System.out.println(d);




    }
}
