package LinkedList;

import org.w3c.dom.Node;

public class basicLL {
    public static class Node{
        int data;  //value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
       // System.out.println(a.next);  //null
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        System.out.println(a);
//        System.out.println(a.next); //$Node@1b28cdfa
//        System.out.println(b); //$Node@1b28cdfa
//        System.out.println(c); //$Node@eed1f14
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(b.next.data);
        System.out.println(c.next.data);
        System.out.println(d.next.data);
        System.out.println(e.next.data);
        System.out.println(f.data);
    }
}
