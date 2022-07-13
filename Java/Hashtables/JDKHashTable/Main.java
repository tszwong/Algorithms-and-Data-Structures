import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // create player objects
        Player stephCurry = new Player("Stephen", "Curry", 30);
        Player sethCurry = new Player("Seth", "Curry", 31);
        Player klayThompson = new Player("Klay", "Thompson", 11);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player andrewWiggins = new Player("Andrew", "Wiggins", 3);

        // create hashtable and use simple methods
        Map<String, Player> hashMap = new HashMap<String, Player>();
        hashMap.put("Curry", stephCurry);
        hashMap.put("Thompson", klayThompson);
        hashMap.put("Green", draymondGreen);
        hashMap.put("Wiggins", andrewWiggins);
        hashMap.put("Curry", sethCurry);

        System.out.println("Removed: " + hashMap.remove("Green"));
        System.out.println("Retrieved: " + hashMap.get("Wiggins") + "\n");

        Iterator<Player> iter = hashMap.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // hashMap.forEach((key, value) -> System.out.println("Key = " + k + ", Player = " + value));

    }
}
