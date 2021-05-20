package base;

public class Main {

    public static void main(String[] args) {
        BST BT = new BST();

        BT.insert(5);
        BT.insert(9);
        BT.insert(4);
        BT.insert(1);
        BT.insert(7);
        BT.insert(2);
        BT.insert(3);

        BT.implementSearch(10);
        System.out.println("Smallest Element: " + BT.smallestElement());
        System.out.println("Root: " + BT.root.num);
        System.out.println("Largest Element: " + BT.largestElement());
        int nTh = 5;
        System.out.println(nTh + "th Largest Element: " + BT.NthLargestElement(BT.root, nTh).num);
        BT.deleteNode(BT.root, 4);
        System.out.print("Reorganized root: ");
        BT.printRoot();
        System.out.println("Height: " + BT.height(BT.root));

        System.out.println("In-order Traversal");
        BT.inorderTraversal(BT.root);
        System.out.println("\nPreorder Traversal");
        BT.preorderTraversal(BT.root);
        System.out.println("\nPostorder Traversal");
        BT.postorderTraversal(BT.root);

        System.out.println("\nBreadth First Traversal");
        BT.breadthFirst(BT.root);
    }

}
