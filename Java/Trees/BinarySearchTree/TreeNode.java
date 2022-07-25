public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value) {
        if (value == data) {  // checking to see if value is a duplicate
            return;
        }

        if (value < data) {  // left side of tree
            if (leftChild == null) {  // insert the value as the left child
                leftChild = new TreeNode(value);
            } else {
                // when there is a node in the left subtree
                // compare the value to the left child and
                leftChild.insert(value);
            }
        }
        else {  // right side of tree
            if (rightChild == null) {   // insert the value as the right child
                rightChild = new TreeNode(value);
            } else {
                // when there is a node in the right subtree
                // compare the value to the right child and
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {  // check left subtree for the node first
            leftChild.traverseInOrder();
        }

        System.out.println(data + ", ");  // display nodes

        if (rightChild != null) {  // check right subtree second
            rightChild.traverseInOrder();
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
