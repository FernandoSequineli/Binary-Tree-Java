/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClassTrees;

/**
 *
 * @author fernando
 */
public class app {

    public static void main(String[] args) {
       
        BTNode node1 = new BTNode(50);
        BTNode node2 = new BTNode(25);
        BTNode node3 = new BTNode(75);
        BTNode node4 = new BTNode(12);
        BTNode node5 = new BTNode(30);
        BTNode node6 = new BTNode(60);
        BTNode node7 = new BTNode(80);
        BTNode node8 = new BTNode(26);

        BinaryTree bt = new BinaryTree();

        bt.insertNode(bt.theRoot, node1);
        bt.insertNode(bt.theRoot, node2);
        bt.insertNode(bt.theRoot, node3);
        bt.insertNode(bt.theRoot, node4);
        bt.insertNode(bt.theRoot, node5);
        bt.insertNode(bt.theRoot, node6);
        bt.insertNode(bt.theRoot, node7);
        bt.insertNode(bt.theRoot, node8);

        System.out.println("In order traverse");
        bt.inOrderTraversal(bt.theRoot);

        BTNode temp = bt.root();
        System.out.println("\nRoot Element: " + temp.getElement());

        System.out.println("\nPre order traversal ");
        bt.preOrderTraversal(bt.theRoot);

        System.out.println("\nPost order traversal");
        bt.postOrderTraversal(bt.theRoot);

        BTNode temp2 = bt.search(30, bt.root());
        if (temp2 == null) {
            System.out.println("Not on the tree");
        } else {
            System.out.println("Search: " + temp2.getElement());
        }

    }

}
