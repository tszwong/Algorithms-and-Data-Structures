import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
    private LinkedList<storedPlayer>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<storedPlayer>();
        }
    }

    public void put(String key, Player player) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new storedPlayer(key, player));
    }

    public Player get(String key) {
        int hashedKey = hashKey(key);  // rehashing key

        ListIterator<storedPlayer> iterator = hashtable[hashedKey].listIterator();
        storedPlayer player = null;

        while (iterator.hasNext()) {
            player = iterator.next();
            if (player.key.equals(key)) {  // searches for key
                return player.player;
            }
        }

        return null;  //  if player object could not be found in the hash table
    }

    public Player remove(String key){
        int hashedKey = hashKey(key);  // rehashing key

        // set the location we look at to the section of the array that contains the
        // linked list with the specific length of the hashed key
        ListIterator<storedPlayer> iterator = hashtable[hashedKey].listIterator();
        storedPlayer player = null;  // initialize player object
        int index = -1;

        while (iterator.hasNext()) {
            player = iterator.next();
            index++;
            if (player.key.equals(key)) {  // check if the KEY matches not hashed key!!
                break;
            }
        }

        if (player == null || !player.key.equals(key)) {  // check if item does not exist
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return player.player;
        }

    }

    private int hashKey(String key) {
        // return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<storedPlayer> iterator = hashtable[i].listIterator();

                while (iterator.hasNext()) {
                    System.out.print(iterator.next().player);
                    System.out.print(" -> ");
                }

                System.out.println("null");
            }
        }
    }

}
