package pl.radox.homework2.OneWayList;

import java.util.Optional;

public class OneWayList {
    Node head = null;

    Node search(int value) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    boolean append(Node newNode){
        if (head==null){
            head=newNode;
            return true;
        }else{
            Node current = head;
            while(current.getNext() != null){
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        return false;
    }

    void insert (int value, int index){
        Node node = new Node(value);
        if (head == null){
            head = node;
        }

    }



}