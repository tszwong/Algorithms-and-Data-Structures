public class Main {

    public static void main(String[] args) {

        Player andrewWiggnins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Steph", "Curry", 30);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player klayThompson = new Player("Klay", "Thompson", 11);

        PlayerLinkedList list = new PlayerLinkedList();
        list.addToFront(stephCurry);
        list.addToFront(klayThompson);
        list.addToFront(draymondGreen);
        list.addToFront(andrewWiggnins);

        list.printList();
        System.out.println("# of elements in list: " + list.getSize());
    }

}