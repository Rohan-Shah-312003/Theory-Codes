package Module_2;

public class CustomStack {
    int[] data;
    int defaultSize = 10;
    int ptr = -1;
    public CustomStack() {
        this.data = new int[defaultSize];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    // when stack is full
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    // when stack is empty
    public boolean isEmpty() {
        return ptr == -1;
    }
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        ptr++;
        data[ptr] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is already empty.");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is already empty.");
        }
        return data[ptr];
    }
    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
