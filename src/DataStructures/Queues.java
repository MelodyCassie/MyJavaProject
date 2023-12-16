package DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(5.0);
        queue.offer(4.5);
        queue.offer(1.9);

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
        }
    }
}
