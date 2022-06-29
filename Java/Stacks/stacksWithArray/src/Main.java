public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);  // create stack

        // adding Player objects into array
        stack.push(new Player("Steph", "Curry", 30));
        stack.push(new Player("Klay", "Thompson", 11));
        stack.push(new Player("Draymond", "Green", 23));

        stack.printStack();
        System.out.println(stack.size());
        System.out.println("\n" + stack.peek() + "\n");

        stack.pop();
        stack.printStack();
        System.out.println(stack.size());
    }
}