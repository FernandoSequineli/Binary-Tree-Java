public class BTNode {

    private int element;
    private BTNode leftChild;
    private BTNode rightChild;

    public BTNode(int theValue) {
        element = theValue;
        leftChild = null;
        rightChild = null;

    }

    public boolean isLeaf() {
        return ((leftChild == null) && (rightChild == null));
    }

    public boolean isInternal() {
        if ((leftChild != null) || (rightChild != null)) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BTNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BTNode leftChild) {
        this.leftChild = leftChild;
    }

    public BTNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BTNode rightChild) {
        this.rightChild = rightChild;
    }

}
