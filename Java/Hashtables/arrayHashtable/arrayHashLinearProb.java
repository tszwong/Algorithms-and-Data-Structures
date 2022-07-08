public class arrayHash {
    private storedPlayer[] hashtable;

    public arrayHash() {
        hashtable = new storedPlayer[8];
    }

    // adding items into the hashtable, implementation doesn't handle collisions
    public void put(String key, Player player) {
        int hashedKey = hashKey(key);  // map key to an int

        if (occupied(hashedKey)) {  // check if current position is ooccupied
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {  // wrap back to the front
                hashedKey = 0;  // reset index
            } else {
                hashedKey++;  // setting the first probe position
            }

            // check array for first unoccupied position
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

        }

        if (occupied(hashedKey)) {  // check if position in array is empty
            System.out.println("Sorry, there's already a player at position "
                                + hashedKey);
        } else {
            hashtable[hashedKey] = new storedPlayer(key, player);
        }
    }

    public Player get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {  // if item does not exist in the hashtable
            return null;
        }
        return hashtable[hashedKey].player;
    }

    public Player remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        } else {
            Player removedPlayer = hashtable[hashedKey].player;
            hashtable[hashedKey] = null;
            storedPlayer[] oldHashtable = hashtable;
            hashtable = new storedPlayer[oldHashtable.length];

            for (int i = 0; i < oldHashtable.length; i++) {
                if (oldHashtable[i] != null) {
                    put(oldHashtable[i].key, oldHashtable[i].player);
                }
            }

            return removedPlayer;
        }
    }

    private int hashKey(String key) {
        // creating hash code for the keys in hashtable
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {  // wrap back to the front
            hashedKey = 0;  // reset index
        } else {
            hashedKey++;  // setting the first probe position
        }

        // check array to see if key with value in the array
        while (hashtable[hashedKey] != null && hashedKey != stopIndex &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null &&  hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    private boolean occupied(int index) {
        // check if something exists at an index in the hashtable
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].player);
            }
        }
    }
}
