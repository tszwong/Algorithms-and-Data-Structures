import java.util.Iterator;
import java.util.LinkedList;

public class LLQueue {
    private LinkedList<Player> queue;  // linked list for player objects for queue

    public LLQueue() {
        // create new queue
        queue = new LinkedList<>();
    }

    public void add(Player player) {
        queue.add(player);
    }

    public Player remove() {
        Player remove_node = queue.getLast();
        queue.removeFirst();
        return remove_node;
    }

    public Player peek() {
        return queue.getFirst();
    }

    public int getSize() {
        return queue.size();
    }

    public void printQueue() {
        // displaying the linked list
        Iterator iter = queue.iterator();
        System.out.print("HEAD --> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }

        System.out.print("null");
    }
}
