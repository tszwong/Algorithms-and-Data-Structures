public class Main {

    public static void main(String[] args) {

        // creating the Player objects
        Player andrewWiggins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Steph", "Curry", 30);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player klayThompson = new Player("Klay", "Thompson", 11);

        // creating a linked list
        PlayerLinkedList list = new PlayerLinkedList();
        // adding the Player objects into the linked list
        list.addToFront(stephCurry);
        list.addToFront(klayThompson);
        list.addToFront(draymondGreen);
        list.addToFront(andrewWiggins);

        list.printList();
        System.out.println("# of elements in list: " + list.getSize());

        // removing a Player object from the front of the list
        list.removeFromFront();
        list.printList();
        System.out.println("# of elements in list: " + list.getSize());

        // removing a Player object from the end of the list
        list.removeFromEnd();
        list.printList();
        System.out.println("# of elements in list: " + list.getSize());
    }

}