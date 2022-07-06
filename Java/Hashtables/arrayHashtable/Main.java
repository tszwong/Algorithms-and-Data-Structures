public class Main {
    public static void main(String[] args) {

        // create player objects
        Player stephCurry = new Player("Stephen", "Curry", 30);
        Player klayThompson = new Player("Klay", "Thompson", 11);
        Player draymondGreen = new Player("Draymond", "Green", 23);
        Player andrewWiggins = new Player("Andrew", "Wiggins", 3);

        // create hashtable and use methods
        arrayHash hashtable = new arrayHash();
        hashtable.put("Curry", stephCurry);
        hashtable.put("Thompson", klayThompson);
        hashtable.put("Green", draymondGreen);  // collision caused with Player Curry
        hashtable.put("Wiggins", andrewWiggins);
        hashtable.printHashtable();

        System.out.println("\nRetrive: " + hashtable.get("Curry"));

    }
}
