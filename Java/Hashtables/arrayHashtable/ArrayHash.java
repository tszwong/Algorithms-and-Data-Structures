public class arrayHash {
    private Player[] hashtable;

    public arrayHash() {
        hashtable = new Player[8];
    }

    // adding items into the hashtable, implementation doesn't handle collisions
    public void put(String key, Player player) {
        int hashedKey = hashKey(key);  // map key to an int
        if (hashtable[hashedKey] != null) {  // check if position in array is empty
            System.out.println("Sorry, there's already a player at position "
                                + hashedKey);
        } else {
            hashtable[hashedKey] = player;
        }
    }

    public Player get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        // creating hash code for the keys in hashtable
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
