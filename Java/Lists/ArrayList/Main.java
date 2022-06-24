import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();  // creating an ArrayList object

        // using the ArrayList add function to add new Player objects
        playerList.add(new Player("Stephen", "Curry", 30));
        playerList.add(new Player("Klay", "Thompson", 11));
        playerList.add(new Player("Andrew", "Wiggins", 22));
        playerList.add(new Player("Draymond", "Green", 23));
        playerList.add(new Player("Jordan", "Poole", 3));

        // lambda expression, print for each player in the list
        playerList.forEach(player -> System.out.println(player));

        // getting an element from the list using index
        // time complexity O(1), good for accessing large data sets
        System.out.println(playerList.get(3));

        // check is list is empty
        System.out.println(playerList.isEmpty());

        // replacing an element in the list, also O(1)
        playerList.set(3,new Player("Giannis", "Antetokoumpo", 34));
        playerList.forEach(player -> System.out.println(player));

        // tell us how many player objects we have
        System.out.println(playerList.size());

        // get array version of the list
        Player[] playerArray = playerList.toArray(new Player[playerList.size()]);
        for (Player player: playerArray) {
            System.out.println(player);
        }

        System.out.println(playerList.contains(new Player("Andrew", "Wiggins", 22)));
        System.out.println(playerList.indexOf(new Player("Andrew", "Wiggins", 22)));

        playerList.remove(3);
        playerList.forEach(player -> System.out.println(player));


    }
}
