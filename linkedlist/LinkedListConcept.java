package linkedlist;
class ListNode{
    int val ;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListConcept {
    public static void create(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        create(head);

    }
}
