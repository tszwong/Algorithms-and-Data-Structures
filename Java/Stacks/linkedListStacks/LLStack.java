import java.util.LinkedList;
import java.util.ListIterator;

public class LLStack {
    private LinkedList<Player> stack;  // the linked list that will back the stack

    public LLStack() {  // constructor
        stack = new LinkedList<>();
    }

    public void push(Player player) {
        stack.push(player);
    }

    public Player pop() {
        return stack.pop();
    }

    public Player peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.toArray().length;
    }

    public void printStack() {
        ListIterator<Player> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
