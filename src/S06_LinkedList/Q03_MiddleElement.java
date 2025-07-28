package S06_LinkedList;

public class Q03_MiddleElement {

    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static int middleElement(Node head) {
        if(head == null) return -1;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {};

        Node head = createLinkedList(arr);
        Node head2 = createLinkedList(arr2);

        System.out.println(middleElement(head));
        System.out.println(middleElement(head2));
    }
}
