package Module_2;

public class Main {
    public static void main(String[] args) {
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
        Circular_Linked_List cll = new Circular_Linked_List();
        cll.addLast(12);
        cll.addLast(11);
        cll.addLast(10);
        cll.addLast(9);
        cll.addLast(8);

        cll.display();

        cll.delete(10);
        cll.display();
    }
}