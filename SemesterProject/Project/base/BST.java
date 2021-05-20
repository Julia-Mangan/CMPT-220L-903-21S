package base;

import java.util.Queue;
import java.util.LinkedList;

public class BST {
    Node root;

    private Node insertElement(Node current, int num) {
        if (current == null) {
            return new Node(num);
        }

        if (num < current.num) {
            current.leftChild = insertElement(current.leftChild, num);
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
            else{
                return 1 + right;
            }
        }
    }
    //Find smallest element
    public int findSmallestElement(Node cur) {
        Node current = cur;
        while (current.leftChild != null) {
            current = current.leftChild;
        }

        return current.num;
    }
    public int smallestElement() {
        return findSmallestElement(this.root);
    }
    //Find largest element
    public int largestElement() {
        Node current = this.root;
        while (current.rightChild != null) {
            current = current.rightChild;
        }

        return current.num;
    }


    public void NthLargest(int Nth){
        this.NthLargestElement(this.root, Nth);
    }

    public Node NthLargestElement(Node root, int Nth) {
        Node current = root;
        Node NthLargest = null;

        // count variable to keep count of visited Nodes
        int count = 0;

        while (current != null) {
            // if right child is NULL
            if (current.rightChild == null) {

                // first increment count and check if count = k
                if (++count == Nth)
                    NthLargest = current;

                // otherwise move to the left child
                current = current.leftChild;
            } else {

                // find inorder successor of current Node
                Node order = current.rightChild;

                while (order.leftChild != null && order.leftChild != current)
                    order = order.leftChild;

                if (order.leftChild == null) {

                    // set left child of successor to the
                    // current Node
                    order.leftChild = current;

                    // move current to its right
                    current = current.rightChild;
                }

                // restoring the tree back to original binary
                // search tree removing threaded links
                else {

                    order.leftChild = null;

                    if (++count == Nth)
                        NthLargest = current;

                    // move current to its left child
                    current = current.leftChild;
                }
            }
        }
        return NthLargest;
    }
    public Node deleteNode(Node root, int data) {

        if(root == null) return root;

        if(data < root.num) {
            root.leftChild = deleteNode(root.leftChild, data);
        } else if(data > root.num) {
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

        return root;
    }

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



