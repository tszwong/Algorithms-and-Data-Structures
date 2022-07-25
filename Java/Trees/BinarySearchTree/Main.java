public class Main {
    public static void main(String[] args) {

        Tree intTree = new Tree();  // creating new tree

        // adding elements to tree
        intTree.insert(25);  // root node
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
    }
}
