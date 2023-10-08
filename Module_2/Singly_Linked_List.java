package Module_2;

public class Singly_Linked_List {

    private Node head;
    private Node tail;
    private int size;

    public Singly_Linked_List () {
        this.size = 0;
    }

    //insert at last - update the tail of the list
    public void addLast (int val) {

        if (tail == null) {
            addFirst(val);
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // insert at beginning - update the head of the list
    public void addFirst (int val) {
        Node node = new Node (val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // insert in the middle - at a particular point
    public void add(int val, int index) {
        if (index == 0) {
            addFirst(val);
        }
        else if (index == size) {
            addLast(val);
        }

        Node temp = head; // creating a new node which will hold the value at the beginning of the LL by default.

        // traversing through the list just and reaching at the index just before the node, after which we need to put the new node.
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // creating new node which will be placed in between the elements.
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int delLast() {
        if (size <= 1) {
            delFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delFirst() {
        int val =  head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int del(int index) {
        if (index == 0) {
            return delFirst();
        }
        if (index == size - 1) {
            return delLast();
        }

        Node prev = get(index - 1);

        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public void display () {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this. next = next;
        }
    }
}