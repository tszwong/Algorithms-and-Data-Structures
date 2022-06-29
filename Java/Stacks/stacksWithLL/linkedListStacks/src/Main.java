import java.util.LinkedList;

public class Main {
    public static void main(String[] args)  {

        // create Player objects
        Player andrewWiggins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Steph", "Curry", 30);
        Player klayThompson = new Player("Klay", "Thompson", 11);
        Player draymondGreen = new Player("Draymond", "Green", 23);

        LLStack stack = new LLStack();  // create stack
        stack.push(andrewWiggins);
        stack.push(stephCurry);
        stack.push(klayThompson);
        stack.push(draymondGreen);
        stack.printStack();
        System.out.println("Size of stack: "stack.size() + "\n");

        System.out.println("Item poped: " + stack.pop());
        System.out.println();
        stack.printStack();

        stack.peek();
    }
}