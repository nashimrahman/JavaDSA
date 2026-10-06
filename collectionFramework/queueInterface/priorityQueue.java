package collectionFramework.queueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        //default behavior -> less value -> higher priority -> min heap

        //if we want to change the priority then
        // Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        // high value -> higher priority -> max heap
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);







    }
}
