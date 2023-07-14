class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class One{

    public static ListNode deleteMiddleNode(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode prevPtr = null;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
        }

        prevPtr.next = slowPtr.next;
        slowPtr.next = null;

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);

        System.out.println("Original linked list:");
        printLinkedList(head);

        head = deleteMiddleNode(head);

        System.out.println("Modified linked list:");
        printLinkedList(head);
    }
}


