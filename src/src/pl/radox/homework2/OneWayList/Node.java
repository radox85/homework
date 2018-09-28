package pl.radox.homework2.OneWayList;

public class Node{
    private final int value;
    private Node next = null;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;

    }

    public void setNext(Node next) {
        this.next = next;
    }


}