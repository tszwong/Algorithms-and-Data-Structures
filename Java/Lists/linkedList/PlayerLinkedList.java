public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNext(head);  // setting the former head to become the next node
        head = node;  // setting the head to the current node that is being inserted
        size++;
    }

    public PlayerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        PlayerNode removeNode = head;
        head = head.getNext();
        size--;
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("Head -->");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");  // indictating the last node of the list

    }
}
