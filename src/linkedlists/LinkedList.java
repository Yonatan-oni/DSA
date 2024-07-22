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
    private Node reverse;


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

    public void reverse(){
        while(last != null){
//            System.out.println(last.value);
            reverse = new Node(last.value, reverse);
            last = last.next;
        }
        last =reverse;
        reverse = null;
    }

    public int kthTerm(int k){
        Node firstPointer = last;
        Node secondPointer = last;

        int stop = 0;
        while (stop != (k-1)) {
            secondPointer = secondPointer.next;
            stop++;
        }
        while (secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

//        System.out.println("Pointers");
//        System.out.println(firstPointer.value);
//        System.out.println(secondPointer.value);

        return firstPointer.value;
    }

}
