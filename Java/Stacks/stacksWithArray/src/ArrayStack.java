import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;

    // next available position in stack or # objects in stack,
    // stack[top - 1] is the object at the top of stack
    private int top;

    public ArrayStack(int capacity) {
        stack = new Player[capacity];
    }

    public void push(Player player) {
        if (top == stack.length) {  // check if the stack is full
            // resize the backing array
            Player[] newArray = new Player[2 * stack.length];  // double the length of array
            System.arraycopy(stack, 0, newArray, 0, stack.length);  // copying objects from original array
            stack = newArray;
        }

        // insert the player object at the top of stack
        stack[top++] = player;  // inserting one index above the top index
    }

    public Player pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Player player = stack[top];  // select the top stack
        top--;  // decrement the index of stack
        stack[top] = null;  // remove the stack

        return player;
    }

    public Player peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Player topOfStack = stack[top - 1];
        return topOfStack;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        // printing stack from top down
        for (int i = top - 1; i >= 0; i --) {
            System.out.println(stack[i]);
        }
    }

}
