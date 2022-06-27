public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;
    private int size;

    public void addToFront(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNext(head);  // setting the former head to become the next node

        // checking if we are adding to an empty list, isEmpty()
        if (head == null) {
            tail = node;
        } else {
            // setting the former head node's previous field to the new node we are adding
            head.setPrevious(node);
        }

        head = node;  // setting the head to the current node that is being inserted
        size++;
    }

    public void addToEnd(Player player) {
        PlayerNode node = new PlayerNode(player);

        if (tail == null) {  // checking for empty list
            head = node;
        } else {
            tail.setNext(node);  // setting current tail's next field to the node we are adding
            node.setPrevious(tail);  // setting the previous field of the node we are adding to the former tail
        }

        tail = node;  // setting the new tail pointer to the new node
        size++;
    }

    public PlayerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        // the selected node will be removed --> garbage collection
        PlayerNode removeNode = head;

        // checking if we are dealing with a list that only has one node
        if (head.getNext() == null) {
            tail = null;  // make the tail null if removing only node of list
        } else {
            head.getNext().setPrevious(null);  // setting the new head's previous to null
        }

        head = head.getNext();
        size--;
        return removeNode;
    }

    public PlayerNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        // the selected node will be removed --> garbage collection
        PlayerNode removeNode = tail;

        // checking if we are dealing with a list that only has one node
        if (tail.getPrevious() == null) {
            head = null;  // make the head null if removing only node of list
        } else {
            tail.getPrevious().setNext(null); // setting the new tail's next to null
        }

        tail = tail.getPrevious();
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
        System.out.print("Head --> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }

        System.out.println("null");  // indictating the last node of the list

    }
}
