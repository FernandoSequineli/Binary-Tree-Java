public class BinaryTree {

    public BTNode theRoot;

    public BinaryTree() {
        theRoot = null; //empty tree

    }

    public BTNode root() {
        return theRoot;

    }

    public boolean isEmpty() {
        if (theRoot == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertNode(BTNode startNode, BTNode newNode) {
        if (theRoot == null) { //the root is null
            theRoot = newNode;
        } else { // find the location and insert the new node to a non-empty tree 
            //newNode  > startNode
            if (newNode.getElement() > startNode.getElement()) {
                //then it goes on right but need to check if the node if null
                if (startNode.getRightChild() == null) {
                    startNode.setRightChild(newNode);
                } else {
                    insertNode(startNode.getRightChild(), newNode);
                    //getRightChild and send it back to the method and get the next right
                }
                //newNode < startNode
            } else if (newNode.getElement() < startNode.getElement()) {
                if (startNode.getLeftChild() == null) {
                    //if the startNode has no left child then newNode becomes the leftChild
                    startNode.setLeftChild(newNode);
                } else {
                    insertNode(startNode.getLeftChild(), newNode);
                }
            } else if (newNode.getElement() == startNode.getElement()) {
                System.out.println("the node " + startNode.getElement() + "was alredy inserted.");
            }

        }

    }

    public BTNode search(int searchTerm, BTNode startNode) {
        //search base on the Binary Search Tree, searchTerm < node search left
        //if searchTerm > node, search right
        if (startNode == null) {
            return null;
        } else {
            if (searchTerm == startNode.getElement()) {
                return startNode;
            } else if (searchTerm < startNode.getElement()) {
                return search(searchTerm, startNode.getLeftChild());
            } else {
                return search(searchTerm, startNode.getRightChild());
            }

        }

    }

    //in order traversal to parse the tree and print elements
    public void inOrderTraversal(BTNode node) {
        if (node == null) {
            return;
        } else {
            inOrderTraversal(node.getLeftChild());
            System.out.println("Node " + node.getElement());
            inOrderTraversal(node.getRightChild());
        }
    }

    public void preOrderTraversal(BTNode node) {
        if (node == null) {
            return;
        } else {
            System.out.println("Node " + node.getElement());
            preOrderTraversal(node.getLeftChild());
            preOrderTraversal(node.getRightChild());

        }

    }

    public void postOrderTraversal(BTNode node) {
        if (node == null) {
            return;
        } else {
            postOrderTraversal(node.getLeftChild());
            postOrderTraversal(node.getRightChild());
            System.out.println("Node " + node.getElement());
        }
    }

}
