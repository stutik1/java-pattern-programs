package leetcode.medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the pointer
            prev = current;      // Move pointers one position ahead
            current = next;
        }

        // At the end, prev will point to the new head of the reversed list
        return prev;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        printLinkedList(head);

        // Reverse the linked list
        head = reverse(head);

        System.out.println("\nReversed linked list:");
        printLinkedList(head);
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
