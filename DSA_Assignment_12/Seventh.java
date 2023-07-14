class ListNode7 {
    int val;
    ListNode next;

    public ListNode7(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Seventh{
    public static void insertAlternate(ListNode first, ListNode second) {
        if (first == null || second == null) {
            return;
        }

        ListNode firstPtr = first;
        ListNode secondPtr = second;

        while (firstPtr != null && secondPtr != null) {
            ListNode firstNext = firstPtr.next;
            ListNode secondNext = secondPtr.next;

            firstPtr.next = secondPtr;
            secondPtr.next = firstNext;

            firstPtr = firstNext;
            secondPtr = secondNext;
        }

        second = secondPtr; // Empty the second list
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
        ListNode first = new ListNode(5);
        first.next = new ListNode(7);
        first.next.next = new ListNode(17);
        first.next.next.next = new ListNode(13);
        first.next.next.next.next = new ListNode(11);

        ListNode second = new ListNode(12);
        second.next = new ListNode(10);
        second.next.next = new ListNode(2);
        second.next.next.next = new ListNode(4);
        second.next.next.next.next = new ListNode(6);

        System.out.println("First linked list:");
        printLinkedList(first);
        System.out.println("Second linked list:");
        printLinkedList(second);

        insertAlternate(first, second);

        System.out.println("Modified first linked list:");
        printLinkedList(first);
        System.out.println("Modified second linked list:");
        printLinkedList(second);
    }
}
