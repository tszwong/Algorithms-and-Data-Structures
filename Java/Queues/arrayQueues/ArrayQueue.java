import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;

    private int back;
    // pointing at next available position at back of queue
    // back - 1 is where the last object in the array is at

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];  // create array for queue
    }

    public void add(Player player) {
        if (back == queue.length) {  // check if the array is full
            // creating a new array with a new length and copy the objects over
            Player[] newArray = new Player[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
        }

        queue[back] = player;  // add the object into array
        back++;  // increment the back pointer
    }

    public Player remove() {
        if (size() == 0) {  // check if array is empty
            throw new NoSuchElementException();
        }

        Player removed_player = queue[front];
        queue[front] = null;  // remove the object by setting it to null
        front++;  // increment front pointer

        if (size() == 0) {  // reset the queue, if only object of queue is removed
            front = 0;
            back = 0;
        }

        return removed_player;
    }

    public Player peek() {
        if (size() == 0) {  // check if array is empty
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {  // i < back because the last object is at back - 1
            System.out.println(queue[i]);
        }
    }

}
