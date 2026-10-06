package collectionFramework.queueInterface;

import java.util.*;

public class arrayDequeue {
    static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

//        q.getFirst() -> this method is for Dequeue
        Deque<Integer> d = new ArrayDeque<>();
        d.offer(20);
        d.offer(30);
        d.offer(50);




    }
}
