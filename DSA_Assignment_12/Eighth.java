class ListNode5 {
    int val;
    ListNode next;

    public ListNode5(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Eighth {
    public static boolean isCircular(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head.next;

        while (fastPtr != null && fastPtr.next != null) {
            if (slowPtr == fastPtr || slowPtr == fastPtr.next) {
                return true; // Linked list is circular
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return false; // Linked list is not circular
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head; // Make the list circular

        boolean isCircular = isCircular(head);
        System.out.println("Is the linked list circular? " + (isCircular ? "Yes" : "No"));
    }
}

