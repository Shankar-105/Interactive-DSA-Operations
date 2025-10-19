import java.util.*;
import java.io.*;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class CircularLinkedList {
    Node head = null;
    Node tail = null;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    void delete(int key) {
        if (head == null) return;
        Node current = head, prev = tail;
        if (head.data == key) {
            if (head == tail) {  
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            if (current.data == key) {
                prev.next = current.next;
                if (current == tail) tail = prev;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }
}

public class MyCLL{
    public static void main(String[] s){
      CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        System.out.println("Circular Linked List:");
        cll.display();
        cll.delete(20);
        System.out.println("After deleting 20:");
        cll.display();
    }
}