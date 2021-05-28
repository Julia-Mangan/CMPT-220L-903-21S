package base;

import java.util.Queue;
import java.util.LinkedList;

public class BST {
    Node root;
// Insert Element into the BST
    private Node insertElement(Node current, int num) {
        if (current == null) {
            return new Node(num);
        }
// values less than the root go on the left
        if (num < current.num) {
            current.leftChild = insertElement(current.leftChild, num);
// values greater than the root go on the right
        } else if (num > current.num) {
            current.rightChild = insertElement(current.rightChild, num);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    // prints root
    public void printRoot() {
        System.out.println(root.num);
    }


    public void insert(int value) {
        root = insertElement(root, value);
    }

// Find element
// Tells if value is a node or not in the BST
    public void search(Node current, int num) {
        if (current == null) {
            System.out.println(num + " is not part of the Binary Search Tree.");
        } else {
            if (num > current.num) {
                search(current.rightChild, num);
            }
            if (num < current.num) {
                search(current.leftChild, num);
            }
            if (num == current.num) {
                System.out.println(num + " is part of the Binary Search Tree.");
            }
        }
    }
    public void implementSearch(int num){
        search(root, num);
    }
    public int height(Node root)
    {
        //Find height of tree
        if(root == null){
            return 0;
        }
        else{
            int left = height(root.leftChild);
            int right = height(root.rightChild);
            if(left > right){
                return 1 + left;
            }
            //add 1 to accommodate for the root
            else{
                return 1 + right;
            }
        }
    }
    //Find smallest element
    //Smallest child is on the left of the tree
    public int findSmallestElement(Node cur) {
        Node current = cur;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
    //If there is no left child, return the root
        return current.num;
    }
    public int smallestElement() {
        return findSmallestElement(this.root);
    }
    //Find largest element
    //Largest element is on the right of the tree
    public int largestElement() {
        Node current = this.root;
        while (current.rightChild != null) {
            current = current.rightChild;
        }
    //If there is no right child, return the root
        return current.num;
    }

//Find the Nth largest element
    public void NthLargest(int Nth){
        this.NthLargestElement(this.root, Nth);
    }

    public Node NthLargestElement(Node root, int Nth) {
        Node current = root;
        Node NthLargest = null;

        int count = 0;
        // if current is not null
        while (current != null) {
            // if right child is null
            if (current.rightChild == null) {

                if (++count == Nth)
                    NthLargest = current;

                //stop looking at right and look at left
                current = current.leftChild;
            } else {

                Node order = current.rightChild;

                while (order.leftChild != null && order.leftChild != current)
                    order = order.leftChild;

                if (order.leftChild == null) {

                    order.leftChild = current;

                    // move current to its right
                    current = current.rightChild;
                }

                else {

                    order.leftChild = null;

                    if (++count == Nth)
                        NthLargest = current;

                    current = current.leftChild;
                }
            }
        }
        return NthLargest;
    }
    // delete nodes from BST
    public Node deleteNode(Node root, int data) {

        if(root == null) return root;

        if(data < root.num) {
            //delete leftChild
            root.leftChild = deleteNode(root.leftChild, data);
        } else if(data > root.num) {
            //delete rightChild
            root.rightChild = deleteNode(root.rightChild, data);
        } else {
            // node with no leaf nodes
            if(root.leftChild == null && root.rightChild == null) {
                System.out.println("deleting "+data);
                return null;
            } else if(root.leftChild == null) {
                // node with one node (no left node)
                System.out.println("deleting "+data);
                return root.rightChild;
            } else if(root.rightChild == null) {
                // node with one node (no right node)
                System.out.println("deleting "+data);
                return root.leftChild;
            } else {
                // tree reorganization
                Integer minValue = findSmallestElement(root.rightChild);
                root.num = minValue;
                root.rightChild = deleteNode(root.rightChild, minValue);
                System.out.println("deleting "+data);
            }
        }
//There will be a new root if current root is deleted
        return root;
    }
//In order Traversal
//Depth first search is the same as the three Traversals
    public void inorderTraversal(Node root)
    {
        if (root == null)
            return;

//        look for smallest number, go to the left
        inorderTraversal(root.leftChild);

//        once there are no left children... print
        System.out.print(root.num + " ");

//        search for the right children
        inorderTraversal(root.rightChild);
    }
// Post order traversal
    public void postorderTraversal(Node root) {
        if (root == null)
            return;

//        move all the way to the left most node
        postorderTraversal(root.leftChild);

//        once there are no more left node move as far right as possible
        postorderTraversal(root.rightChild);

//        print the leaves first and move up the tree
        System.out.print(root.num + " ");
    }
// Pre order traversal
    public void preorderTraversal(Node root)
    {
        if (root == null)
            return;

//        print the root first
        System.out.print(root.num + " ");

//        look for all left children to print the root of those first
        preorderTraversal(root.leftChild);

//        look right once we can find more left children
        preorderTraversal(root.rightChild);
    }

//    Need a queue for proper traversal
    Queue<Node> queue = new LinkedList<Node>();
    public void breadthFirst(Node root) {
        if (root == null)
            return;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.num + " ");
            if(node.leftChild != null) queue.add(node.leftChild);
            if(node.rightChild != null) queue.add(node.rightChild);
        }

    }
}



