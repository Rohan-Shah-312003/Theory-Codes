package Module_2;

import java.util.*;
public class SinglyLinkedList_Inbuilt {
    public static void main(String[] args) {
        function();
    }
    static void function() {
        LinkedList<Integer> ll = new LinkedList<>();

        // using linked list as a stack.
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);

        System.out.println(ll.pop());

        System.out.println("ll = " + ll);

        ll.clear(); // clearing the linked list

        // using linked list as a queue

        ll.offer(1);
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        ll.offer(4);
        ll.offer(5);

        System.out.println("ll = " + ll);
        System.out.println(ll.poll()); // to remove the first element from the queue (linked list)

        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        ll.addFirst(0);
        ll.addLast(ll.size());
        ll.add(4,3);

        System.out.println("ll = " + ll);
    }
}
