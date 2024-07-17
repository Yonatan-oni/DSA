package linkedlists;

import java.util.ArrayList;
import java.util.NoSuchElementException;

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

    private final ArrayList<Node> nodes = new ArrayList<>();


    public void addFirst(int item){
        if(first == null) {
            last = first = new Node(item, null);
            nodes.addFirst(first);
        }else {
            first = new Node(item, first);
            nodes.addFirst(first);
        }
    }

    public void addLast(int item){
            last = new Node(item, last);
            nodes.addLast(last);
    }

    int index = 0;
    public int indexOf(int item){
//        for(Node node : nodes){
//            if (node.value == item)
//                return index;
//            index++;
//        }

        var current = last;
        while (current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current = last;
        while (current != null){
            if(current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){


        if( first != null)  {
            var second = first.next;
            first.next = null;
            first = second;
        }else throw new NoSuchElementException();


    }

}
