package base;

public class Main {

    public static void main(String[] args) {
        Node first = new Node( 1);
        Node second = new Node(  2);
        Node third = new Node(  3);
        Node fourth = new Node(  4);

        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;
    }
}
// Main class
