public class Main {
    public static void main(String[] args) {
        // creating the Player objects
        Player andrewWiggins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Steph", "Curry", 30);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player klayThompson = new Player("Klay", "Thompson", 11);

        LLQueue queue = new LLQueue();  // create new queue
        // add player objects to queue
        queue.add(andrewWiggins);
        queue.add(stephCurry);
        queue.add(draymondGreen);
        queue.add(klayThompson);
        queue.printQueue();
        System.out.println("\n" + queue.getSize());
        System.out.println();

        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("\n" + queue.getSize());
        System.out.println();

        System.out.println(queue.peek());

    }
}
