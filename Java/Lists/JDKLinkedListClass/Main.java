import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // creating the Player objects
        Player andrewWiggins = new Player("Andrew", "Wiggins", 22);
        Player stephCurry = new Player("Steph", "Curry", 30);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player klayThompson = new Player("Klay", "Thompson", 11);

        // creating a linked list for Player objects
        LinkedList<Player> list = new LinkedList<>();

        // adding or removing Player objects from list
        list.addFirst(andrewWiggins);
        list.addLast(stephCurry);
        list.addFirst(draymondGreen);
        list.addFirst(klayThompson);
        list.removeFirst();
        list.removeFirst();

        // displaying the linked list
        Iterator iter = list.iterator();
        System.out.print("HEAD --> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        
        System.out.print("null");

//        for (Player player: list) {
//            System.out.print(player);
//        }
    }

}
