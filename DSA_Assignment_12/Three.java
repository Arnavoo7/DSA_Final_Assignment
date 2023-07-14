class ListNode1 {
    int val;
    ListNode next;

    public ListNode1(int val) {
        this.val = val;
    }
}

public class Three {
    public static int findNthFromEnd(ListNode head, int N) {
        if (head == null || N <= 0) {
            return -1;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // Move the fast pointer N positions ahead
        for (int i = 0; i < N; i++) {
            if (fastPtr == null) {
                return -1; // N is greater than the length of the linked list
            }
            fastPtr = fastPtr.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        // At this point, the slow pointer is at the Nth node from the end
        return slowPtr.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(100);
        head.next.next.next = new ListNode(5);


        int N = 5;
        int result = findNthFromEnd(head, N);
        System.out.println("Nth node from the end: " + result);
    }
}