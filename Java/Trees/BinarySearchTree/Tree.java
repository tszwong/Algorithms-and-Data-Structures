public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {  // if empty tree then node inserting will be root node
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
