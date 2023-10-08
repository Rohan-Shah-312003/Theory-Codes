package Module_2;

public class Circular_Linked_List {

    private Node head;
    private Node tail;

    public Circular_Linked_List() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display() {
        Node node = head;
        do {
            System.out.print(node.val + " -> ");
            node = node.next;
        } while (node != head);

        System.out.println("HEAD");
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }

            node = node.next;
        }

        return null;
    }
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        // if the value we are deleting is at the head of the c - list.
        if (node.val == val) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
