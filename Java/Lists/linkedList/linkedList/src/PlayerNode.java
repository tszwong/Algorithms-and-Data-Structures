public class PlayerNode {

    private Player player;
    private PlayerNode next;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }

    public String toString() {
        return player.toString();
    }

}
