class Fifth{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static int findTheWinner(int n, int k) {
        ListNode head = buildCircularLinkedList(n);

        // Start at friend 1
        ListNode current = head;
        ListNode prev = null;

        while (current.next != current) {
            // Count k-1 friends
            for (int i = 0; i < k - 1; i++) {
                prev = current;
                current = current.next;
            }

            // Remove the friend
            prev.next = current.next;
            current = prev.next;
        }

        // The last friend remaining is the winner
        return current.val;
    }

    private static ListNode buildCircularLinkedList(int n) {
        ListNode head = new ListNode(1);
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        current.next = head; // Make the linked list circular

        return head;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        int winner = findTheWinner(n, k);
        System.out.println("The winner of the game: " + winner);
    }
}