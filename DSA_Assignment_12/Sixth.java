class ListNode4 {
    int val;
    ListNode next;

    public ListNode4(int val) {
        this.val = val;
    }
}

public class Sixth {
    public static ListNode retainAndDelete(ListNode head, int M, int N) {
        if (head == null || M <= 0 || N <= 0) {
            return head;
        }

        ListNode curr = head;
        int count;

        while (curr != null) {
            // Retain M nodes
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                break;
            }

            // Delete N nodes
            ListNode next = curr.next;
            for (count = 1; count <= N && next != null; count++) {
                next = next.next;
            }

            curr.next = next; // Connect the last retained node to the next node after deleted nodes
            curr = next; // Move to the next retained node
        }

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
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);
        head1.next.next.next.next.next.next = new ListNode(7);
        head1.next.next.next.next.next.next.next = new ListNode(8);

        System.out.println("Original linked list:");
        printLinkedList(head1);

        int M1 = 2;
        int N1 = 2;
        ListNode modifiedHead1 = retainAndDelete(head1, M1, N1);

        System.out.println("Modified linked list:");
        printLinkedList(modifiedHead1);

    }
}
