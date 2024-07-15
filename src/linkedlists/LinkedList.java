package linkedlists;

import java.util.ArrayList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    private Node first;
    private Node last;

    private ArrayList<Node> output = new ArrayList<>();


    public void addFirst(int item){
        if(first == null)
            last = first = new Node(item, null);
        else
            first = new Node(item, first);
    }

    public void addLast(int item){
//        if(first == null)
//            first = last = new Node(item, null);
//        else
            last = new Node(item, last);

    }

}
