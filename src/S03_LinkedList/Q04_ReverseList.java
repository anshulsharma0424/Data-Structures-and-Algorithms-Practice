package S03_LinkedList;

import static S03_LinkedList.Q01_Introduction.createLinkedList;
import static S03_LinkedList.Q01_Introduction.printList;

public class Q04_ReverseList {
    // iterative way of reverse a linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = createLinkedList(arr);
        Node newHead = reverseList(head);
        printList(newHead);
    }
}