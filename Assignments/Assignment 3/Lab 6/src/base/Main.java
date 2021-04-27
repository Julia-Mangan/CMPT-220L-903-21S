package base;

public class Main {

    public static void main(String[] args) {
        Node first = new Node( value: 1);
        Node second = new Node( value: 2);
        Node third = new Node( value: 3);
        Node fourth = new Node( value: 4);

        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;
    }
}
