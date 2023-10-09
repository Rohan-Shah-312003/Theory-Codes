package Module_2;

public class Main {
    public static void main(String[] args) throws Exception {
//        Singly_Linked_List sll = new Singly_Linked_List();
//        sll.addFirst(3);
//        sll.addFirst(2);
//        sll.addFirst(1);
//        sll.addFirst(0);
//        sll.addLast(100);
//
//        sll.add(69,3);
//        sll.display();
//        System.out.println(sll.delFirst());
//        sll.display();
//
//        System.out.println(sll.delLast());
//        sll.display();
//        System.out.println(sll.del(3));
//        sll.display();


        // Doubly linked list.
//        Doubly_Linked_List dll = new Doubly_Linked_List();
//        dll.addFirst(1);
//        dll.addFirst(2);
//        dll.addFirst(3);
//        dll.addFirst(4);
//        dll.addFirst(5);
//        dll.addLast(69);
//
//        dll.add(23,1);
//        dll.display();

        // Circular Linked List
//        Circular_Linked_List cll = new Circular_Linked_List();
//        cll.add(12);
//        cll.add(11);
//        cll.add(10);
//        cll.add(9);
//        cll.add(8);
//
//        cll.display();
//
//        cll.delete(10);
//        cll.display();

//        CustomStack customStack = new CustomStack(5);
//        customStack.push(1);
//        customStack.push(2);
//        customStack.push(3);
//        customStack.push(4);
//        customStack.push(5);
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        customStack.display();

        CustomQueue customQueue = new CustomQueue(5);
        customQueue.add(10);
        customQueue.add(20);
        customQueue.add(30);
        customQueue.add(40);
        customQueue.add(50);
        //customQueue.add(69);
        customQueue.display();

        System.out.println(customQueue.remove());

        customQueue.display();

    }
}