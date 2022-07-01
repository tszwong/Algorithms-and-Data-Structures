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
        if (size() == queue.length - 1) {  // check if the array is full
            int curr_size = size();

            // creating a new array with a new length and copy the objects over
            Player[] newArray = new Player[2 * queue.length];

            // copying the items from front to end of queue to new array
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            // copying the items from beginning of queue to back to new array
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            front = 0;  // wrap front pointer to 0
            back = curr_size;  // wrap the back pointer to the last item in queue
        }

        queue[back] = player;  // add the object into array
        if (back < queue.length - 1) {
            back++;   // increment the back pointer
        } else {
            back = 0;  // wrap the queue back to front, set the back pointer to front of queue
        }
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

        // if there are more items left in queue and the front pointer is
        // at the back of the queue
        else if (front == queue.length) {
            front = 0;  // wrap front back to 0
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
        if (front <= back) {  // if the queue is not wrapped
            return back - front;
        } else {
            // since it's been wrapped hence the front pointer is greater than the back pointer
            // we need to adjust the negative number of items by adding the length of the queue
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if (front <= back) {  // if the queue is not wrapped
            for (int i = front; i < back; i++) {  // i < back because the last object is at back - 1
                System.out.println(queue[i]);
            }
        } else {  // wrapped queue --> front pointer > back pointer
            for (int i = front; i < queue.length; i++) {  // print items from front pointer to end of queue
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {  // print items from first item of queue to the back pointer of queue
                System.out.println(queue[i]);
            }
        }
    }

}
