package S03_LinkedList;

public class Q02_InsertionAndDeletion {

    public static Node createLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    // Insertion at the beginning
    public static Node insertAtBeginning(Node head, int data) {
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Insert at the end
    public static Node insertAtEnd(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }

    // Insert at a specific position
    public static Node insertAtPosition(Node head, int position, int data) {
        Node newNode = new Node(data);

        if (position == 0) return insertAtBeginning(head, data);

        Node current = head;
        int count = 0;

        // Traverse to the node just before the position
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // If position is beyond list length
        if (current == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = createLinkedList(arr);
        System.out.println("Before insertion");
        printList(head);
        System.out.println("After insertion");
//        Node newHead = insertAtBeginning(head, 424);
//        Node newHead = insertAtEnd(head, 424);
        Node newHead = insertAtPosition(head, 5, 424);
        printList(newHead);
    }
}
