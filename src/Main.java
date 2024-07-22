import linkedlists.LinkedList;

public class Main {
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
//       list.addFirst(9);
//       list.addFirst(10);
//       list.addFirst(11);
//     list.addFirst(11);
//     list.addFirst(12);


       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       list.addLast(50);


//        System.out.println(list.indexOf(50));
        list.reverse();

        System.out.println("Kth term "+ list.kthTerm(3));
//        list.removeFirst();
//        System.out.println(list.contains(10));


       //start from 5.stacks



    }
}