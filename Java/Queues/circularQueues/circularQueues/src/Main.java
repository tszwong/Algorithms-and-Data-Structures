public class Main {
    public static void main(String[] args) {
        
        // creating player objects
        Player andrewWiggins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Stephen", "Curry", 30);
        Player klayThompson = new Player("Klay", "Thompson", 11);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player jordanPoole = new Player("Jordan", "Poole", 3);

        // creating the queue and adding player objects
        ArrayQueue queue = new ArrayQueue(5);
        queue.add(andrewWiggins);
        queue.add(stephCurry);
        queue.add(klayThompson);
        queue.add(draymondGreen);
        queue.printQueue();
        System.out.println();

        // removing a player from queue
        queue.remove();
        queue.printQueue();
        System.out.println();

        // peek
        System.out.println(queue.peek() + "\n");

        // wrap scenario
        ArrayQueue queue2 = new ArrayQueue(5);
        queue2.add(andrewWiggins);
        queue2.add(stephCurry);
        queue2.remove();
        queue2.add(klayThompson);
        queue2.remove();
        queue2.add(draymondGreen);
        queue2.remove();
        queue2.add(jordanPoole);
        queue2.remove();
        queue2.add(andrewWiggins);
        queue2.printQueue();
    }
}