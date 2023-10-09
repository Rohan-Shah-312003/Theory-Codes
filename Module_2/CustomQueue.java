package Module_2;

public class CustomQueue {
    int[] data;
    int defaultSize = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this.data = new int[defaultSize];
    }

    boolean isFull() {
        return end == data.length;
    }

    boolean isEmpty() {
        return end == 0;
    }
    public void add(int item) throws Exception{
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = item;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }

        int removed = data[0];

        // left shifting all the elements from the end.
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
