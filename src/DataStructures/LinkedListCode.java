package DataStructures;

import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        System.out.println(linkedList.poll());

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");

        System.out.println(linkedList.pop());

    }
}
